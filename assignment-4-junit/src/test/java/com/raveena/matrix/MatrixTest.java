package com.raveena.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    Integer matrixA[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};
    Integer matrixB[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};

    @Test
    void testAddingOfTwoMatrices() {
        Number[][] actual = Matrix.getAddingOfTwoMatrices(matrixA,matrixB);
        Number[][] expected={{2.0, 4.0, 6.0 }, {4.0, 6.0, 8.0 }, {4.0, 6.0, 8.0}};
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
        assertNotNull(actual);
        if(matrixA.length>expected.length || matrixA.length<expected.length){
            fail("rows are not matching");
        }
        if(matrixA[0].length>expected[0].length || matrixA[0].length<expected[0].length){
            fail("columns are not matching");
        }
    }

    @Test
    void testSubstractingOfTwoMatrices() {
        Number[][] actual = Matrix.getSubstractingOfTwoMatrices(matrixA,matrixB);
        Number[][] expected={{0.0, 0.0, 0.0 }, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}};
        assertArrayEquals(expected,actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
        assertNotNull(actual);
        if(matrixA.length>expected.length || matrixA.length<expected.length){
            fail("rows are not matching");
        }
        if(matrixA[0].length>expected[0].length || matrixA[0].length<expected[0].length){
            fail("columns are not matching");
        }
    }

    @Test
    void testMultiplicationOfTwoMatrices() {
        Number[][] actual = Matrix.getMultiplicationOfTwoMatrices(matrixA,matrixB);
        Number[][] expected={{11.0, 17.0, 23.0}, {16.0, 25.0, 34.0 }, {16.0, 25.0, 34.0 }};
        assertArrayEquals(expected,actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixB[0].length,expected[0].length);
        assertNotNull(actual);
        if(matrixA.length>expected.length || matrixA.length<expected.length){
            fail("rows are not matching");
        }
        if(matrixB[0].length>expected[0].length || matrixB[0].length<expected[0].length){
            fail("columns are not matching");
        }
    }

    @Test
    void testscalarMatrix() {
        Number[][] actual = Matrix.getscalarMatrix(matrixA);
        Number[][] expected={{2.0, 4.0, 6.0 }, {4.0, 6.0, 8.0 }, {4.0, 6.0, 8.0 }};
        assertArrayEquals(expected,actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
        assertNotNull(actual);
        if(matrixA.length>expected.length || matrixA.length<expected.length){
            fail("rows are not matching");
        }
        if(matrixA[0].length>expected[0].length || matrixA[0].length<expected[0].length){
            fail("columns are not matching");
        }
    }

    @Test
    void testTransposeOfTwoMatrices() {
        Number[][] actual = Matrix.getTransposeMatrix(matrixA);
        Number[][] expected={{1.0, 2.0, 2.0}, {2.0, 3.0, 3.0},{ 3.0, 4.0, 4.0}};
        if(matrixA.length>expected.length || matrixA.length<expected.length){
            fail("rows are not matching");
        }
        if(matrixA[0].length>expected[0].length || matrixA[0].length<expected[0].length){
            fail("columns are not matching");
        }
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
        assertNotNull(actual);
    }
}