package singletonpattern;

//枚举
//默认枚举实例的创建是线程安全的，但是在枚举中的其他任何方法由程序员自己负责
//以通过SingletonIV.INSTANCE来访问，这比调用getInstance()方法简单多了
public enum SingletonIV {
	INSTANCE;
}
