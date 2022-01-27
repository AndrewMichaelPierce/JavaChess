package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Color extends Compression {
    public static ArrayList allSquaresInfluenced = new ArrayList();
    public static ArrayList totalValue = new ArrayList();
    public static ArrayList squaresOccupied = new ArrayList();
    public static ArrayList influence = new ArrayList();

    public static ArrayList newColor() {
        ArrayList<ArrayList> colorArray = new ArrayList<ArrayList>(Arrays.asList(
                allSquaresInfluenced, totalValue, squaresOccupied, influence
        ));
        return colorArray;
    }
}
