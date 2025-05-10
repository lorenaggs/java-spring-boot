package com.lorena.springcloud.msvc.products.services;

import com.lorena.springcloud.msvc.products.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lorena.springcloud.msvc.products.entities.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

   final private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }
}