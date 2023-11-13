package com.rouai.productservice.service;

import com.rouai.productservice.dto.ProductRequest;
import com.rouai.productservice.dto.ProductResponse;
import com.rouai.productservice.model.Product;
import com.rouai.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl  implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {
        //create product instance
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        //save product into db
        productRepository.save(product);
        log.info("product {}is saved ", product.getId());

    }

    @Override
    public List<ProductResponse> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();


    }

    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

    }
}