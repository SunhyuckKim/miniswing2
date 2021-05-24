package org.caltech.miniswing.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id", length = 10, nullable = false)
    private Long id;

    @Column(length = 100, nullable = false)
    private String prodNm;


    @Builder
    public Products(Long id, String prodNm) {
        this.id = id;
        this.prodNm = prodNm;
    }
    public Long getProdId() {
        return id;
    }

}
