package java8_User;


public class User 
{

	String itemName;
	double itemPrice;
	String d_manufacturing;
	String d_expiring;
	String category;
	public User(String itemName, double itemPrice, String d_manufacturing, String d_expiring, String category) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.d_manufacturing = d_manufacturing;
		this.d_expiring = d_expiring;
		this.category = category;
	}
	@Override
	public String toString() {
		return "User [itemName=" + itemName + ", itemPrice=" + itemPrice + ", d_manufacturing=" + d_manufacturing
				+ ", d_expiring=" + d_expiring + ", category=" + category + "]";
	}

	
	
}
