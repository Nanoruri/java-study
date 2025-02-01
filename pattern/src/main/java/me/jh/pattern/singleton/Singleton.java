package me.jh.pattern.singleton;


/**
 * 싱글톤 패턴 구현 방법 1.
 * - 클래스 로딩 시점에 객체를 생성하지 않고, getInstance 메서드 호출 시 객체를 생성하는 방법
 *
 * 권장되는 두가지 방법중 하나
 * 멀티쓰레드 환경에서 안전하고 Lazy Loading(나중에 객체 생성) 도 가능한 완벽한 싱글톤 기법
 * 클래스 안에 내부 클래스(holder)를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한 방법 (스레드 세이프함)
 * static 메소드에서는 static 멤버만을 호출할 수 있기 때문에 내부 클래스를 static으로 설정이밖에도 내부 클래스의 치명적인 문제점인 메모리 누수 문제를 해결하기 위하여 내부 클래스를 static으로 설정
 * 다만 클라이언트가 임의로 싱글톤을 파괴할 수 있다는 단점을 지님 (Reflection API, 직렬화/역직렬화를 통해)
 */
public class Singleton {

    // static 내부 클래스를 이용
    // Holder로 만들어, 클래스가 메모리에 로드되지 않고 getInstance 메서드가 호출되어야 로드됨
    private static class SingleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
