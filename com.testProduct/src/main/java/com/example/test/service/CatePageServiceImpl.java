package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.test.model.Category;
import com.example.test.repository.CategoryPageRepo;

@Service
public class CatePageServiceImpl implements CatPageService{
	@Autowired
	private CategoryPageRepo catPageRepo;

	@Override
	public List<Category> findBycategoryWithPage(int pageNo, int pageSize) {
		org.springframework.data.domain.Pageable paging=PageRequest.of(pageNo, pageSize);
		Page<Category> pageResult=catPageRepo.findAll(paging);
		
		return pageResult.toList();
	}
	

}
