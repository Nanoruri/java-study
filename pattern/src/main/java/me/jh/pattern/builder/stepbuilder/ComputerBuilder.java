package me.jh.pattern.builder.stepbuilder;


/**
 * 스텝 빌더패턴을 구현하기 위한 인터페이스
 */
public interface ComputerBuilder {

	public static interface CPU {
		RAM cpu(String cpu);
	}

	public static interface RAM {
		GPU ram(String ram);
	}

	public static interface GPU {
		STORAGE gpu(String gpu);
	}

	public static interface STORAGE {
		POWERSUPPLY storage(String storage);
	}

	public static interface POWERSUPPLY {
		BUILD powerSupply(String powerSupply);
	}

	public static interface BUILD {
		Computer2 build();
	}

}
