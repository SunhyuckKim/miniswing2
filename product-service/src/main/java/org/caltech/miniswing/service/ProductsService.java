package org.caltech.miniswing.service;

import lombok.RequiredArgsConstructor;
import org.caltech.miniswing.domain.Products;
import org.caltech.miniswing.domain.ProductsRepository;
import org.caltech.miniswing.web.dto.ProductsResponseDto;
import org.caltech.miniswing.web.dto.ProductsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service

public class ProductsService {

    private final ProductsRepository productsRepository;

    @Transactional //상품정보 저장
    public Long save(ProductsSaveRequestDto requestDto) {
        return productsRepository.save(requestDto.toEntity()).getProdId();
    }

    //상품정보조회
    public ProductsResponseDto findById(Long id) {
        Products entity = productsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 서비스가 없습니다. id=" + id));

        return new ProductsResponseDto(entity);
    }

}
