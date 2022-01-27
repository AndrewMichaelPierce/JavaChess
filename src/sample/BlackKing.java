package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BlackKing extends Compression {
    public static final ArrayList color = new ArrayList(Arrays.asList("Black"));
    private static final ArrayList influence = new ArrayList(Arrays.asList());
    private static final ArrayList pieceType = new ArrayList(Arrays.asList(0,0,0,0,0,0,1,0,0,0,0,0));
    private static final ArrayList value = new ArrayList(Arrays.asList(99));
    private static final ArrayList icon = new ArrayList(Arrays.asList("♚" + ""));
    public static final ArrayList piece = new ArrayList(Arrays.asList("k"));
    private static final ArrayList location = new ArrayList(Arrays.asList(25));
    private static final ArrayList legalMoves = new ArrayList(Arrays.asList());
    private static final ArrayList lineOfAttack = new ArrayList(Arrays.asList(-11, -10, -9, -1, 1, 9, 10, 11));

    public static ArrayList newKing() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, location, lineOfAttack, legalMoves, influence
        ));
    }
}
