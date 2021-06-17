import exc.InvalidDimensionsException;

public class Vector<T extends MathOperations<T>> extends VectorSpace{

    T[] elements;
    int size;

    Vector(T[] elements) throws InvalidDimensionsException {
        this.dimension = new Dimension(elements.length, 1);
        this.elements = elements;
        this.size = elements.length;
    }

    void multiplyWith(Vector<T> other) throws InvalidDimensionsException {
        if(!canMultiply(other)){
            throw new InvalidDimensionsException("Invalid dimensions, vectors" +
                    " must be same size");
        }

        for (int i = 0; i < size; i++) {
            set(i, get(i).mult(other.get(i)));
        }
    }

    void addWith(Vector<T> other) throws InvalidDimensionsException {
        if(!canAdd(other)){
            throw new InvalidDimensionsException("Invalid dimensions, vectors" +
                    " must be same size");
        }

        for (int i = 0; i < size; i++) {
            set(i, get(i).plus(other.get(i)));
        }
    }

    T get(int i){
        return elements[i];
    }

    void set(int i, T val){
        elements[i] = val;
    }

    boolean canMultiply(Vector<T> other){
        return dimension.getRowSize() == other.getDimension().getRowSize();
    }

    boolean canAdd(Vector<T> other){
        return dimension.getRowSize() == other.getDimension().getRowSize();
    }
}
