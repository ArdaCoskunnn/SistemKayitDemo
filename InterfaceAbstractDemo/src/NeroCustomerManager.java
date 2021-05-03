
public class NeroCustomerManager extends BaseCustomerManager{
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Nero kayıt edildi : " + customer.getId() + "  |  " + 
													customer.getFirstName() + "  |  " + 
													customer.getLastName() + "  |  " + 
													customer.getDateTime() + "  |  " + 
													customer.getNationalityId());
	}
}
