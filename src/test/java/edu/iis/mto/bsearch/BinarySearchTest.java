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

}
