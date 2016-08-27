package strategypattern.structure;

//具体策略类
public class ConcreteStrategyA implements IStrategy {
	@Override
	public void strategyInterface(){
		//相关的业务
		System.out.println("this is the Concrete strategy A, which implements the interface IStrategy");
	}
}
