
package swe;


public class Tomato extends ToppingDecorator{
	pizza pizza;
	
	public Tomato(pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.description + ", With Tomato";
	}

	@Override
	public double cost() {
		return 0.30 + pizza.cost();
	}

}

