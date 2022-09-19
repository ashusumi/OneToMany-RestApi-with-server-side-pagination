package com.example.test.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.test.model.Category;

public interface CatPageService {
List<Category> findBycategoryWithPage(int pageNo,int pageSize);
}
