package singletonpattern;

//����ʽ�����౻���ص�ʱ��ʵ��������������μ��ػ��ճɶ��ʵ����������������߳����⡣���ܽ��ţ�һ��������Ϳ���
//���ӳټ��ص�����
public class SingletonI {
	// ���Լ��ڲ������Լ�һ��ʵ��
	// ע������private ֻ���ڲ�����
	private static SingletonI instance = new SingletonI();

	// �����������������캯������Ϊ˽��
	private SingletonI() {
	}

	// ��̬�����������ṩ��һ�����ⲿ���ʵõ�����ľ�̬����
	public static SingletonI getInstance() {
		return instance;
	}
}

//������ʽ������ʽ�Ƚ�ʱ
//1.�̰߳�ȫ
//2.��Դ����������