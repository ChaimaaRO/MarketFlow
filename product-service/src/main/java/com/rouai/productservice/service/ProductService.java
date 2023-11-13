package com.rouai.productservice.service;

import com.rouai.productservice.dto.ProductRequest;
import com.rouai.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProduct();
}
