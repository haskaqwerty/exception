package haskaqwerty.github.exception;
import haskaqwerty.github.exception.math.Matrix;

public class Main {
    public static final String[][] MATRIX={
            {"1","3","1","2"},
            {"1","3","1","2"},
            {"1","3","1","2"},
            {"1","3","1","2"},
    };
    public static final String[][] MATRIX_2={
            {"1","3","1","2"},
            {"1","3","1","2"},
            {"1","3","1","2"}

    };
    public static final String[][] MATRIX_3={
            {"1","3","1","2"},
            {"1","3","1","2"},
            {"1","3","1"},
            {"1","3","1","2"},

    };
    public static final String[][] MATRIX_4={
            {"1","3","hello","2"},
            {"1","3","1","2"},
            {"1","3","1","2"},
            {"1","3","1","2"},
    };

    public static void main(String[] args)
    {
        try{
            System.out.println("Сумма = " + Matrix.sumMatrix(MATRIX_4));
    }
        catch (Matrix.MyArraySizeException e){
            System.out.println("Перехвачен MatrixMyArraySizeException " + e.getMessage());

        }
        catch (Matrix.MyArrayDataException e){
            System.out.println("Перехвачен MatrixMyArrayDataException " + e.getMessage());
        }
    }



}