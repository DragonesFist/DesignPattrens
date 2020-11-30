package decoratorPatten;

public class Espresso extends Coffee{

	
	public Espresso() {
		super();
		desc= "Espresso cofee";
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 30;
	}
	

}
