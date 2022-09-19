package com.example.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Product;

@Repository
public interface productPageRepo extends PagingAndSortingRepository<Product, Integer>{

}
