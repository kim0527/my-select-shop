package com.sparta.myselectshop.scheduler;

import com.sparta.myselectshop.external.naver.dto.ItemDto;
import com.sparta.myselectshop.external.naver.service.NaverApiService;
import com.sparta.myselectshop.product.Product;
import com.sparta.myselectshop.product.repository.ProductRepository;
import com.sparta.myselectshop.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j(topic = "Scheduler")
@Component
@RequiredArgsConstructor
public class Scheduler {

    private final NaverApiService naverApiService;
    private final ProductService productService;
    private final ProductRepository productRepository;

    // 초, 분, 시, 일, 월, 주 순서
    @Scheduled(cron = "0 0 1 * * *") // 매일 새벽 1시
    public void updatePrice() throws InterruptedException {
        log.info("가격 업데이트 실행");
        List<Product> productList = productRepository.findAll();

        productList.stream()
                .forEachOrdered(product -> {
                    try {
                        // 1초에 한 상품씩 조회 (NAVER 제한)
                        TimeUnit.SECONDS.sleep(1);

                        // 상품 제목으로 검색 실행
                        String title = product.getTitle();
                        List<ItemDto> itemDtoList = naverApiService.searchItems(title);

                        if (!itemDtoList.isEmpty()) {
                            ItemDto itemDto = itemDtoList.get(0);
                            Long id = product.getId();
                            try {
                                productService.updateBySearch(id, itemDto);
                            } catch (Exception e) {
                                log.error(id + " : " + e.getMessage());
                            }
                        }

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        log.error("Thread interrupted: " + e.getMessage());
                    }
                });
    }

}