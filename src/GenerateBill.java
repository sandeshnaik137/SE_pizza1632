import java.util.LinkedList;
	public class GenerateBill {
		LinkedList<PizzaOrder> items = new LinkedList<PizzaOrder>();
		//private final float GST=12/100;
		private float total;
		//private float fianlTotal;
		public void addItem(PizzaOrder item) throws NullPointerException {
			try{
				this.items.add(item);
			}catch (NullPointerException e) {
				throw e;
			}
		}
		public void removeItem(PizzaOrder item){
			this.items.remove(item);
		}
		public void printBill(){
			try{
				System.out.println("\t\t\t\t   JOKES   PIZZA");
				System.out.println("\t\t  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
				System.out.println("\n");
				System.out.println("Type		Name				Price	      quatity		total");
				System.out.println("---------------------------------------------------------------------------------------");
				for(int i=0; i<items.size();i++){
					System.out.println(this.items.get(i).item.getPtype()+"	 	"+this.items.get(i).item.getName()+"		"+this.items.get(i).item.getPrice()+"		"+this.items.get(i).quantity+"		"+this.items.get(i).quantity*this.items.get(i).item.getPrice());
					this.total+=this.items.get(i).quantity*this.items.get(i).item.getPrice();
					
				}
				System.out.println("---------------------------------------------------------------------------------------");
				
				System.out.println("Total Price: "+this.total+"  Rps");
				System.out.println("Total Price including GST(8%): "+(total+(total*8/100))+"  Rps");
				System.out.println("Thank You");

			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error While Printing bill");
			}
			
		}
		
	}


