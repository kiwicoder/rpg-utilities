package com.arrggh.utilities.rpg.impl;

import java.util.Random;

import com.arrggh.utilities.rpg.api.IDie;

public class Die implements IDie {
    private static final Random random = new Random( System.nanoTime() );

    private final int sides;

    public Die( int sides ) {
        this.sides = sides;
    }

    public int roll() {
        return random.nextInt( sides ) + 1;
    }
}
