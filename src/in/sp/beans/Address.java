package in.sp.beans;

public class Address {
	private int housNo;
	private String pincode;
	private String city;
	
	public Address(int houseNo,String pincode,String city) {
		this.housNo=houseNo;
		this.pincode=pincode;
		this.city=city;
		
	}
	
	@Override
	public String toString() {
		
		return "#"+housNo+"- "+pincode+"- "+city+"";
	}
}
