package prototypepattern.simple;

//����ԭ�ͽ�ɫ
public class ConcretePrototype2 implements Prototype {
	public Prototype clone() {
		// ��򵥵Ŀ�¡���½�һ�������������û�����ԾͲ��ٸ���ֵ��
		Prototype prototype = new ConcretePrototype2();
		return prototype;
	}
}