package decoratorPatten;

public class Capichino extends Coffee{

	public Capichino() {
		super();
		// TODO Auto-generated constructor stub
		desc = "Capichno coffee";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 40;
	}

}
