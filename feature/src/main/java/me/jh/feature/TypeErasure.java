package me.jh.feature;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class TypeErasure {

    private static final Logger log = LoggerFactory.getLogger(TypeErasure.class);

    private final ArrayList<String> stringArrayList;
    private final ArrayList<Integer> integerArrayList;


    public TypeErasure(ArrayList<String> stringArrayList, ArrayList<Integer> integerArrayList) {
        this.stringArrayList = stringArrayList;
        this.integerArrayList = integerArrayList;
    }


    // stringArrayList와 integerArrayList의 클래스 타입 출력하는 메서드
    public void printClassType(ArrayList<String> stringArrayList, ArrayList<Integer> integerArrayList) {
        log.info("stringArrayList의 클래스 타입: {}", stringArrayList.getClass());
        log.info("integerArrayList의 클래스 타입: {}", integerArrayList.getClass());
    }


    public boolean areSameClass() {
        stringArrayList.add("Hello");
        integerArrayList.add(1);


        return stringArrayList.getClass() == integerArrayList.getClass();
    }


    public void castingError(ArrayList<String> stringArrayList) {
        try {
            ArrayList rawList = stringArrayList;//Raw Type 사용. expert: String타입만 추가 될 것.

            rawList.add(123);// String타입만 추가 될 것이라고 예상했지만 Integer타입도 추가됨.

            String str = (String) stringArrayList.get(1);// String 타입만 들어가야하지만 Integer타입이 들어가 있어 get할 때 ClassCastException이 발생함.
        } catch (ClassCastException e) {
            throw new RuntimeException("오류발생" + e.getMessage());// 캐스팅 에러

        }

    }
}






