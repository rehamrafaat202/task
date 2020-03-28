
package swe;


public class Restaurant {

	public static void main(String[] args) {
		pizza pizza = new Chicken();
		System.out.println(pizza.getDescription()
				+ " $" +pizza.cost());
		
		pizza pizza2 = new Tuna();
		pizza2 = new Tomato(pizza2);
		pizza2 = new Pepper(pizza2);
                pizza2=new Olive(pizza2);
                pizza2=new Mushroom(pizza2);
		System.out.println(pizza2.getDescription()
				+ " $" + pizza2.cost());
	}

}

