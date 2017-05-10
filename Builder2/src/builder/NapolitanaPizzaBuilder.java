package builder;

public class NapolitanaPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildTesto() {
		pizza.setTesto("brasnjavo testo");
	}

	@Override
	public void buildSos() {
		pizza.setSos("paradajz");
	}

	@Override
	public void buildPreliv() {
		pizza.setPreliv("slanina + sunka");
	}
}
