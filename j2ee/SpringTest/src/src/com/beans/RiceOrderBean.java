package com.beans;

public class RiceOrderBean {
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber_1;
	private String mobileNumber_2;
	private String mobileNumber_3;
	private String alternateNumber_1;
	private String alternateNumber_2;
	private String alternateNumber_3;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String basmati;
	private String sn1;
	private String sn2;

	public String getName(){
		return firstName+" "+lastName;
	}
	
	public String getMessage(){
		return "Build the oerder message with the below details.... Shipping to : gopi" + getAddress1() + getAddress2() + getCity()+ getState()+ getZip()
				+ getCountry() + getBasmati() + getSn1()+getSn2();
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber_1 + mobileNumber_2 + mobileNumber_3;
	}

	public String getAlternateNumber() {
		return alternateNumber_1 + alternateNumber_2 + alternateNumber_3;
	}

	public String getAlternateNumber_1() {
		return alternateNumber_1;
	}

	public void setAlternateNumber_1(String alternateNumber_1) {
		this.alternateNumber_1 = alternateNumber_1;
	}

	public String getAlternateNumber_2() {
		return alternateNumber_2;
	}

	public void setAlternateNumber_2(String alternateNumber_2) {
		this.alternateNumber_2 = alternateNumber_2;
	}

	public String getAlternateNumber_3() {
		return alternateNumber_3;
	}

	public void setAlternateNumber_3(String alternateNumber_3) {
		this.alternateNumber_3 = alternateNumber_3;
	}

	public String getMobileNumber_1() {
		return mobileNumber_1;
	}

	public void setMobileNumber_1(String mobileNumber_1) {
		this.mobileNumber_1 = mobileNumber_1;
	}

	public String getMobileNumber_2() {
		return mobileNumber_2;
	}

	public void setMobileNumber_2(String mobileNumber_2) {
		this.mobileNumber_2 = mobileNumber_2;
	}

	public String getMobileNumber_3() {
		return mobileNumber_3;
	}

	public void setMobileNumber_3(String mobileNumber_3) {
		this.mobileNumber_3 = mobileNumber_3;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getBasmati() {
		return basmati;
	}

	public void setBasmati(String basmati) {
		this.basmati = basmati;
	}

	public String getSn1() {
		return sn1;
	}

	public void setSn1(String sn1) {
		this.sn1 = sn1;
	}

	public String getSn2() {
		return sn2;
	}

	public void setSn2(String sn2) {
		this.sn2 = sn2;
	}

}
