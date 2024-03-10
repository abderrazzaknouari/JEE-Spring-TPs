package ma.enset.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {

        System.out.println("Version base de données");
        double temperature = Math.random() * 100;
        return temperature;
    }
}
