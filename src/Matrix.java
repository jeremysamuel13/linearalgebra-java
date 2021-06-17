import exc.MatrixOutOfBoundsException;

import java.util.Arrays;

public abstract class Matrix<T extends MathOperations<T>> extends VectorSpace {

    private T[][] elements;

    int getRowDimension(){
        return dimension.getRowSize();
    }

    int getColumnDimension(){
        return dimension.getColumnSize();
    }

    Number[] getColumn(T[][] matrix, int column) {
        Object[] t = Arrays.stream(matrix).map(ts -> ts[column].get()).toArray();

        return Arrays.copyOf(t, t.length, Number[].class);
    }

    boolean canAddWith(Matrix<T> rhs){
        return getColumnDimension() == rhs.getColumnDimension() &&
                getRowDimension() == rhs.getColumnDimension();
    }

    boolean canMultiplyWith(Matrix<T> rhs){
        return getColumnDimension() == rhs.getRowDimension();
    }

    abstract void multiplyWith(Matrix<T> rhs);

    abstract void addWith(Matrix<T> rhs);

    abstract void subtractWith(Matrix<T> rhs);

    T get(int i, int j) throws MatrixOutOfBoundsException {
        if(i < 0 || i > getRowDimension()-1)
            throw new MatrixOutOfBoundsException("Matrix row index out of " +
                    "bounds: " + i );
        if(j < 0 || j > getColumnDimension()-1)
            throw new MatrixOutOfBoundsException("Matrix column index out of " +
                    "bounds: " + j );

        return elements[i][j];
    }

    void set(int i, int j, T val) throws MatrixOutOfBoundsException {
        if(i < 0 || i > getRowDimension()-1)
            throw new MatrixOutOfBoundsException("Matrix row index out of " +
                    "bounds: " + i );
        if(j < 0 || j > getColumnDimension()-1)
            throw new MatrixOutOfBoundsException("Matrix column index out of " +
                    "bounds: " + j );

        elements[i][j] = val;
    }

}


