
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager();
		customerManager.Save(new Customer("0", "Arda", "Coskun", "2006", "blablablabla"));
		customerManager.Save(new Customer("1", "Özgür", "Coskun", "2003", "blablablabla"));
		customerManager.Save(new Customer("2", "Vedat", "Coskun", "blabla", "blablablabla"));
		customerManager.Save(new Customer("3", "Ertuğ", "Kaymak", "2006", "blablablabla"));
		
	}

}
