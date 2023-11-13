package com.rouai.productservice.controller;

import com.rouai.productservice.dto.ProductRequest;
import com.rouai.productservice.dto.ProductResponse;
import com.rouai.productservice.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
//    @PostMapping("/api/product")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createProduct(@RequestBody ProductRequest productRequest){
//        productService.createProduct(productRequest);
//
//    }
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public ResponseEntity<Void> createProduct(@RequestBody ProductRequest productRequest) {
    productService.createProduct(productRequest);
    return ResponseEntity.status(HttpStatus.CREATED).build();
}
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse>  getAllProduct(){
        return  productService.getAllProduct();
    }


}
