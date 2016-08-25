package singletonpattern;

import java.util.HashMap;
import java.util.Map;

//登记式单例
//实际上维护了一组单例类的实例，将这些实例存放在一个Map（登记薄）中，对于已经登记过的实例，则从Map直接返回，对于没有登记的，则先登记，然后返回。 
//类似Spring里面的方法，将类名注册，下次从里面直接获取。
public class SingletonIII {
	private static Map<String, SingletonIII> map = new HashMap<String, SingletonIII>();
	static {
		SingletonIII single = new SingletonIII();
		map.put(single.getClass().getName(), single);
	}

	// 保护的默认构造子
	protected SingletonIII() {
	}

	// 静态工厂方法,返还此类惟一的实例
	public static SingletonIII getInstance(String name) {
		if (name == null) {
			name = SingletonIII.class.getName();
			System.out.println("name == null" + "--->name=" + name);
		}
		if (map.get(name) == null) {
			try {
				map.put(name, (SingletonIII) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return map.get(name);
	}

	// 一个示意性的商业方法
	public String about() {
		return "Hello, I am RegSingleton.";
	}

	public static void main(String[] args) {
		SingletonIII single3 = SingletonIII.getInstance(null);
		System.out.println(single3.about());
	}
}
