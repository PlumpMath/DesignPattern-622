package singletonpattern;

//饿汉式：在类被加载的时候实例化，但这样多次加载会照成多次实例化。不会引起多线程问题。性能较优，一般用这个就可以
//非延迟加载单例类
public class SingletonI {
	// 在自己内部定义自己一个实例
	// 注意这是private 只供内部调用
	private static SingletonI instance = new SingletonI();

	// 如上面所述，将构造函数设置为私有
	private SingletonI() {
	}

	// 静态工厂方法，提供了一个供外部访问得到对象的静态方法
	public static SingletonI getInstance() {
		return instance;
	}
}

//当饿汉式与懒汉式比较时
//1.线程安全
//2.资源加载与性能