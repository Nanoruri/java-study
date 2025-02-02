# java-study

It is a repository for studying and organizing examples of design patterns and Java features.

---

***

## 목차
### 1. [Java Features](#java-features)
- 1.1. [Type Erasure](#type-erasure)


### 2. [Design Patterns](#design-patterns)
- 2.1. [Builder](#builder)
- 2.2. [Singleton](#singleton)
- 2.3. [Delegate](#delegate)
- 2.4. [Facade](#facade)

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


---

### 2.3. Delegate
객체가 특정 작업을 직접 수행하는 대신, 다른 객체(델리게이트)에게 위임(delegate)하는 구조를 가지는 디자인 패턴입니다.
이 패턴을 사용하면 코드의 재사용성을 높이고, 유연성을 증가시킬 수 있습니다.

**구조**
- caller: 작업을 위임하는 객체
- delegate: 작업을 수행하는 객체
- interface(선택적 요소): caller와 delegate 사이에서 작업을 위임하기 위한 인터페이스

**주 사용처 (활용)**
- 테스트하기 어려운 static 메서드나 final 클래스의 메서드를 테스트
- GUI 프레임워크에서 이벤트 처리
- IOS 개발

**장점**
- 코드의 재사용성 증가
- 객체간 결합도 감소
- 유연성과 확장성 증가
- 테스트 용이성 증가

**단점**
- 구현 클래스가 많아질 수록 복잡도 증가
- 미세한 성능 저하 가능성
- 디버깅 어려움

**구현 예제**
- [Delegate](pattern/src/main/java/me/jh/pattern/delegate)

**테스트 코드**
- [DelegateTest](pattern/src/test/java/me/jh/pattern/delegate/PrinterTest.java)


---
### 2.4. Facade
복잡한 시스템을 단순화하기 위해, 여러 클래스나 시스템의 인터페이스를 단일 클래스나 단일 인터페이스로 제공하는 디자인 패턴입니다.
이를 통해 클라이언트는 복잡한 시스템의 세부 구현에 대해 알 필요 없이, 간단한 인터페이스만을 통해 시스템을 사용할 수 있게 됩니다.
파사드 패턴은 서브시스템(Subsystem) 간의 상호작용을 은폐하고, 클라이언트가 복잡한 시스템을 사용할 때 편리한 인터페이스를 제공하는 방식으로 작동합니다.


**구조**
- Facade: 클라이언트가 사용할 인터페이스를 제공
- Subsystem: Facade가 복잡한 하위 시스템(클래스)


**주 사용처 (활용)**
- 서브시스템을 간단하게 사용하는 경우
- 복잡한 라이브러리나 서드파티 시스템을 사용할 때
- 서브시스템을 감추고 단순화하고 싶은 경우


**장점**
- 복잡도 감소
- 클라이언트가 서브시스템을 직접 사용하지 않아도 됨
- 결합도 감소
- 서브시스템 변경에 대한 영향 최소화
- 클라이언트 코드 간결화
- 서브시스템 간의 통합

**단점**
- 파사드 클래스가 많은 역할을 담당하게 되면, 단일 책임 원칙 위배 가능성
- 파사드 클래스가 복잡해질 수록 유지보수가 어려워질 수 있음
- 서브시스템을 직접 사용하는 경우에 비해 세밀한 제어가 어려움


**구현 예제**
- [Facade](pattern/src/main/java/me/jh/pattern/facade)

**테스트 코드**
- [FacadeTest](pattern/src/test/java/me/jh/pattern/facade/HomeTheaterFacadeTest.java)

***

---