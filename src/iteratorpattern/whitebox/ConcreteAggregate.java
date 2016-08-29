package iteratorpattern.whitebox;

public class ConcreteAggregate extends Aggregate {

	private Object[] objArray = null;

	/**
	 * ���췽��������ۺ϶���ľ�������
	 */
	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	/**
	 * ȡֵ������������ṩ�ۼ�Ԫ��
	 */
	public Object getElement(int index) {
		if (index < objArray.length) {
			return objArray[index];
		} else {
			return null;
		}
	}

	/**
	 * ȡֵ������������ṩ�ۼ��Ĵ�С
	 */
	public int size() {
		return objArray.length;
	}
}