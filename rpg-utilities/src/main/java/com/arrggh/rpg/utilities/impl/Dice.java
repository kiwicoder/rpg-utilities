package com.arrggh.rpg.utilities.impl;

import com.arrggh.rpg.utilities.api.IDice;

public class Dice implements IDice {
    private final Die[] dice;

    public Dice( int number, int sides ) {
        this.dice = new Die[number];
        for ( int i = 0; i != number; i++ ) {
            dice[i] = new Die( sides );
        }
    }

    public int[] rolls() {
        int[] results = new int[dice.length];
        for ( int d = 0; d != dice.length; d++ ) {
            results[d] = dice[d].roll();
        }
        return results;
    }
}
