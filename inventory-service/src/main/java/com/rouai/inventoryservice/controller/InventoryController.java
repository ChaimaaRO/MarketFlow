package com.rouai.inventoryservice.controller;

import com.rouai.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {
    private final InventoryService inventoryService;
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInStock(@PathVariable("sku-code") String skuCode){
       return inventoryService.isInStock(skuCode);

    }
//    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
//        log.info("Received inventory check request for skuCode: {}", skuCode);
//        return inventoryService.isInStock(skuCode);
//    }
}
