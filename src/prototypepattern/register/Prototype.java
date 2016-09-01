package prototypepattern.register;

//抽象原型角色
public interface Prototype {
	public Prototype clone();

	public String getName();

	public void setName(String name);
}
