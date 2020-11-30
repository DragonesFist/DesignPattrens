package decoratorPatten;

 abstract class Coffee {
	String desc= "Default coffee";
	
	public String getDesc() {
		return desc;
	}
	
	public abstract float getCost() ;

}
