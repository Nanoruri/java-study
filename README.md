# java-study

It is a repository for studying and organizing examples of design patterns and Java features.

---

***

## 목차
### 1. [Java Features](#java-features)
- [1.1. Type Erasure](#type-erasure)


### 2. [Design Patterns](#design-patterns)
- [2.1. Builder](#builder)
- [2.2. Singleton](#singleton)

---

***

## Java Features

### 1.1. Type Erasure
**타입 소거(Type Erasure)**는 **자바의 제네릭(Generic)**이 컴파일 시점에서만 유지되고, 런타임에는 타입 정보가 제거되는 특성을 말합니다. 
제네릭은 컴파일 시점에만 타입 체크를 하고, 런타임에는 타입 정보가 소거되어 Object 타입으로 변환됩니다.

**타입 소거가 발생하는 이유**
- 제네릭이 도입되기 이전의 코드들이 Object로 구현되어 있어 하위 호환성을 위해 이러한 방식을 사용

**타입 소거의 문제점**
- 타입 정보가 소거되어 런타임에 타입을 확인할 수 없음
- instanceof 연산자로 제네릭 타입 확인 불가
- 제네릭 타입의 배열 생성 불가


**타입 소거의 동작 방식**
- 컴파일 시점에서 제네릭 타입을 제거하고, 타입을 Object로 변환
- 제네릭 타입의 타입 파라미터를 제거하고, Object로 변환

**타입 소거의 예시**
- [TypeErasure](feature/src/main/java/me/jh/feature/TypeErasure.java)

**테스트 코드**
- [TypeErasureTest](feature/src/test/java/me/jh/feature/TypeErasureTest.java)


***

---

## Design Patterns

### 2.1. Builder
객체 생성과 관련된 디자인 패턴 중 하나로, 복잡한 객체 생성을 단순화하고 객체의 표현 방식을 분리하여 객체 생성 과정을 캡슐화합니다.

**구조**
- Product: 생성할 객체
- Builder: 객체 생성을 담당하는 인터페이스
- ConcreteBuilder: Builder 인터페이스를 구현한 클래스

**주 사용처 (활용)**
- 복잡한 객체 생성
- 불변 객체 생성
- 자주 변경되는 객체 생성
- 설정값이 많은 객체 생성
- 텍스트 문서나 html 페이지 등 복잡한 구조의 객체 생성
- UI 객체 생성
- DB 쿼리 생성

**장점**
- 객체 생성 과정 분리
- 복잡한 객체 생성 지원
- 유연성 확보(매개변수 선택 가능)
- 불변 객체 생성 용이
- 재사용성
- 가독성 향상

(stepBuilder)
- 객체 생성 과정을 단계별로 나누어 객체 생성
- 타입 안정성 보장
- 구성요소 검증(잘못된 값이 들어오는 것을 방지)

**단점**
- 객체 생성 과정이 복잡해질 수 있음
- 간단한 객체 생성에는 비효율적
- 과도한 클래스 수 증가 가능성(코드 복잡도 증가)

**구현 예제**
- [Builder](pattern/src/main/java/me/jh/pattern/builder)

**테스트 코드**
- [BuilderTest](pattern/src/test/java/me/jh/pattern/builder/BuilderTest.java)

---

### 2.2. Singleton
싱글톤 패턴(Singleton Pattern)은 객체 지향 프로그래밍에서 클래스의 인스턴스가 오직 하나만 생성되도록 보장하는 디자인 패턴입니다. 
주로 시스템 전반에서 하나의 인스턴스만 필요하고, 그 인스턴스에 전역적으로 접근할 수 있도록 해야 할 때 사용합니다. 
메모리 절약을 위해 인스턴스를 여러 개 생성하지 않고 하나의 인스턴스만 생성하여 사용하는 것이 목적입니다.

**주 사용처 (활용)**
- 애플리케이션 전역에서 하나의 인스턴스를 공유해야 할 때
- 리소스 관리 (데이터베이스 연결, 스레드 풀 등)
- 공유 자원에 대한 동시성 문제 해결 (로깅, 통계 관리)
- 비용이 큰 객체(초기화가 복잡하거나 시간이 많이 드는 객체)
- 외부 시스템과의 인터페이스 관리 (메시지 큐, 파일 시스템 등)

**장점**
- 메모리 낭비 방지
- 전역 인스턴스이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유하기 쉽다.
- 객체 생성 비용 절감
- 인스턴스 상태 관리 용이

**단점**
- 유연성 감소(애플리케이션 전체에 걸쳐 사용되는 인스턴스이기 때문에 수정이 어려움)
- 테스트 어려움(싱글톤은 전역 상태를 유지하므로 테스트하기 어려움)
- 멀티쓰레드 환경에서 동기화 처리를 안하면 인스턴스가 두 개 생성될 수 있음(volatile 키워드 사용)
- DI(의존성 주입)가 어려움
- 순환 참조 문제 발생 가능성
- 사이드 이펙트 발생 가능성

**구현 예제**
- [Singleton.java](pattern/src/main/java/me/jh/pattern/singleton/Singleton.java)
- [Singleton2.java](pattern/src/main/java/me/jh/pattern/singleton/Singleton2.java)

**테스트 코드**
- [SingletonTest.java](pattern/src/test/java/me/jh/pattern/singleton/SingletonTest.java)

***

---