package strategypattern.structure;

//���������
public class ConcreteStrategyB implements IStrategy {
	@Override
	public void strategyInterface(){
		//��ص�ҵ��
		System.out.println("this is the Concrete strategy B, which implements the interface IStrategy");
	}
}
