package me.jh.pattern.facade;

import me.jh.pattern.facade.subsystem.AudioSystem;
import me.jh.pattern.facade.subsystem.BluRayPlayer;
import me.jh.pattern.facade.subsystem.TV;

public class HomeTheaterFacade {

    private final TV tv;
    private final AudioSystem audioSystem;
    private final BluRayPlayer bluRayPlayer;

    public HomeTheaterFacade(TV tv, AudioSystem audioSystem, BluRayPlayer bluRayPlayer) {
        this.tv = tv;
        this.audioSystem = audioSystem;
        this.bluRayPlayer = bluRayPlayer;
    }

    // 홈 시어터를 시작하는 단순한 방법
    public void watchMovie() {
        System.out.println("영화 시작 준비 중...");
        tv.on();
        audioSystem.on();
        bluRayPlayer.on();
    }

    // 홈 시어터를 끄는 단순한 방법
    public void endMovie() {
        System.out.println("영화 종료 준비 중...");
        bluRayPlayer.off();
        audioSystem.off();
        tv.off();
    }
}
