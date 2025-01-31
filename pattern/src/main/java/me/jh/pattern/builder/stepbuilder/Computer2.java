package me.jh.pattern.builder.stepbuilder;

/**
 * 스텝 빌더패턴을 구현하기 위한 클래스
 */

public class Computer2 {

	private String cpu;
	private String ram;
	private String gpu;
	private String storage;
	private String powerSupply;

	public Computer2(String cpu, String ram, String gpu, String storage, String powerSupply) {
		this.cpu = cpu;
		this.ram = ram;
		this.gpu = gpu;
		this.storage = storage;
		this.powerSupply = powerSupply;
	}

	public Computer2() {
	}

	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getGpu() {
		return gpu;
	}

	public String getStorage() {
		return storage;
	}

	public String getPowerSupply() {
		return powerSupply;
	}
}
