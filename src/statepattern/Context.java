package statepattern;

//������ɫ��
public class Context {
	// ����һ��״̬���ʵ��
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	// �û�����Ȥ�ķ���
	public void request(String sampleParameter) {
		// ת��state������
		state.handle(sampleParameter);
	}
}
