package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WhiteKing extends Compression {
    public static final ArrayList color = new ArrayList(Arrays.asList("White"));
    private static final ArrayList influence = new ArrayList(Arrays.asList());
    private static final ArrayList pieceType = new ArrayList(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0,0));
    private static final ArrayList value = new ArrayList(Arrays.asList(99));
    private static final ArrayList icon = new ArrayList(Arrays.asList("♔" + ""));
    public static final ArrayList piece = new ArrayList(Arrays.asList("K"));
    private static final ArrayList location = new ArrayList(Arrays.asList(95));
    private static final ArrayList legalMoves = new ArrayList(Arrays.asList());
    private static final ArrayList lineOfAttack = new ArrayList(Arrays.asList(-11, -10, -9, -1, 1, 9, 10, 11));

    public static ArrayList newKing() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, location, lineOfAttack, legalMoves, influence
        ));
    }
}
