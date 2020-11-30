package decoratorPatten;

public class Latte extends Coffee {
	
	public Latte() {
		super();
		// TODO Auto-generated constructor stub
		desc = "Latte Coffee";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 20;
	}

}
