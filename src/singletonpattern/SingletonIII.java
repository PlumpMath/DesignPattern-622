package singletonpattern;

import java.util.HashMap;
import java.util.Map;

//�Ǽ�ʽ����
//ʵ����ά����һ�鵥�����ʵ��������Щʵ�������һ��Map���ǼǱ����У������Ѿ��Ǽǹ���ʵ�������Mapֱ�ӷ��أ�����û�еǼǵģ����ȵǼǣ�Ȼ�󷵻ء� 
//����Spring����ķ�����������ע�ᣬ�´δ�����ֱ�ӻ�ȡ��
public class SingletonIII {
	private static Map<String, SingletonIII> map = new HashMap<String, SingletonIII>();
	static {
		SingletonIII single = new SingletonIII();
		map.put(single.getClass().getName(), single);
	}

	// ������Ĭ�Ϲ�����
	protected SingletonIII() {
	}

	// ��̬��������,��������Ωһ��ʵ��
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

	// һ��ʾ���Ե���ҵ����
	public String about() {
		return "Hello, I am RegSingleton.";
	}

	public static void main(String[] args) {
		SingletonIII single3 = SingletonIII.getInstance(null);
		System.out.println(single3.about());
	}
}
