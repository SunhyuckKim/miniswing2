package org.caltech.miniswing.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsRepositoryTest {

    @Autowired
    ProductsRepository productsRepository;

    @Test
    public void prodFindTest() {

        //given
        String prodId = "NA00000002";
        String prodNm = "기본요금제";

        productsRepository.save(Products.builder()
                .id(prodId)
                .prodNm(prodNm)
                .build());

        //when
        List<Products> productsList = productsRepository.findAll();

        //then
        Products products = productsList.get(0);
        assertThat(products.getProdId()).isEqualTo(prodId);
        assertThat(products.getProdNm()).isEqualTo(prodNm);
    }
}
