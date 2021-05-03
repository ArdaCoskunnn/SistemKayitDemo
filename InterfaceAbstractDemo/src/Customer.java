
public class Customer {
	
	public String Id;
	public String FirstName;
	public String LastName;
	public String DateTime;
	public String NationalityId;
	
	public Customer(String Id, String FirstName, String LastName, String DateTime, String NationalityId) {
		this.Id = Id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.DateTime = DateTime;
		this.NationalityId = NationalityId;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateTime() {
		return DateTime;
	}

	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	
}
