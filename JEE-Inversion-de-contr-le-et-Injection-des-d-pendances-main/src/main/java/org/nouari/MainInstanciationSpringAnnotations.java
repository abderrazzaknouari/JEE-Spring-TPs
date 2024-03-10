package org.nouari;

import org.nouari.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainInstanciationSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.nouari.service.IMetierImpl","org.nouari.repository.IDaoImpl");
        IMetier metier =context.getBean(IMetier.class);
    }
}
