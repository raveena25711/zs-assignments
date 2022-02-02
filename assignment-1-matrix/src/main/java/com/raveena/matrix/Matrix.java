package com.raveena.matrix;

public class Matrix {
    public static void main(String[] args) {
        Integer firstMatrix[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};
        Integer secondMatrix[][] = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};

        Number[][] addingOfTwoMatrix = getAddingOfTwoMatrices(firstMatrix, secondMatrix);
        printMatrix(addingOfTwoMatrix);
        Number[][] subtractingOfTwoMatrices = getSubstractingOfTwoMatrices(firstMatrix, secondMatrix);
        printMatrix(subtractingOfTwoMatrices);
        Number[][] multiplicationOfTwoMatrices = getMultiplicationOfTwoMatrices(firstMatrix, secondMatrix);
        printMatrix(multiplicationOfTwoMatrices);
        Number[][] scalarMatrix = getscalarMatrix(firstMatrix);
        printMatrix(scalarMatrix);
        Number[][] transposeOfTwoMatrices = getTransposeOfTwoMatrices(firstMatrix);
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

    public static Number[][] getAddingOfTwoMatrices(Number[][] firstMatrix, Number[][] secondMatrix) {
        Number resultsMatrix[][] = new Number[firstMatrix.length][firstMatrix[0].length];
        Integer i;
        Integer j;
        System.out.println("result of add matrix");
        for (i = 0; i < firstMatrix.length; i++) {
            for (j = 0; j < firstMatrix[0].length; j++) {
                resultsMatrix[i][j] = firstMatrix[i][j].doubleValue() + secondMatrix[i][j].doubleValue();
            }
        }  return resultsMatrix;
    }

    public static Number[][] getSubstractingOfTwoMatrices(Number[][] firstMatrix, Number[][] secondMatrix) {
        Number resultsMatrix[][] = new Number[firstMatrix.length][firstMatrix[0].length];
        Integer i;
        Integer j;
        System.out.println("result of substract matrix");
        for (i = 0; i < firstMatrix.length; i++) {
            for (j = 0; j < firstMatrix[0].length; j++) {
                resultsMatrix[i][j] = firstMatrix[i][j].doubleValue() - secondMatrix[i][j].doubleValue();
            }
        }return resultsMatrix;
    }

    public static Number[][] getMultiplicationOfTwoMatrices(Number[][] firstMatrix, Number[][] secondMatrix) {
        Integer i;
        Integer j;
        Integer k;
        Number resultsMatrix[][] = new Number[firstMatrix.length][firstMatrix[0].length];
        System.out.println("result of multiplication matrix");
        for(i=0;i<firstMatrix.length;i++){
            for(j=0;j<firstMatrix.length;j++){
                Double multipliedValue=0.0;
                for(k=0;k<secondMatrix[0].length;k++){
                    multipliedValue+=firstMatrix[i][k].doubleValue()*secondMatrix[k][j].doubleValue();
                }
                resultsMatrix[i][j]=multipliedValue;
                multipliedValue=0.0;
            }
        }
        return resultsMatrix;
    }

    public static Number[][] getscalarMatrix(Number[][] firstMatrix) {
        Integer i;
        Integer j;
        Integer k = 2;
        Number resultsMatrix[][] = new Number[firstMatrix.length][firstMatrix[0].length];
        System.out.println("result of scalar matrix");
        for (i = 0; i < firstMatrix.length; i++) {
            for (j = 0; j < firstMatrix[0].length; j++) {
                resultsMatrix[i][j] = firstMatrix[i][j].doubleValue() * k.doubleValue();
            }
        }
        return resultsMatrix;
    }

    public static  Number[][] getTransposeOfTwoMatrices(Number[][] firstMatrix) {
        Integer i;
        Integer j;
        Number resultsMatrix[][] = new Number[firstMatrix.length][firstMatrix[0].length];

        System.out.println("result of transpose matrix");
        for (i = 0; i < firstMatrix[0].length; i++) {
            for (j = 0; j < firstMatrix.length; j++) {

                resultsMatrix[i][j]=firstMatrix[j][i].doubleValue();
            }
        }
        return resultsMatrix;
    }
}


