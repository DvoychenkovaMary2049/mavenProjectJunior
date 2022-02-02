package lesson9;



public class Main1 {
    public static void main(String[] args) {

        double[][] forMatrix1 = {
                {3, 6, 6},
                {9, 8, 4},
                {8, 6, 2},
                {5, 6, 1},};

        double[][] forMatrix2 = {
                {2, 2, 6},
                {8, 1, 4},
                {7, 6, 5},
                {6, 6, 6},};

        double [][] forMatrix3 = {
                {2, 2, 6},
                {8, 1, 4},
                {7, 6, 5},};

        double [] [] forMatrix4 = {
                {2, 6},
                {8, 4},};

        double [][] forMatrix5 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},};

        double [][] forMatrix6 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},};



        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);
        Matrix matrix3 = new Matrix(forMatrix3);
        Matrix matrix4 = new Matrix(forMatrix4);
        Matrix matrix5 = new Matrix(forMatrix5);
        Matrix matrix6 = new Matrix(forMatrix6);



        IMatrix matrixAdd = matrix1.add(matrix2);
//        matrixAdd.printToConsole();

        IMatrix matrixSub = matrix1.sub(matrix2);
//        matrixSub.printToConsole();

        IMatrix matrixMul= matrix3.mul(matrix6);
//        matrixMul.printToConsole();

        IMatrix matrixMul2 = matrix1.mul(2);
//        matrixMul2.printToConsole();

        IMatrix matrixTranspose = matrix2.transpose();
//        matrixTranspose.printToConsole();

        matrix1.fillMatrix(5);
//       matrix1.printToConsole();

//        System.out.println(matrix2.determinant());

//        System.out.println(matrix5.isNullMatrix());

        System.out.println(matrix2.isIdentityMatrix());

//        System.out.println(matrix3.isSquareMatrix());
    }
}


