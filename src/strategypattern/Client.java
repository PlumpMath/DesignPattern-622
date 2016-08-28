package strategypattern;

public class Client {
	public static void main(String[] args) {
		// 策略模式仅仅封装算法，提供新的算法插入到已有系统中，以及老算法从系统中“退休”的方法，策略模式并不决定在何时使用何种算法。
		// 在什么情况下使用什么算法是由客户端决定的。

		// IStrategy strategy = new ConcreteStrategyA();
		IStrategy strategy = new ConcreteStrategyB();
		Context context = new Context(strategy);
		context.contextInterface();
	}
}
