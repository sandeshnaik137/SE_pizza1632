public class PizzaMain {

	public static void main(String[] args) {
	
		GenerateBill g=new GenerateBill();
		Pizza mgw=new Pizza("VEG","MEXICAN GREEN WAVE", 200);
		Pizza ppc= new Pizza("NON VEG","PERI-PERI CHICKEN", 300);
		Pizza cnc=new Pizza("VEG","CHEESE N CORN    ", 150);
		Pizza cd = new Pizza("NON VEG","CHICKEN DOMINATOR", 250);
		
		new PizzaOrder(mgw, 2, g);
		new PizzaOrder(cnc, 3, g);
		new PizzaOrder(cd, 5, g);
		new PizzaOrder(ppc,1, g);
		g.printBill();
	}
}