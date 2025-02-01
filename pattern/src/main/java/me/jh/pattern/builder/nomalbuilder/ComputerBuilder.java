package me.jh.pattern.builder.nomalbuilder;

// Builder 인터페이스
public interface ComputerBuilder {
	ComputerBuilder cpu(String cpu);
	ComputerBuilder ram(String ram);
	ComputerBuilder gpu(String gpu);
	ComputerBuilder storage(String storage);
	ComputerBuilder powerSupply(String powerSupply);
	Computer build();
}
