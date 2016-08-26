package templatepattern;

//����ģ���ɫ�࣬ʵ���˸����������Ļ���������
//abstractMethod()����������ľ���ǿ������ʵ�ֵ�ʣ���߼�����hookMethod()�����ǿ�ѡ��ʵ�ֵ��߼������Ǳ���ʵ�ֵġ�
public class ConcreteTemplate extends AbstractTemplate {
	//����������ʵ��
	@Override
	public void abstractMethod(){
		//ҵ����ش���
		System.out.println("I am an abstract method,I am implemented in sub class");
	} 
	
	@Override
	public void doHookMethod(){
		//ҵ����ش���
		System.out.println("I am a hook method, I am overrided in sub class");
	}
}

