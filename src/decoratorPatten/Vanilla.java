package decoratorPatten;

public class Vanilla extends ToppingDecorator{

	Coffee coffee;
	public Vanilla(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return coffee.getDesc()+" , added Vanilla";
		
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+20;
	}

}
