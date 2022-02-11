package com.zs.assignment4;

import com.zs.assignment1.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    Integer matrixA[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};
    Integer matrixB[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};

    @Test
    void testAddingOfTwoMatrices() {
        Number[][] actual = Matrix.getAddingOfTwoMatrices(matrixA,matrixB);
        Number[][] expected={{2.0, 4.0, 6.0 }, {4.0, 6.0, 8.0 }, {4.0, 6.0, 8.0}};
        assertNotNull(actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);

    }

    @Test
    void testSubstractingOfTwoMatrices() {
        Number[][] actual = Matrix.getSubstractingOfTwoMatrices(matrixA,matrixB);
        Number[][] expected={{0.0, 0.0, 0.0 }, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}};
        assertNotNull(actual);
        assertArrayEquals(expected,actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
    }

    @Test
    void testMultiplicationOfTwoMatrices() {
        Number[][] actual = Matrix.getMultiplicationOfTwoMatrices(matrixA,matrixB);
        Number[][] expected={{11.0, 17.0, 23.0}, {16.0, 25.0, 34.0 }, {16.0, 25.0, 34.0 }};
        assertNotNull(actual);
        assertArrayEquals(expected,actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixB[0].length,expected[0].length);
    }

    @Test
    void testscalarMatrix() {
        Number[][] actual = Matrix.getscalarMatrix(matrixA);
        Number[][] expected={{2.0, 4.0, 6.0 }, {4.0, 6.0, 8.0 }, {4.0, 6.0, 8.0 }};
        assertNotNull(actual);
        assertArrayEquals(expected,actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
    }

    @Test
    void testTransposeOfTwoMatrices() {
        Number[][] actual = Matrix.getTransposeOfTwoMatrices(matrixA);
        Number[][] expected={{1.0, 2.0, 2.0}, {2.0, 3.0, 3.0},{ 3.0, 4.0, 4.0}};
        assertNotNull(actual);
        assertArrayEquals(expected,actual);
        assertEquals(matrixA.length,expected.length);
        assertEquals(matrixA[0].length,expected[0].length);
    }
}