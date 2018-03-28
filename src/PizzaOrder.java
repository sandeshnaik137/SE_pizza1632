
public class PizzaOrder {
	public Pizza item;
	public int quantity;
	
	public PizzaOrder(Pizza item, int quantity, GenerateBill bill){
		try{
			this.item=item;
			this.quantity=quantity;
			bill.addItem(this);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
