package com.arrggh.rpg.utilities.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arrggh.rpg.utilities.api.IDie;

public class DieTest {
    @Test
    public void testRollSingleDice() {
        IDie die = new Die( 1 );
        assertEquals( 1, die.roll() );
    }
}
