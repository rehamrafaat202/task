
package swe;
public class Mushroom extends ToppingDecorator{

	pizza pizza;
	
	public Mushroom(pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With mushroom";
	}

	@Override
	public double cost() {
		return 0.40 + pizza.cost();
	}

}


