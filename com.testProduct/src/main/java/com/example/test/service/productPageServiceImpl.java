package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.test.model.Product;
import com.example.test.repository.productPageRepo;

@Service
public class productPageServiceImpl implements productPageService{
	@Autowired
	productPageRepo pageRepo;

	@Override
	public List<Product> findProductByPage(int pageNo, int pageSize) {
		Pageable paging=PageRequest.of(pageNo, pageSize);
	    Page<Product> pageResult=pageRepo.findAll(paging);
	    return pageResult.toList();
	}
	

}
