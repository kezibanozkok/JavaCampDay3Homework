package coffeShopCustomerManagementSystem.concrete;

import coffeShopCustomerManagementSystem.abstractt.CustomerCheckService;
import coffeShopCustomerManagementSystem.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;	
	}

	

}
