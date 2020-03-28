
package swe;


public class Pepper extends ToppingDecorator{

	pizza pizza;
	
	public Pepper(pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With Pepper";
	}

	@Override
	public double cost() {
		return 0.08 + pizza.cost();
	}

}

