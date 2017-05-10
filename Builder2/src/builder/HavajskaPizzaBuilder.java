package builder;


// concrete builder
public class HavajskaPizzaBuilder extends PizzaBuilder{

	
	@Override
	public void buildTesto() {
		pizza.setTesto("hrskavi hleb");
	}

	@Override
	public void buildSos() {
		pizza.setSos("blagi");
	}

	@Override
	public void buildPreliv() {
		pizza.setPreliv("sunka + ananas");
	}
	
}
