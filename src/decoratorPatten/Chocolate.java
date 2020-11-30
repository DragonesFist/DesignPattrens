package decoratorPatten;

public class Chocolate extends ToppingDecorator{

	Coffee coffee;
	public Chocolate(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return coffee.getDesc()+" , added Chocolate";
		
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+210;
	}

}
