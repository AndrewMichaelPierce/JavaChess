package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BlackPawn extends Compression {
    public static final ArrayList color = new ArrayList(Arrays.asList("Black"));
    private static final ArrayList influence = new ArrayList(Arrays.asList());
    private static final ArrayList pieceType = new ArrayList(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1));
    private static final ArrayList value = new ArrayList(Arrays.asList(3));
    private static final ArrayList icon = new ArrayList(Arrays.asList("♟" + ""));
    public static final ArrayList piece = new ArrayList(Arrays.asList("p"));
    private static final ArrayList locationQueenRook = new ArrayList(Arrays.asList(31));
    private static final ArrayList locationQueenKnight = new ArrayList(Arrays.asList(32));
    private static final ArrayList locationQueenBishop = new ArrayList(Arrays.asList(33));
    private static final ArrayList locationQueenPawn = new ArrayList(Arrays.asList(34));
    private static final ArrayList locationKingPawn = new ArrayList(Arrays.asList(35));
    private static final ArrayList locationKingBishop = new ArrayList(Arrays.asList(36));
    private static final ArrayList locationKingKnight = new ArrayList(Arrays.asList(37));
    private static final ArrayList locationKingRook = new ArrayList(Arrays.asList(38));
    private static final ArrayList legalMoves = new ArrayList(Arrays.asList());
    private static final ArrayList lineOfAttack = new ArrayList(Arrays.asList(-11, -9));

    public static ArrayList newQueenRook() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationQueenRook, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newQueenKnight() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationQueenKnight, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newQueenBishop() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationQueenBishop, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newQueenPawn() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationQueenPawn, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newKingPawn() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationKingPawn, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newKingBishop() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationKingBishop, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newKingKnight() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationKingKnight, lineOfAttack, legalMoves, influence
        ));
    }
    public static ArrayList newKingRook() {
        return new ArrayList<ArrayList>(Arrays.asList(
                color, pieceType, piece, icon, value, locationKingRook, lineOfAttack, legalMoves, influence
        ));
    }
}
