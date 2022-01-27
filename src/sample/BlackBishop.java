package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BlackBishop extends Compression {
    public static final ArrayList color = new ArrayList(Arrays.asList("Black"));
    private static final ArrayList influence = new ArrayList(Arrays.asList());
    private static final ArrayList pieceType = new ArrayList(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0));
    private static final ArrayList value = new ArrayList(Arrays.asList(3));
    private static final ArrayList icon = new ArrayList(Arrays.asList("♝" + ""));
    public static final ArrayList piece = new ArrayList(Arrays.asList("b"));
    private static final ArrayList locationQueenSide = new ArrayList(Arrays.asList(23));
    private static final ArrayList locationKingSide = new ArrayList(Arrays.asList(26));
    private static final ArrayList legalMoves = new ArrayList(Arrays.asList());
    private static final ArrayList lineOfAttack = new ArrayList(Arrays.asList(-11, -9, 9, 11));

    public static ArrayList newQueenBishop() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationQueenSide, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newKingBishop() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationKingSide, lineOfAttack, legalMoves, influence
        ));
    }
}
