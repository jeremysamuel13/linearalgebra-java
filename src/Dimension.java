import exc.InvalidDimensionsException;

import java.util.Arrays;
import java.util.List;

public class Dimension {

    protected int row, columns;

    Dimension(int row, int columns) throws InvalidDimensionsException {
        if(row < 0 || columns < 0){
            throw new InvalidDimensionsException("Dimensions have to be over " +
                    "0");
        }

        this.row = row;
        this.columns = columns;
    }

    static boolean isValid(Dimension d) {
        return d.row >= 0 && d.columns >= 0;
    }

    List<Integer> getDimensions(){
        return Arrays.asList(row, columns);
    }

    int getRowSize(){
        return row;
    }

    int getColumnSize(){
        return columns;
    }

}
