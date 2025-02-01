package me.jh.pattern.builder.nomalbuilder;

// ConcreteBuilder 클래스
public class ComputerBuilderImpl implements ComputerBuilder {
	private String cpu;
	private String ram;
	private String gpu;
	private String storage;
	private String powerSupply;


	@Override
	public ComputerBuilder cpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	@Override
	public ComputerBuilder ram(String ram) {
		this.ram = ram;
		return this;
	}

	@Override
	public ComputerBuilder gpu(String gpu) {
		this.gpu = gpu;
		return this;
	}

	@Override
	public ComputerBuilder storage(String storage) {
		this.storage = storage;
		return this;
	}

	@Override
	public ComputerBuilder powerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
		return this;
	}

	@Override
	public Computer build() {
		return new Computer(cpu, ram, gpu, storage, powerSupply);

	}
}
