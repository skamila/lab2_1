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

        int[] sequence = {1};
        int element = 1;

        SearchResult result = BinarySearch.search(element, sequence);

        assertTrue(result.isFound());
    }

    @Test public void elementNotInSequenceLength1() {

        int[] sequence = {1};
        int element = 0;

        SearchResult result = BinarySearch.search(element, sequence);

        assertFalse(result.isFound());

    }

    @Test public void elementFirstInSequence() {

        int[] sequence = {1, 2, 3};
        int element = 1;

        SearchResult result = BinarySearch.search(element, sequence);

        assertEquals(1, result.getPosition());

    }

    @Test public void elementLastInSequence() {

        int[] sequence = {1, 2, 3};
        int element = 3;

        SearchResult result = BinarySearch.search(element, sequence);

        assertEquals(3, result.getPosition());

    }

    @Test public void elementInMiddleOfSequence() {

        int[] sequence = {1, 2, 3};
        int element = 2;

        SearchResult result = BinarySearch.search(element, sequence);

        assertEquals(2, result.getPosition());

    }

    @Test public void elementNotInSequence() {

        int[] sequence = {1};
        int element = 4;

        SearchResult result = BinarySearch.search(element, sequence);

        assertFalse(result.isFound());

    }

}
