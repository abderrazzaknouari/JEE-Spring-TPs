package org.nouari.service;

import org.nouari.repository.IDao;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl2 implements IMetier {

    private IDao iDao;

    public IMetierImpl2(IDao iDao) {
        this.iDao = iDao;
    }

    public IMetierImpl2() {
    }

    @Override
    public int calculer() {
        if(iDao.getData()==null)
            return 0;
        return 1;
    }
}
