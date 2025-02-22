package service.custom.impl;

import dto.Customer;
import entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.custom.CustomerDao;
import service.custom.CustomerService;
import util.DaoType;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerDao dao = DaoFactory.getInstance().getDaoType(DaoType.CUSTOMER);

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("Service : - "+customer);

        CustomerEntity map = new ModelMapper().map(customer, CustomerEntity.class);

        dao.save(map);

        return false;
    }

    @Override
    public boolean updateCustomer(String id, Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id, Customer customer) {
        return false;
    }

    @Override
    public Customer searchCustomer(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }
}
