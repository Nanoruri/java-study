package me.jh.pattern.builder;

import me.jh.pattern.builder.nomalbuilder.Computer;
import me.jh.pattern.builder.nomalbuilder.ComputerBuilderImpl;
import me.jh.pattern.builder.stepbuilder.Computer2;
import me.jh.pattern.builder.stepbuilder.StepComputer;
import org.junit.jupiter.api.Test;

public class BuilderTest {


	@Test// 기본적인 빌더
	public void builderTest() {
		String cpu = "i7";
		String ram = "16GB";
		String gpu = "GTX 1080";
		String storage = "1TB SSD";
		String powerSupply = "750W";

		Computer computer = new Computer(cpu, ram, gpu, storage, powerSupply);

		Computer build = new ComputerBuilderImpl()
				.cpu(cpu)
				.ram(ram)
				.gpu(gpu)
				.storage(storage)
				.powerSupply(powerSupply)
				.build();


		assert (computer.getCpu().equals(build.getCpu()));
		assert (computer.getRam().equals(build.getRam()));
		assert (computer.getGpu().equals(build.getGpu()));
		assert (computer.getStorage().equals(build.getStorage()));
		assert (computer.getPowerSupply().equals(build.getPowerSupply()));
	}


	@Test// 스텝형 빌더
	public void stepBuilderTest() {
		String cpu = "i7";
		String ram = "16GB";
		String gpu = "GTX 1080";
		String storage = "1TB SSD";
		String powerSupply = "750W";

		Computer2 computer2 = new Computer2(cpu, ram, gpu, storage, powerSupply);

		Computer2 build2 = StepComputer.builder()
				.cpu(cpu)
				.ram(ram)
				.gpu(gpu)
				.storage(storage)
				.powerSupply(powerSupply)
				.build();


		assert (computer2.getCpu().equals(build2.getCpu()));
		assert (computer2.getRam().equals(build2.getRam()));
		assert (computer2.getGpu().equals(build2.getGpu()));
		assert (computer2.getStorage().equals(build2.getStorage()));
		assert (computer2.getPowerSupply().equals(build2.getPowerSupply()));
	}
}

