package templatepattern;

public class Client {
	public static void main(String[] args) {
		//�����������
		AbstractTemplate at = new ConcreteTemplate();
		//���ö����߼����룺ģ�巽��
		at.templateMethod();
	}
}
