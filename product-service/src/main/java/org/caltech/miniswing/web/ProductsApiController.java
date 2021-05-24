package org.caltech.miniswing.web;


import lombok.RequiredArgsConstructor;
import org.caltech.miniswing.service.ProductsService;
import org.caltech.miniswing.web.dto.ProductsResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {
    private final ProductsService productsService;

    @GetMapping("/api/v1/products/{prodId}") //조회
    public ProductsResponseDto findById (@PathVariable String prodId) {
        return productsService.findById(prodId);
    }
}
