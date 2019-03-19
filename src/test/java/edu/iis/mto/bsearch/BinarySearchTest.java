/**
 *
 */
package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Utility Class dla wyszukiwania binarnego
 *
 */
public class BinarySearchTest {

    @Test
    public void case1(){
        assertTrue(BinarySearch.search(1, new int [] {1}).isFound());
    }

    @Test
    public void case2(){
        assertFalse(BinarySearch.search(0, new int [] {1}).isFound());
    }

    @Test
    public void case3(){
        assertEquals(1, BinarySearch.search(1, new int[] {1, 2, 3}).getPosition());
    }

    @Test public void case4() {
        assertEquals(3, BinarySearch.search(3, new int[] {1, 2, 3}).getPosition());
    }

    @Test public void case5() {
        assertEquals(2, BinarySearch.search(2, new int[] {1, 2, 3}).getPosition());
    }

}
