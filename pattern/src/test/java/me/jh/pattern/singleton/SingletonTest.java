package me.jh.pattern.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {


    @Test
    public void testSingletonInstance() {
        // 두 인스턴스를 가져옴
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // 두 인스턴스가 동일한지 확인
        assertSame(instance1, instance2, "Both instances should be the same.");
    }

    @Test// 멀티스레드 환경에서 싱글톤 인스턴스가 한개인지 확인
    public void testSingletonInstanceMultipleThread() throws ExecutionException, InterruptedException {
        int threadCount = 10;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        // Callable로 쓰레드를 생성하고 각 쓰레드에서 Singleton 인스턴스를 가져옵니다.
        Callable<Integer> task = () -> Singleton.getInstance().hashCode();

        // 10개의 쓰레드를 실행하고 각 쓰레드에서 해시코드를 가져옴
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            futures.add(executor.submit(task));
        }

        // 모든 결과를 확인하여 동일한 해시코드를 반환하는지 확인
        Integer expectedHashCode = futures.get(0).get();  // 첫 번째 쓰레드의 해시코드 값
        for (Future<Integer> future : futures) {
            assertEquals(expectedHashCode, future.get(), "All instances should have the same hashCode.");
        }

        executor.shutdown();
    }


}
