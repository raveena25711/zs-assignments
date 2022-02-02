package com.raveena.matrix;

public class Matrix {
    public static void main(String[] args) {
        Integer matrixA[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};
        Integer matrixB[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};

        Number[][] addingOfTwoMatrix = getAddingOfTwoMatrices(matrixA, matrixB);
        printMatrix(addingOfTwoMatrix);
        Number[][] subtractingOfTwoMatrices = getSubstractingOfTwoMatrices(matrixA, matrixB);
        printMatrix(subtractingOfTwoMatrices);
        Number[][] multiplicationOfTwoMatrices = getMultiplicationOfTwoMatrices(matrixA, matrixB);
        printMatrix(multiplicationOfTwoMatrices);
        Number[][] scalarMatrix = getscalarMatrix(matrixA);
        printMatrix(scalarMatrix);
        Number[][] transposeOfTwoMatrices = getTransposeOfTwoMatrices(matrixA);
        printMatrix(transposeOfTwoMatrices);
    }

    private static void printMatrix(Number[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Number[][] getAddingOfTwoMatrices(Number[][] matrixA, Number[][] matrixB) {
        Number resultsMatrix[][] = new Number[matrixA.length][matrixA[0].length];
        Integer i;
        Integer j;
        System.out.println("result of add matrix");
        for (i = 0; i < matrixA.length; i++) {
            for (j = 0; j < matrixA[0].length; j++) {
                resultsMatrix[i][j] = matrixA[i][j].doubleValue() + matrixB[i][j].doubleValue();
            }
        }  return resultsMatrix;
    }

    public static Number[][] getSubstractingOfTwoMatrices(Number[][] matrixA, Number[][] matrixB) {
        Number resultsMatrix[][] = new Number[matrixA.length][matrixA[0].length];
        Integer i;
        Integer j;
        System.out.println("result of substract matrix");
        for (i = 0; i < matrixA.length; i++) {
            for (j = 0; j < matrixA[0].length; j++) {
                resultsMatrix[i][j] = matrixA[i][j].doubleValue() - matrixB[i][j].doubleValue();
            }
        }return resultsMatrix;
    }

    public static Number[][] getMultiplicationOfTwoMatrices(Number[][] matrixA, Number[][] matrixB) {
        Integer i;
        Integer j;
        Integer k;
        Number resultsMatrix[][] = new Number[matrixA.length][matrixA[0].length];
        System.out.println("result of multiplication matrix");
        for(i=0;i<matrixA.length;i++){
            for(j=0;j<matrixA.length;j++){
                Double multipliedValue=0.0;
                for(k=0;k<matrixB[0].length;k++){
                    multipliedValue+=matrixA[i][k].doubleValue()*matrixB[k][j].doubleValue();
                }
                resultsMatrix[i][j]=multipliedValue;
                multipliedValue=0.0;
            }
        }
        return resultsMatrix;
    }

    public static Number[][] getscalarMatrix(Number[][] matrixA) {
        Integer i;
        Integer j;
        Integer k = 2;
        Number resultsMatrix[][] = new Number[matrixA.length][matrixA[0].length];
        System.out.println("result of scalar matrix");
        for (i = 0; i < matrixA.length; i++) {
            for (j = 0; j < matrixA[0].length; j++) {
                resultsMatrix[i][j] = matrixA[i][j].doubleValue() * k.doubleValue();
            }
        }
        return resultsMatrix;
    }

    public static  Number[][] getTransposeOfTwoMatrices(Number[][] matrixA) {
        Integer i;
        Integer j;
        Number resultsMatrix[][] = new Number[matrixA.length][matrixA[0].length];

        System.out.println("result of transpose matrix");
        for (i = 0; i < matrixA.length; i++) {
            for (j = 0; j < matrixA[0].length; j++) {

                resultsMatrix[i][j]=matrixA[j][i].doubleValue();
            }
        }
        return resultsMatrix;
    }
}


