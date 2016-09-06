package builderpattern;

//抽象构建者builder
public interface Builder {
	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();
}