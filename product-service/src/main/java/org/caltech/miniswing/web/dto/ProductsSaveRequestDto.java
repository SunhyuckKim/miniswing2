package org.caltech.miniswing.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.caltech.miniswing.domain.Products;

@Getter
@NoArgsConstructor
public class ProductsSaveRequestDto {

    private Long id;
    private String prodNm;
    @Builder
    public ProductsSaveRequestDto(Long id, String prodNm) {
        this.id = id;
        this.prodNm = prodNm;
    }

    public Products toEntity(){
        return Products.builder()
                .id(id)
                .prodNm(prodNm)
                .build();
    }
}