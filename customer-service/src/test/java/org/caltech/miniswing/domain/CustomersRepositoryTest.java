package org.caltech.miniswing.domain;

import org.caltech.miniswing.domain.Customers;
import org.caltech.miniswing.domain.CustomersRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomersRepositoryTest {

    @Autowired
    CustomersRepository customersRepository;

    Customers customers;

    @After
    public void cleanup() {
        customersRepository.deleteAll();
    }

    @Test
    public void custFindTest() {
       // Long custNum = 6000000000;
        String custNM = "김개똥";
        String genderCd = "1";
        LocalDate rgstDt = (LocalDate.now());

        customersRepository.save(Customers.builder()
        //        .id(custNum)
                .custNM(custNM)
                .genderCd(genderCd)
                .rgstDt(rgstDt)
                .build());

        //when
        List<Customers> customersList = customersRepository.findAll();

        //then
        Customers customers = customersList.get(0);
      //  assertThat(customers.getCustNum()).isEqualTo(custNum);
        assertThat(customers.getCustNM()).isEqualTo(custNM);
        assertThat(customers.getGenderCd()).isEqualTo(genderCd);
        assertThat(customers.getRgstDt()).isEqualTo(rgstDt);
    }
}
