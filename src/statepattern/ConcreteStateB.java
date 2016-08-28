package statepattern;

//¾ßÌå×´Ì¬Àà
public class ConcreteStateB implements State {
	@Override
	public void handle(String sampleParameter) {
		System.out.println("concrete state B : " + sampleParameter);
	}
}
