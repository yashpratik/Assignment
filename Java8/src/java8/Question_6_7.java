package java8;

public class Question_6_7 
{
	int itemId;
	String itemName;
	int itemprice;
	
	public Question_6_7(int itemId, String itemName, int itemprice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemprice = itemprice;
	}
	
	@Override
	public String toString() {
		return "Item1 [itemId=" + itemId + ", itemName=" + itemName + ", itemprice=" + itemprice + "]";
	}
	
}
