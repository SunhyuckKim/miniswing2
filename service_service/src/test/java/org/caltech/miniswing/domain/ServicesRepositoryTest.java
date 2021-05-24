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

public class ServicesRepositoryTest {

    @Autowired
    ServicesRepository servicesRepository;

    @Test
    public void svcFindTest() {

        //given
        String svcNum = "01012345678";
        String feeProd = "NA00000002";

            servicesRepository.save(Services.builder()
                .svcNum(svcNum)
                .feeProd(feeProd)
                .build());


        //when
        List<Services> servicesList = servicesRepository.findAll();

        //then
        Services services = servicesList.get(0);
        assertThat(services.getSvcNum()).isEqualTo(svcNum);
        assertThat(services.getFeeProd()).isEqualTo(feeProd);

    }
}
