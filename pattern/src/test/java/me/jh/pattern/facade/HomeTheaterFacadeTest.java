package me.jh.pattern.facade;

import me.jh.pattern.facade.subsystem.AudioSystem;
import me.jh.pattern.facade.subsystem.BluRayPlayer;
import me.jh.pattern.facade.subsystem.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeTheaterFacadeTest {

    private HomeTheaterFacade homeTheater;

    @BeforeEach
    public void setUp() {
        // 실제 객체 생성
        TV tv = new TV();
        AudioSystem audioSystem = new AudioSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();

        // 파사드 객체 생성
        homeTheater = new HomeTheaterFacade(tv, audioSystem, bluRayPlayer);
    }

    @Test
    public void testWatchMovie() {
        // 영화 시작 시 각 서브시스템이 켜지는지 출력으로 확인
        homeTheater.watchMovie();

    }

    @Test
    public void testEndMovie() {
        // 영화 종료 시 각 서브시스템이 꺼지는지 출력으로 확인
        homeTheater.endMovie();

    }
}
