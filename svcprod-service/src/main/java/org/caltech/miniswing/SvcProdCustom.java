package org.caltech.miniswing;

import org.caltech.miniswing.domain.Services;
import org.caltech.miniswing.domain.ServicesRepository;
import org.springframework.stereotype.Service;

@Service
public class SvcProdCustom {

    private ServicesRepository servicesRepository;

    public SvcProdCustom(ServicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
    }

    public Long subscribeProd(Services services) {
        return servicesRepository.save(services).getSvcMgmtNum();
    }
}
