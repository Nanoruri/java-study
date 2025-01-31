package me.jh.pattern.builder.stepbuilder;


/**
 * 스텝 빌더패턴을 구현하기 위한 클래스
 */

public class StepComputer implements ComputerBuilder.CPU, ComputerBuilder.RAM, ComputerBuilder.GPU, ComputerBuilder.STORAGE, ComputerBuilder.POWERSUPPLY, ComputerBuilder.BUILD{

	private String cpu;
	private String ram;
	private String gpu;
	private String storage;
	private String powerSupply;


	private StepComputer() {
	}

	public static ComputerBuilder.CPU builder() {
		return new StepComputer();
	}

	@Override
	public ComputerBuilder.RAM cpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	@Override
	public ComputerBuilder.GPU ram(String ram) {
		this.ram = ram;
		return this;
	}

	@Override
	public ComputerBuilder.STORAGE gpu(String gpu) {
		this.gpu = gpu;
		return this;
	}

	@Override
	public ComputerBuilder.POWERSUPPLY storage(String storage) {
		this.storage = storage;
		return this;
	}

	@Override
	public ComputerBuilder.BUILD powerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
		return this;
	}


	@Override
	public Computer2 build() {
		return new Computer2(cpu, ram, gpu, storage, powerSupply);
	}
}
