package org.caltech.miniswing.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
public class Customers {

    @Id
    @Column(name = "custNum")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String custNM;

    @Column(length = 1, nullable = false)
    private String genderCd;

    @Column
    private LocalDate rgstDt;

    @Builder
    public Customers(Long id, String custNM, String genderCd, LocalDate rgstDt ) {
        this.id = id;
        this.custNM = custNM;
        this.genderCd = genderCd;
        this.rgstDt = rgstDt;
    }

    public long getCustNum() {
        return id;
    }



}
