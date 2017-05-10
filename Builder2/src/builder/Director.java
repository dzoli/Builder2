package builder;

import model.Pizza;

public class Director {
	PizzaBuilder aBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
		aBuilder = pizzaBuilder;
	}

	
	// mozemo da pozovemo iz direktora getResult():Pizza
	// zato sto imamo samo 1 Produkt
	// sa razlicitim reprezentacijama samo
	// inace kad ima vise produkata (Car, Manual sa slicnim procesom izgradnje)
	// ne mozemo iz buidera pozivati getResult() jer samo konktetni builder zna sta vraca
	public Pizza getPizza(){
		return aBuilder.getPizza();
	}
	
	
	public void constructPizza(){
		aBuilder.createNewPizzaProduct();
		aBuilder.buildTesto();
		aBuilder.buildSos();
		aBuilder.buildPreliv();
	}
	
	// klijent ce pozvati Direktora i zadati mu konkretan Builder (Napolitana)
	// zatim pozvati metod za konstrukciju objekta
	// i na kraju izvuci rezultat ovaj put iz direktora
}
