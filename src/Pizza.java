
public class Pizza {
	private String ptype;
	private String name;
	private float price;
	
	public Pizza(String ptype,String name, float price){
		this.ptype=ptype;
		this.name=name;
		this.price=price;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public String getPtype() {
		return ptype;
	}

	public String getName(){
		return this.name;
	}
}

