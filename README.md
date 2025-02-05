## 🛍️ MY Select Shop
Naver 검색 API를 통해 상품을 검색하고, 관심상품을 관리하는 서비스

## 🚀 주요 기능

- [x] 회원 기능
- [x] 상품 검색 (NAVER API)
- [x] 관심 상품 등록
- [x] 관심 상품 가격 업데이트 (Scheduler)
- [x] 관심 상품 페이징 및 정렬
- [x] 관심 상품 폴더

## 📌 프로젝트 구조

```
📦 
├─ .gitattributes
├─ .gitignore
├─ build.gradle
├─ settings.gradle
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ sparta
   │  │        └─ myselectshop
   │  │           ├─ MyselectshopApplication.java
   │  │           ├─ auth
   │  │           │  ├─ config
   │  │           │  │  └─ WebSecurityConfig.java
   │  │           │  ├─ filter
   │  │           │  │  ├─ JwtAuthenticationFilter.java
   │  │           │  │  ├─ JwtAuthorizationFilter.java
   │  │           │  │  └─ dto
   │  │           │  │     └─ LoginRequestDto.java
   │  │           │  ├─ jwt
   │  │           │  │  └─ JwtUtil.java
   │  │           │  └─ security
   │  │           │     ├─ UserDetailsImpl.java
   │  │           │     └─ UserDetailsServiceImpl.java
   │  │           ├─ external
   │  │           │  └─ naver
   │  │           │     ├─ controller
   │  │           │     │  └─ NaverApiController.java
   │  │           │     ├─ dto
   │  │           │     │  └─ ItemDto.java
   │  │           │     └─ service
   │  │           │        └─ NaverApiService.java
   │  │           ├─ folder
   │  │           │  ├─ Folder.java
   │  │           │  ├─ ProductFolder.java
   │  │           │  ├─ controller
   │  │           │  │  └─ FolderController.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ FolderRequestDto.java
   │  │           │  │  └─ FolderResponseDto.java
   │  │           │  ├─ repository
   │  │           │  │  ├─ FolderRepository.java
   │  │           │  │  └─ ProductFolderRepository.java
   │  │           │  └─ service
   │  │           │     └─ FolderService.java
   │  │           ├─ general
   │  │           │  └─ HomeController.java
   │  │           ├─ member
   │  │           │  ├─ User.java
   │  │           │  ├─ UserRole.java
   │  │           │  ├─ controller
   │  │           │  │  └─ UserController.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ SignupRequestDto.java
   │  │           │  │  └─ UserInfoDto.java
   │  │           │  ├─ repository
   │  │           │  │  └─ UserRepository.java
   │  │           │  └─ service
   │  │           │     └─ UserService.java
   │  │           ├─ product
   │  │           │  ├─ Product.java
   │  │           │  ├─ Timestamped.java
   │  │           │  ├─ controller
   │  │           │  │  └─ ProductController.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ ProductMypriceRequestDto.java
   │  │           │  │  ├─ ProductRequestDto.java
   │  │           │  │  └─ ProductResponseDto.java
   │  │           │  ├─ repository
   │  │           │  │  └─ ProductRepository.java
   │  │           │  └─ service
   │  │           │     └─ ProductService.java
   │  │           ├─ scheduler
   │  │           │  └─ Scheduler.java
   │  │           └─ util
   │  │              └─ TestDataRunner.java
   │  └─ resources
   │     ├─ static
   │     │  ├─ css
   │     │  │  └─ style.css
   │     │  ├─ images
   │     │  │  ├─ icon-save.png
   │     │  │  └─ icon-search.png
   │     │  └─ js
   │     │     └─ basic.js
   │     └─ templates
   │        ├─ index.html
   │        ├─ login.html
   │        └─ signup.html
   └─ test
      └─ java
         └─ com
            └─ sparta
               └─ myselectshop
                  └─ MyselectshopApplicationTests.java
```
