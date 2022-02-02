package lesson9;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int rows, int cols) {
        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;

    }

    @Override
    public int getRows() { //Возвращает количество строк матрицы
        return numbers.length;
    }

    @Override
    public int getColumns() { //Возвращает количество столбцов матрицы
        return this.numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        //Возвращает элемент матрицы по индексам
        if (this.getRows() <= rowIndex) {
            System.out.println("Превысили кол-во строк");
            return -1;
        }
        if (this.getColumns() <= colIndex) {
            System.out.println("Превысили кол-во колонок");
            return -1;
        }

        return this.numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        //Устанавливает элемент матрицы по индексам
        if (this.getRows() <= rowIndex) {
            System.out.println("Нет такого кол-ва строк");
            return;
        }
        if (this.getColumns() <= colIndex) {
            System.out.println("Нет такого кол-ва колонок");
            return;
        }

        this.numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { // сложение матриц
        // this - matrix1
        // otherMatrix - matrix2
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы складывать нельзя.Кол-во строк не совпадает.");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы складывать нельзя.Кол-во колонок не совпадает.");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }

        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { // разность матриц
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы вычитать нельзя.Кол-во строк не совпадает.");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы вычитать нельзя.Кол-во колонок не совпадает.");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }

        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { // произведение матриц
        if (this.getRows() != otherMatrix.getColumns()) {
            System.out.println("Матрицы умножать нельзя.Кол-во строк первой матрицы и кол-во строк второй матрицы не совпадают.");
            return null;

        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++){
                    result.setValueAt(i,j, result.getValueAt(i,j) + (this.getValueAt(i,k) * otherMatrix.getValueAt(k,j)));
                }
            }

        }
        return result;
    }

    @Override
    public IMatrix mul(double value) { // произведение матрицы на число
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() { // транспонированная матрица
        Matrix result = new Matrix(getColumns(), getRows());
        for (int i = 0; i < getColumns(); i++) {
            for (int j = 0; j < getRows(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }


    @Override
    public void fillMatrix(double value) { // Заполняет текущю матрицу заданным значением
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.numbers[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() { // детерминант матрицы
        double d = 0;

        if (this.getRows() != this.getColumns()) {
            System.out.println("Матрица не квадратная");
            return 0;
        }
        {
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    d = this.numbers[0][0] * this.numbers[1][1] - this.numbers[1][0] * this.numbers[0][1];
                }
            }
        }
        if (this.getRows() == 3) {
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    d = this.numbers[0][0] * this.numbers[1][1] * this.numbers[2][2] + this.numbers[0][1] * this.numbers[1][2] *
                            this.numbers[2][0] + this.numbers[0][2] * this.numbers[1][0] * this.numbers[2][1] - this.numbers[0][2] *
                            this.numbers[1][1] * this.numbers[2][0] - this.numbers[0][0] * this.numbers[1][2] * this.numbers[2][1] -
                            this.numbers[0][1] * this.numbers[1][0] * this.numbers[2][2];
                }

            }

        }
        return d;
    }


    @Override
    public boolean isNullMatrix() { // проверяет нулевая ли матрица
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() { // является ли матрица единичной (главная диагональ 1, остальное 0)
//        int zero = 0;
//        int unit = 0;
//
//        for (int i = 0; i < this.getRows(); i++) {
//            for (int j = 0; j < this.getColumns(); j++) {
//                if (i == j && this.numbers[i][j] == 1) {
//                    unit++;
//                }
//                {
//                    if (i != j && this.numbers[i][j] == 0) {
//                        zero++;
//                    }
//                    if (unit == this.getRows() && zero == this.getColumns() * (this.getColumns() - 1)) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i != j && this.numbers[i][j] != 0) {
                    return false;
                }
                if (i == j && numbers[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() { // является ли матрица квадратной
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }

    }

}
