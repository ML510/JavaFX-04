package config;

import com.google.inject.AbstractModule;
import repository.custom.CustomerDao;
import repository.custom.impl.CustomerDaoImpl;
import service.custom.CustomerService;
import service.custom.impl.CustomerServiceImpl;

public class AppModule extends AbstractModule {

    @Override
    protected void configure(){

        bind(CustomerService.class).to(CustomerServiceImpl.class);
        bind(CustomerDao.class).to(CustomerDaoImpl.class);

    }
}
