package org.nouari.service;

import org.nouari.repository.IDao;

import java.util.ArrayList;

public class IMetierImpl implements IMetier {

    private IDao iDao;

    public IMetierImpl(IDao iDao) {
        this.iDao = iDao;
    }

    public IMetierImpl() {
    }

    @Override
    public int calculer() {
        if(iDao.getData()==null)
            return 0;
        return 1;
    }
}
