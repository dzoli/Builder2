package client;

import builder.Director;
import builder.NapolitanaPizzaBuilder;

public class Client {

	public static void main(String[] args) {
		NapolitanaPizzaBuilder napolitanaPizzaBuilder = new NapolitanaPizzaBuilder();
		Director director = new Director();
		
		director.setPizzaBuilder(napolitanaPizzaBuilder);
		director.constructPizza();
		
		
		System.out.println(" ======= Pizza je gotova =======");
		System.out.println(director.getPizza()); // iz direkotra zovemo getResukt() zato sto ima samo 1 produkat

	
	}
	
}
