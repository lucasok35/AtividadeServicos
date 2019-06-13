package entidade;

public class Escola {

	private String id;
	private String schoolCode;
	private String schoolName;
	private String address;
	private String city;
	private String stateCode;
	private String zipCode;
	private String province;
	private String country;
	private String postalCode;

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSchoolCode() {
		return schoolCode;
	}


	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStateCode() {
		return stateCode;
	}


	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	@Override
	public String toString() {
		return "Escola [id=" + id + ", schoolCode=" + schoolCode + ", schoolName=" + schoolName + ", address=" + address
				+ ", city=" + city + ", stateCode=" + stateCode + ", zipCode=" + zipCode + ", province=" + province
				+ ", country=" + country + ", postalCode=" + postalCode + "]";
	}
	
	

	
	
    
}
