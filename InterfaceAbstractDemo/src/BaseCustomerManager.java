
public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) { 
	}		
	
	public void Save(Customer customer, BaseCustomerManager baseCustomerManager) {
		
		CustomerCheckManager customerCheckManager = new CustomerCheckManager();
		
		if(customerCheckManager.CheckIfRealPerson(customer)) {
			baseCustomerManager.Save(customer);
		}
		else {
			System.out.println("Database'e kaydedilemedi.");
		}
		
	}
}

