import java.time.LocalDate;

import coffeShopCustomerManagementSystem.abstractt.BaseCustomerManager;
import coffeShopCustomerManagementSystem.adapters.MernisServiceAdapter;
import coffeShopCustomerManagementSystem.concrete.StarbucksCustomerManager;
import coffeShopCustomerManagementSystem.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception { 
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1, "KEZİBAN", "ÖZKÖK", LocalDate.of(1998, 11, 11), "12345678910");
		customerManager.save(customer1);
		
	}
	
}
