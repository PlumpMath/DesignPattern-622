package templatepattern;

public class Client {
	public static void main(String[] args) {
		//面向抽象类编程
		AbstractTemplate at = new ConcreteTemplate();
		//调用顶级逻辑代码：模板方法
		at.templateMethod();
	}
}
