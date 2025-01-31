package me.jh.pattern.builder.nomalbuilder;

public interface ComputerBuilder {
	ComputerBuilder cpu(String cpu);
	ComputerBuilder ram(String ram);
	ComputerBuilder gpu(String gpu);
	ComputerBuilder storage(String storage);
	ComputerBuilder powerSupply(String powerSupply);
	Computer build();
}
