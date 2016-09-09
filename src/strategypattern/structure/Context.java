package strategypattern.structure;

//������ɫ��
public class Context {
	// ����һ��������ԵĶ���
	private IStrategy strategy;

	/**
	 * ���캯��������һ��������Զ���
	 * @param strategy ������Զ��� 
	 */
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * ���Է���
	 */
	public void contextInterface() {
		strategy.strategyInterface();
	}
}
