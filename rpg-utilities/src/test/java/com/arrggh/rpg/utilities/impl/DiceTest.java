package com.arrggh.rpg.utilities.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arrggh.rpg.utilities.api.IDice;

public class DiceTest {
    @Test
    public void testSimpleDiceRolls() {
        IDice dice = new Dice( 3, 1 );
        int[] rolls = dice.rolls();
        assertEquals( 3, rolls.length );
        assertEquals( 1, rolls[0] );
        assertEquals( 1, rolls[1] );
        assertEquals( 1, rolls[2] );
    }
}
