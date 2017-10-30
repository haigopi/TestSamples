 class Customer {

	private String name;

	public String getName(){
		
	}

	public void setName(String cName) {
		cName = cName.replaceAll("a", "");
		name = cName;
	}

}
