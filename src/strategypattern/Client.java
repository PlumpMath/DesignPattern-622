package strategypattern;

public class Client {
	public static void main(String[] args) {
		// ����ģʽ������װ�㷨���ṩ�µ��㷨���뵽����ϵͳ�У��Լ����㷨��ϵͳ�С����ݡ��ķ���������ģʽ���������ں�ʱʹ�ú����㷨��
		// ��ʲô�����ʹ��ʲô�㷨���ɿͻ��˾����ġ�

		// IStrategy strategy = new ConcreteStrategyA();
		IStrategy strategy = new ConcreteStrategyB();
		Context context = new Context(strategy);
		context.contextInterface();
	}
}
