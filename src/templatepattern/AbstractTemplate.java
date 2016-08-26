package templatepattern;

//����ģ���ɫ�࣬abstractMethod()��hookMethod()�Ȼ��������Ƕ����߼�����ɲ��裬��������߼���templateMethod()��������
public abstract class AbstractTemplate {
	//ģ�巽��
	public void templateMethod(){
		//���þ��巽��
		System.out.println("this is start of the template method!\n");
		abstractMethod();
		doHookMethod();
		concreteMethod();
		System.out.println("\nthis is end of the template method!");
	}
	
	//��������:���󷽷�
	protected abstract void abstractMethod();
	
	//��������:���ӷ���(�յ�ʵ��)
	protected void doHookMethod(){
		
	}
	//��������:���巽������ʵ�֣�
	private void concreteMethod(){
		//ҵ���߼�����
		System.out.println("I am a concrete method!");
	}
}
