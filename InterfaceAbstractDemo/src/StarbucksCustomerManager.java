
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Starbucks kayıt edildi : " + customer.getId() + "  |  " + 
														 customer.getFirstName() + "  |  " + 
														 customer.getLastName() + "  |  " + 
														 customer.getDateTime() + "  |  " + 
														 customer.getNationalityId());
	}
}
