package iteratorpattern.whitebox;

public interface Iterator {
	/**
	 * �����������ƶ�����һ��Ԫ��
	 */
	public void first();

	/**
	 * �����������ƶ�����һ��Ԫ��
	 */
	public void next();

	/**
	 * �����������Ƿ�Ϊ���һ��Ԫ��
	 */
	public boolean isDone();

	/**
	 * ����������������ǰԪ��
	 */
	public Object currentItem();
}