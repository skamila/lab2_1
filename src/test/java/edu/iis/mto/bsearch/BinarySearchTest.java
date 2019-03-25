/**
 *
 */
package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Utility Class dla wyszukiwania binarnego
 */
public class BinarySearchTest {

    @Test public void elementInSequenceLength1() {
        assertTrue(BinarySearch.search(1, new int[] {1}).isFound());
    }

    @Test public void elementNotInSequenceLength1() {
        assertFalse(BinarySearch.search(0, new int[] {1}).isFound());
    }

    @Test public void elementFirstInSequence() {
        assertEquals(1, BinarySearch.search(1, new int[] {1, 2, 3}).getPosition());
    }

    @Test public void elementLastInSequence() {
        assertEquals(3, BinarySearch.search(3, new int[] {1, 2, 3}).getPosition());
    }

    @Test public void elementInMiddleOfSequence() {
        assertEquals(2, BinarySearch.search(2, new int[] {1, 2, 3}).getPosition());
    }

    @Test public void elementNotInSequence() {
        assertFalse(BinarySearch.search(4, new int[] {1, 2, 3}).isFound());
    }

}
