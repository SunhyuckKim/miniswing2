package org.caltech.miniswing.web;


import lombok.RequiredArgsConstructor;
import org.caltech.miniswing.service.ProductsService;
import org.caltech.miniswing.web.dto.ProductsResponseDto;
import org.caltech.miniswing.web.dto.ProductsSaveRequestDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {
    private final ProductsService productsService;

    @GetMapping("/api/v1/products/{prodId}") //조회
    public ProductsResponseDto findById (@PathVariable Long prodId) {
        return productsService.findById(prodId);
    }

    @PostMapping("/api/v1/products") //저장
    public  Long save(@RequestBody ProductsSaveRequestDto requestDto) {

        return productsService.save(requestDto);
    }

}
