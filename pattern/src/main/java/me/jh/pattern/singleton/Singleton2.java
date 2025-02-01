package me.jh.pattern.singleton;


/**
 * 싱글톤 패턴 구현 방법 2.
 * - 클래스 로딩 시점에 객체를 생성하는 방법
 * Eager Initialization
 * 한번만 미리 만들어두는, 가장 직관적이면서도 심플한 기법
 * static final 이라 멀티 쓰레드 환경에서도 안전함
 * 그러나 static 멤버는 당장 객체를 사용하지 않더라도 메모리에 적재하기 때문에 만일 리소스가 큰 객체일 경우, 공간 자원 낭비가 발생함
 * 예외 처리를 할 수 없음
 */
public class Singleton2 {

    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static final Singleton2 INSTANCE = new Singleton2();

    // 생성자를 private로 선언 (외부에서 new 사용 X)
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
