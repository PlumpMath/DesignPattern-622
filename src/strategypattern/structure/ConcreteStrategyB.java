package strategypattern.structure;

//具体策略类
public class ConcreteStrategyB implements IStrategy {
	@Override
	public void strategyInterface(){
		//相关的业务
		System.out.println("this is the Concrete strategy B, which implements the interface IStrategy");
	}
}
