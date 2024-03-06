package CapstoneProjectOOP;

public class Customer {
	
	private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public String getName() {
    	return name;
    }

}
