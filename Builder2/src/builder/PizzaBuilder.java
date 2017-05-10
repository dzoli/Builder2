package builder;

import model.Pizza;



// abstract builder
public abstract class PizzaBuilder {

	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizzaProduct(){
		pizza = new Pizza();
	}
	
	
	public abstract void buildTesto();
	public abstract void buildSos();
	public abstract void buildPreliv();
	
}
