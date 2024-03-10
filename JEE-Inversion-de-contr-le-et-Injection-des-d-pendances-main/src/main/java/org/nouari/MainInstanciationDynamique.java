package org.nouari;

import org.nouari.repository.IDao;
import org.nouari.repository.IDaoImpl;
import org.nouari.service.IMetier;
import org.nouari.service.IMetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainInstanciationDynamique {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("src/main/conf.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier =Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.newInstance();
    }
}
