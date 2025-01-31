package me.jh.pattern.builder.nomalbuilder;

public class Computer {

	private String cpu;
	private String ram;
	private String gpu;
	private String storage;
	private String powerSupply;

	public Computer(String cpu, String ram, String gpu, String storage, String powerSupply) {
		this.cpu = cpu;
		this.ram = ram;
		this.gpu = gpu;
		this.storage = storage;
		this.powerSupply = powerSupply;
	}

	public Computer() {
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
