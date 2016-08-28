package statepattern;

//环境角色类
public class Context {
	// 持有一个状态类的实例
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	// 用户感兴趣的方法
	public void request(String sampleParameter) {
		// 转调state来处理
		state.handle(sampleParameter);
	}
}
