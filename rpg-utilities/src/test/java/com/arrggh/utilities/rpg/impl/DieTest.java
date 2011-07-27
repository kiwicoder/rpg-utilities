package com.arrggh.utilities.rpg.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arrggh.utilities.rpg.api.IDie;
import com.arrggh.utilities.rpg.impl.Die;

public class DieTest {
    @Test
    public void testRollSingleDice() {
        IDie die = new Die( 1 );
        assertEquals( 1, die.roll() );
    }
}
