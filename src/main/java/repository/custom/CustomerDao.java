package repository.custom;

import dto.Customer;
import entity.CustomerEntity;
import repository.CrudRepository;
import repository.SuperDao;

public interface CustomerDao extends CrudRepository<CustomerEntity,String> {
}
