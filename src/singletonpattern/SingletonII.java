package singletonpattern;

//����ʽ��������Լ���ʵ�����ӳٵ���һ�α����õ�ʱ����Ҫע��ͬ������
//ͬ���ӳټ���
public class SingletonII {
	// ���Լ��ڲ������Լ�һ��ʵ��,δ��ʼ��
	// ע������private ֻ���ڲ�����
	private static SingletonII instance = null;

	// �����캯������Ϊ˽��
	private SingletonII() {
	}

	// �����̲߳���ȫ�ģ����������ºܿ��ܳ��ֶ��Singletonʵ��
	public static SingletonII getInstance1() {
		if (instance == null)
			instance = new SingletonII();
		return instance;
	}

	//1. ��getInstance�����ϼ�ͬ��
	public static synchronized SingletonII getInstance2() {
		if (instance == null)
			instance = new SingletonII();
		return instance;
	}

	//2. ˫�ؼ������ double check locking ���μ��
	//˫�ؼ������ʧ�ܵ����Ⲣ������� JVM �е�ʵ�� bug�����ǹ���� Java ƽ̨�ڴ�ģ�͡��ڴ�ģ��������ν�ġ�����д�롱����Ҳ��ʧ�ܵ�һ����Ҫԭ��
	//������instance�ϼ��Ϲؼ��֣�volatile
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
//3. ��̬�ڲ���
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