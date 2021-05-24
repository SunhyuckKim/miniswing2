package org.caltech.miniswing.service;

import lombok.RequiredArgsConstructor;
import org.caltech.miniswing.domain.Products;
import org.caltech.miniswing.domain.ProductsRepository;
import org.caltech.miniswing.web.dto.ProductsResponseDto;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class ProductsService {

    private final ProductsRepository productsRepository;

    //상품정보조회
    public ProductsResponseDto findById(String id) {
        Products entity = productsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 서비스가 없습니다. id=" + id));

        return new ProductsResponseDto(entity);
    }
}
