package statepattern;

//����״̬��
public class ConcreteStateA implements State {
	@Override
	public void handle(String sampleParameter) {
		System.out.println("concrete state A : " + sampleParameter);
	}
}
