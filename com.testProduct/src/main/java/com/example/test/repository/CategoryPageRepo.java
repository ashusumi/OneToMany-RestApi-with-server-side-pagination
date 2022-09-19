package com.example.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Category;
@Repository
public interface CategoryPageRepo extends PagingAndSortingRepository<Category,Integer>{

}
