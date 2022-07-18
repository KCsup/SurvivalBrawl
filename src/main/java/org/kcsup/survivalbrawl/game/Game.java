package org.kcsup.survivalbrawl.game;

import org.kcsup.survivalbrawl.arena.Arena;

public class Game {

    private Arena arena;

    public Game(Arena arena) {
        this.arena = arena;
    }

    public void start() {
        stop();
    }

    public void stop() {
        arena.reset();
    }

}
