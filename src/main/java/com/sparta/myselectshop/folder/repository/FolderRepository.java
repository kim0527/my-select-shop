package com.sparta.myselectshop.folder.repository;

import com.sparta.myselectshop.folder.Folder;
import com.sparta.myselectshop.member.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
}
