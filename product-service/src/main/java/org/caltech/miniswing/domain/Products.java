package org.caltech.miniswing.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @Column(length = 10, nullable = false)
    private String prodId;

    @Column(length = 100, nullable = false)
    private String prodNm;


    @Builder
    public Products(String prodId, String prodNm) {
        this.prodId = prodId;
        this.prodNm = prodNm;
    }
}
