package templatepattern;

//抽象模板角色类，abstractMethod()、hookMethod()等基本方法是顶级逻辑的组成步骤，这个顶级逻辑由templateMethod()方法代表。
public abstract class AbstractTemplate {
	//模板方法
	public void templateMethod(){
		//调用具体方法
		System.out.println("this is start of the template method!\n");
		abstractMethod();
		doHookMethod();
		concreteMethod();
		System.out.println("\nthis is end of the template method!");
	}
	
	//基本方法:抽象方法
	protected abstract void abstractMethod();
	
	//基本方法:钩子方法(空的实现)
	protected void doHookMethod(){
		
	}
	//基本方法:具体方法（已实现）
	private void concreteMethod(){
		//业务逻辑代码
		System.out.println("I am a concrete method!");
	}
}
