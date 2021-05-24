package org.caltech.miniswing.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Services {

    @Id
    @Column(name = "svc_mgmt_num")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 12, nullable = false)
    private String svcNum;

    @Column(name = "fee_prod_id", length = 10, nullable = false)
    private String feeProd;

    @Builder
    public Services(Long id, String svcNum, String feeProd) {
        this.id = id;
        this.svcNum = svcNum;
        this.feeProd = feeProd;
    }

}
