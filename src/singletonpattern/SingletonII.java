package singletonpattern;

//懒汉式：将类对自己的实例化延迟到第一次被引用的时候，需要注意同步问题
//同步延迟加载
public class SingletonII {
	// 在自己内部定义自己一个实例,未初始化
	// 注意这是private 只供内部调用
	private static SingletonII instance = null;

	// 将构造函数设置为私有
	private SingletonII() {
	}

	// 它是线程不安全的，并发环境下很可能出现多个Singleton实例
	public static SingletonII getInstance1() {
		if (instance == null)
			instance = new SingletonII();
		return instance;
	}

	//1. 在getInstance方法上加同步
	public static synchronized SingletonII getInstance2() {
		if (instance == null)
			instance = new SingletonII();
		return instance;
	}

	//2. 双重检查锁定 double check locking 两次检查
	//双重检测锁定失败的问题并不归咎于 JVM 中的实现 bug，而是归咎于 Java 平台内存模型。内存模型允许所谓的“无序写入”，这也是失败的一个主要原因
	//可以在instance上加上关键字：volatile
	public static SingletonII getInstance3() {
		if(instance == null){
			synchronized(SingletonII.class){
				if(instance == null)
					instance = new SingletonII();
			}
		}
		return instance;
	}
	
	
}
//3. 静态内部类
class Singleton{
	private static class LazyHolder{
		private static final Singleton instance = new Singleton();
	}
	private Singleton(){
		
	}
	public static final Singleton getInstance(){
		return LazyHolder.instance;
	}
}