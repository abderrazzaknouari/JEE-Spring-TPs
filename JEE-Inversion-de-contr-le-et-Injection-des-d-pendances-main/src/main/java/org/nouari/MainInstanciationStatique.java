package org.nouari;

import org.nouari.repository.IDao;
import org.nouari.repository.IDaoImpl;
import org.nouari.service.IMetier;
import org.nouari.service.IMetierImpl;

public class MainInstanciationStatique {
    public static void main(String[] args) {
        IDao iDao=new IDaoImpl();
        IMetier iMetier=new IMetierImpl(iDao);
        iMetier.calculer();
    }
}
