package decoratorPatten;

public class BlackForest extends ToppingDecorator{

	Coffee coffee;
	public BlackForest(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return coffee.getDesc()+" , added Blackforest";
		
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+100;
	}

}
