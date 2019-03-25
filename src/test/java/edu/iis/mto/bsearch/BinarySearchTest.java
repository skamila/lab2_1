/**
 *
 */
package edu.iis.mto.bsearch;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Utility Class dla wyszukiwania binarnego
 */
public class BinarySearchTest {

    @Test public void elementInSequenceLength1() {

        int[] sequence = {1};
        int element = 1;

        SearchResult result = BinarySearch.search(element, sequence);

        assertThat(result.isFound(), Is.is(true));
        assertThat(result.getPosition(), Is.is(1));

    }

    @Test public void elementNotInSequenceLength1() {

        int[] sequence = {1};
        int element = 0;

        SearchResult result = BinarySearch.search(element, sequence);

        assertThat(result.isFound(), Is.is(false));
        assertThat(result.getPosition(), Is.is(-1));

    }

    @Test public void elementFirstInSequence() {

        int[] sequence = {1, 2, 3};
        int element = 1;

        SearchResult result = BinarySearch.search(element, sequence);

        assertThat(result.isFound(), Is.is(true));
        assertThat(result.getPosition(), Is.is(1));

    }

    @Test public void elementLastInSequence() {

        int[] sequence = {1, 2, 3};
        int element = 3;

        SearchResult result = BinarySearch.search(element, sequence);

        assertThat(result.isFound(), Is.is(true));
        assertThat(result.getPosition(), Is.is(3));

    }

    @Test public void elementInMiddleOfSequence() {

        int[] sequence = {1, 2, 3};
        int element = 2;

        SearchResult result = BinarySearch.search(element, sequence);

        assertThat(result.isFound(), Is.is(true));
        assertThat(result.getPosition(), Is.is(2));

    }

    @Test public void elementNotInSequence() {

        int[] sequence = {1, 2, 3};
        int element = 4;

        SearchResult result = BinarySearch.search(element, sequence);

        assertThat(result.isFound(), Is.is(false));
        assertThat(result.getPosition(), Is.is(-1));

    }

    @Test public void sequenceLength0() {

        int[] sequence = {};
        int element = 0;

        assertThrows(IllegalArgumentException.class,
                () -> BinarySearch.search(element, sequence));

    }

}
