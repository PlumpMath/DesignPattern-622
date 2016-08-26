package templatepattern;

//具体模板角色类，实现了父类所声明的基本方法，
//abstractMethod()方法所代表的就是强制子类实现的剩余逻辑，而hookMethod()方法是可选择实现的逻辑，不是必须实现的。
public class ConcreteTemplate extends AbstractTemplate {
	//基本方法的实现
	@Override
	public void abstractMethod(){
		//业务相关代码
		System.out.println("I am an abstract method,I am implemented in sub class");
	} 
	
	@Override
	public void doHookMethod(){
		//业务相关代码
		System.out.println("I am a hook method, I am overrided in sub class");
	}
}

