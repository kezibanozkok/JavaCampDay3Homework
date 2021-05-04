package coffeShopCustomerManagementSystem.adapters;

import java.rmi.RemoteException;

import coffeShopCustomerManagementSystem.abstractt.CustomerCheckService;
import coffeShopCustomerManagementSystem.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy check = new KPSPublicSoapProxy();
		
		try {
			boolean result = check.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), 
													customer.getFirstName().toUpperCase(), 
													customer.getLastName().toUpperCase(), 
													customer.getDateOfBirth().getYear());
			return result;
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
