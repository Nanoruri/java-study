package me.jh.feature;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TypeErasureTest {


    @Test
    public void testAreSameClass() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        stringArrayList.add("Hello");
        integerArrayList.add(1);

        TypeErasure typeErasure = new TypeErasure(stringArrayList, integerArrayList);

        typeErasure.printClassType(stringArrayList, integerArrayList);// expert: 타입이 달라서 다르게 출력될 것. facture: 같은 클래스 타입이 출력됨.
        typeErasure.areSameClass();//true


        assertTrue(typeErasure.areSameClass(), "제네릭 타입은 컴파일 시간에만 유효하고 런타임에는 제거된다.");
    }


    @Test
    public void testCastingError() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        stringArrayList.add("Hello");
        integerArrayList.add(1);

        TypeErasure typeErasure = new TypeErasure(stringArrayList, integerArrayList);

        assertThrows(RuntimeException.class, () -> typeErasure.castingError(stringArrayList));
    }







}
