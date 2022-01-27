package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WhiteKnight extends Compression {
    public static final ArrayList color = new ArrayList(Arrays.asList("White"));
    private static final ArrayList influence = new ArrayList(Arrays.asList());
    private static final ArrayList pieceType = new ArrayList(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0));
    private static final ArrayList value = new ArrayList(Arrays.asList(3));
    private static final ArrayList icon = new ArrayList(Arrays.asList("♘" + ""));
    public static final ArrayList piece = new ArrayList(Arrays.asList("N"));
    private static final ArrayList locationQueenSide = new ArrayList(Arrays.asList(92));
    private static final ArrayList locationKingSide = new ArrayList(Arrays.asList(97));
    private static final ArrayList legalMoves = new ArrayList(Arrays.asList());
    private static final ArrayList lineOfAttack = new ArrayList(Arrays.asList(-21, -19, -12, -8, 8, 12, 19, 21));

    public static ArrayList newQueenKnight() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationQueenSide, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newKingKnight() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationKingSide, lineOfAttack, legalMoves, influence
        ));
    }
}
