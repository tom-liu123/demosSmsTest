package com.example.demo.service;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author LiuCongYang
 * @Version 1.0.0
 * create at @date  2021/1/20 14:36
 * copyright Beijing Murong Information Technology Co.,Ltd.
 */
public interface ReadingListRepository extends JpaRepository<Book ,Long> {
    List<Book> findByReader(String reader);
}
