package repository.custom.impl;

import dto.Customer;
import entity.CustomerEntity;
import repository.custom.CustomerDao;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity entity) {
        System.out.println("Repository : - "+entity);
        return false;
    }

    @Override
    public boolean update(String s, CustomerEntity entity) {
        return false;
    }

    @Override
    public boolean delete(String s, CustomerEntity entity) {
        return false;
    }

    @Override
    public CustomerEntity search(String s) {
        return null;
    }

    @Override
    public List<CustomerEntity> getAll() {
        return List.of();
    }
}
