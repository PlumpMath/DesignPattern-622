package strategypattern.structure;

//���������
public class ConcreteStrategyA implements IStrategy {
	@Override
	public void strategyInterface(){
		//��ص�ҵ��
		System.out.println("this is the Concrete strategy A, which implements the interface IStrategy");
	}
}
