package decoratorPatten;

public class MainImpl {
	
	public static void main(String args[]) {
	System.out.println("This is main");
	 Coffee coffee = new Latte();
	 coffee = new Vanilla(coffee);
	 coffee = new BlackForest(coffee);
	 System.out.println("The coffee is "+coffee.getDesc()+" cost is:"+coffee.getCost());
	 
	
	
	
	}

}
