
package swe;

public class Olive extends ToppingDecorator{

	pizza pizza;
	
	public Olive(pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With Olive";
	}

	@Override
	public double cost() {
		return 0.20 + pizza.cost();
	}

}


