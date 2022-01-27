package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WhitePawn extends Compression {
    public static final ArrayList color = new ArrayList(Arrays.asList("White"));
    private static final ArrayList influence = new ArrayList(Arrays.asList());
    private static final ArrayList pieceType = new ArrayList(Arrays.asList(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0));
    private static final ArrayList value = new ArrayList(Arrays.asList(3));
    private static final ArrayList icon = new ArrayList(Arrays.asList("♙" + ""));
    public static final ArrayList piece = new ArrayList(Arrays.asList("P"));
    private static final ArrayList locationQueenRook = new ArrayList(Arrays.asList(81));
    private static final ArrayList locationQueenKnight = new ArrayList(Arrays.asList(82));
    private static final ArrayList locationQueenBishop = new ArrayList(Arrays.asList(83));
    private static final ArrayList locationQueenPawn = new ArrayList(Arrays.asList(84));
    private static final ArrayList locationKingPawn = new ArrayList(Arrays.asList(85));
    private static final ArrayList locationKingBishop = new ArrayList(Arrays.asList(86));
    private static final ArrayList locationKingKnight = new ArrayList(Arrays.asList(87));
    private static final ArrayList locationKingRook = new ArrayList(Arrays.asList(88));
    private static final ArrayList legalMoves = new ArrayList(Arrays.asList());
    private static final ArrayList lineOfAttack = new ArrayList(Arrays.asList(9, 11));

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
