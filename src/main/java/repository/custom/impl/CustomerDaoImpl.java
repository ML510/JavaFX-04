package repository.custom.impl;

import config.HibernateConfig;
import dto.Customer;
import entity.CustomerEntity;
import org.hibernate.Session;
import repository.custom.CustomerDao;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity entity) {
        System.out.println("Repository : - "+entity);

        // ----- Hibernate Session Factory Add CustomerDaoImpl-------
        Session session = HibernateConfig.geSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();

        return true;
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
