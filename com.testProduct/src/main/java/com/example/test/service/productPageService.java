package com.example.test.service;

import java.util.List;

import com.example.test.model.Category;
import com.example.test.model.Product;

public interface productPageService {
	List<Product> findProductByPage(int pageNo,int pageSize);
}
