package coffeShopCustomerManagementSystem.abstractt;

import coffeShopCustomerManagementSystem.entities.Customer;

public interface CustomerService {
	void save(Customer customer) throws Exception;
}
