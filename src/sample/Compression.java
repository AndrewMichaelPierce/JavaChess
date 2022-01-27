package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Compression extends Spark {
    //Chessboard chessboard4 = new Chessboard();
    public static ArrayList<ArrayList<ArrayList>> gamePiece = new ArrayList<ArrayList<ArrayList>>(Arrays.asList());
    public static ArrayList gameScore = new ArrayList();
    public static ArrayList move = new ArrayList();
    public static ArrayList check = new ArrayList();
    public static ArrayList castleKingSide = new ArrayList();
    public static ArrayList castleQueenSide = new ArrayList();
    public static ArrayList castleArray = new ArrayList();
    public static ArrayList enPassantTrueFalse = new ArrayList();
    public static ArrayList enPassantArray = new ArrayList();
    public static ArrayList blank = Chessboard.blank;
    public static ArrayList letterBoard = Chessboard.letterBoard;
    public static ArrayList whiteInfluence = Chessboard.whiteInfluence;
    public static ArrayList blackInfluence = Chessboard.blackInfluence;
    public static ArrayList occupiedXBoard = Chessboard.occupiedXBoard;
    public static ArrayList human = Chessboard.human;
    public static ArrayList legal = Chessboard.legal;
    public static ArrayList<ArrayList> white = Color.newColor();
    public static ArrayList<ArrayList> black = Color.newColor();

    //public static String newGame(String playerColor);

    public static ArrayList newGame(ArrayList<ArrayList<ArrayList>> gameData) {
        //System.out.println(gameData);
        gamePiece = (ArrayList<ArrayList<ArrayList>>) gameData.get(8).clone();
        white = (ArrayList<ArrayList>) gameData.get(10).clone();
        black = (ArrayList<ArrayList>) gameData.get(11).clone();
        //System.out.println(gamePiece);

        gamePiece.add(WhiteKing.newKing());
        gamePiece.add(BlackKing.newKing());

        gamePiece.add(WhiteQueen.newQueen());
        gamePiece.add(BlackQueen.newQueen());


        gamePiece.add(WhiteRook.newQueenRook());
        gamePiece.add(WhiteRook.newKingRook());
        gamePiece.add(BlackRook.newQueenRook());
        gamePiece.add(BlackRook.newKingRook());

        gamePiece.add(WhiteBishop.newQueenBishop());
        gamePiece.add(WhiteBishop.newKingBishop());
        gamePiece.add(BlackBishop.newQueenBishop());
        gamePiece.add(BlackBishop.newKingBishop());
        gamePiece.add(WhiteKnight.newQueenKnight());
        gamePiece.add(WhiteKnight.newKingKnight());
        gamePiece.add(BlackKnight.newQueenKnight());
        gamePiece.add(BlackKnight.newKingKnight());

        gamePiece.add(WhitePawn.newQueenRook());
        gamePiece.add(WhitePawn.newQueenKnight());
        gamePiece.add(WhitePawn.newQueenBishop());
        gamePiece.add(WhitePawn.newQueenPawn());
        gamePiece.add(WhitePawn.newKingPawn());
        gamePiece.add(WhitePawn.newKingBishop());
        gamePiece.add(WhitePawn.newKingKnight());
        gamePiece.add(WhitePawn.newKingRook());
        gamePiece.add(BlackPawn.newQueenRook());
        gamePiece.add(BlackPawn.newQueenKnight());
        gamePiece.add(BlackPawn.newQueenBishop());
        gamePiece.add(BlackPawn.newQueenPawn());
        gamePiece.add(BlackPawn.newKingPawn());
        gamePiece.add(BlackPawn.newKingBishop());
        gamePiece.add(BlackPawn.newKingKnight());
        gamePiece.add(BlackPawn.newKingRook());


        ArrayList emptyColorArray = new ArrayList();
        for (int i = 0; i < 4; i++) {
            white.add(emptyColorArray);
            black.add(emptyColorArray);
        }
        System.out.println(white);
        white.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 1));
        black.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 0));
        System.out.println(white);
        createOccupiedXBoard(white, black);
        System.out.println("occupiedXBoard");
        printBoard(occupiedXBoard);

        createLetterBoardWhileInProgress(gamePiece);
        //System.out.println("\nletterBoard");
        //printBoard(letterBoard);

        createAllMovesOneOfTwo();
        createAllMovesTwoOfTwo();

        //System.out.println("\n");
        //for (ArrayList<ArrayList> Piece : gamePiece) {
            //System.out.println(Piece);
        //}

        createInfluenceBoards();
        //System.out.println("\nwhiteInfluence");
        //printBoard(whiteInfluence);
        //System.out.println("\nblackInfluence");
        //printBoard(blackInfluence);

        //System.out.println("\ncreateActiveIconBoard(gamePiece)");
        //createActiveIconBoard(gamePiece);
        createLegalBoard(gamePiece);
        //System.out.println("\nlegal");
        //printBoard(legal);
/*
        String moveColor = newMove.get(0).toString();
        moveColor = moveColor.substring( 1, moveColor.length() - 1 );
        ArrayList<ArrayList<ArrayList>> piecesAsColor = new ArrayList<>();
        ArrayList<ArrayList<ArrayList>> piecesWithLegalMoves = new ArrayList<>();
        for (int i = 0; i < gamePiece.size(); i++) {
            String letter = gamePiece.get(i).get(0).get(0).toString();
            if (moveColor.equals("Black")) {
                if (letter.equals("Black")) {
                    piecesAsColor.add(gamePiece.get(i));
                }
            } else {
                if (letter.equals("White")) {
                    piecesAsColor.add(gamePiece.get(i));
                }
            }
        }
        for (int i = 0; i < piecesAsColor.size(); i++) {
            if (piecesAsColor.get(i).get(7).size() > 0) {
                piecesWithLegalMoves.add(piecesAsColor.get(i));
            }
        }

        int pieceToMove;
        int moveToMake;
        String colorPlayer = gameData.get(9).toString();
        colorPlayer = colorPlayer.substring( 1, colorPlayer.length() - 1 );
        colorPlayer = colorPlayer.substring( 1, colorPlayer.length() - 1 );
        System.out.println(moveColor + " " + colorPlayer);
        System.out.println(moveColor.equals(colorPlayer));
        if (!moveColor.equals(colorPlayer)) {
            //String moveInput = input.toString();
            int max = piecesWithLegalMoves.size();
            int min = 0;
            int range = max - min + 1;
            pieceToMove = (int) (Math.random() * (piecesWithLegalMoves.size()));
            moveToMake = (int) (Math.random() * (piecesWithLegalMoves.get(pieceToMove).get(7).size()));
        } else {
            System.out.println(gameData.get(1));
            String temppieceToMove = gameData.get(1).get(1).get(0).toString();
            String tempmoveToMake = gameData.get(1).get(1).get(1).toString();
            pieceToMove = Integer.parseInt(temppieceToMove);
            moveToMake = Integer.parseInt(tempmoveToMake);
        }
        String startingSquare;
        String endingSquare;
        if (!moveColor.equals(colorPlayer)) {
            startingSquare = piecesWithLegalMoves.get(pieceToMove).get(5).get(0).toString();
            endingSquare = piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake).toString();
        } else {
            startingSquare = String.valueOf(pieceToMove);
            endingSquare = String.valueOf(moveToMake);
        }


        //Check if legal move
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            if (gamePiece.get(i).get(5).contains(startingSquare)) {
                for (int x = 0, len2 = gamePiece.get(i).get(7).size(); x < len2; x++) {
                    if (gamePiece.get(i).get(7).get(x).equals(endingSquare)) {
                        //System.out.println("Legal move = " + true);
                    }
                }
            }
        }





        //Remove taken piece
        int intToRemove = 0;
        boolean removePiece = false;
        for (int z = 0, len = gamePiece.size(); z < len; z++) {
            //System.out.println(gamePiece.get(z).get(5).get(0) + " " + piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake));
            if (gamePiece.get(z).get(5).get(0).equals(startingSquare)) {
                    intToRemove = z;
                    removePiece = true;
            }
        }
        if (removePiece) {
            gamePiece.remove(intToRemove);
        }
        //System.out.println(intToRemove);
        System.out.println(endingSquare);
        //Change moved piece to new location
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            for (int x = 0, len2 = gamePiece.get(i).get(7).size(); x < len2; x++) {
                if (gamePiece.get(i).equals(pieceToMove)) {
                    gamePiece.get(i).get(5).set(0, endingSquare);
                }
            }
        }

        for (int x = 0; x < 4; x++) {
            white.get(x).clear();
            black.get(x).clear();
        }

        //Chessboard chessboard3 = new Chessboard();
        //ArrayList occupiedXBoard = chessboard3.createOccupiedXBoard();
        occupiedXBoard = new ArrayList(Arrays.asList(
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200,  21,  22,  23,  24,  25,  26,  27,  28, 200,
                200,  31,  32,  33,  34,  35,  36,  37,  38, 200,
                200,  41,  42,  43,  44,  45,  46,  47,  48, 200,
                200,  51,  52,  53,  54,  55,  56,  57,  58, 200,
                200,  61,  62,  63,  64,  65,  66,  67,  68, 200,
                200,  71,  72,  73,  74,  75,  76,  77,  78, 200,
                200,  81,  82,  83,  84,  85,  86,  87,  88, 200,
                200,  91,  92,  93,  94,  95,  96,  97,  98, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200
        ));
        white.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 1));
        black.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 0));
        //createOccupiedXBoard(white, black);
        //printBoard(occupiedXBoard);

        Chessboard chessboard2 = new Chessboard();
        ArrayList iconBoard2 = chessboard2.createIconBoard();
        //System.out.println(gamePiece);
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            String setCell = gamePiece.get(i).get(5).toString();
            iconBoard2.set(Integer.parseInt(setCell.substring(1, setCell.length() - 1)), gamePiece.get(i).get(3).get(0));
        }
        printBoard(iconBoard2);

 */
        return new ArrayList<ArrayList>(Arrays.asList(gameScore, gameData.get(1), check, castleKingSide, castleQueenSide, castleArray, enPassantTrueFalse, enPassantArray, gamePiece, gameData.get(9), white, black));
    }

    public static ArrayList continueGame(ArrayList<ArrayList<ArrayList>> gameData, int firstMove) {
        gamePiece = (ArrayList<ArrayList<ArrayList>>) gameData.get(8).clone();
        ArrayList newMove = new ArrayList();
        newMove = (ArrayList) gameData.get(1).clone();
        System.out.println("newMove contains: " + newMove);
        //gamePiece.add((ArrayList)gameData.get(8));
        //gamePiece.remove(gamePiece.size()-1);
        //gamePiece.remove(gamePiece.size()-1);
        //System.out.println("\n" + gamePiece);
        for (int i = 0;i < gamePiece.size(); i++) {
            for (int x = 7; x < 9; x++) {
                //System.out.println(i + " " + x);
                //if (gamePiece.get(i).get(x).get(0).equals("White") || gamePiece.get(i).get(x).get(0).equals("Black") || gamePiece.get(i).get(x).size() == 0) {
               // } else {
                    gamePiece.get(i).get(x).clear();
               // }
            }
        }

        //System.out.println(gamePiece);
         legal = new ArrayList(Arrays.asList(
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200,  21,  22,  23,  24,  25,  26,  27,  28, 200,
                200,  31,  32,  33,  34,  35,  36,  37,  38, 200,
                200,  41,  42,  43,  44,  45,  46,  47,  48, 200,
                200,  51,  52,  53,  54,  55,  56,  57,  58, 200,
                200,  61,  62,  63,  64,  65,  66,  67,  68, 200,
                200,  71,  72,  73,  74,  75,  76,  77,  78, 200,
                200,  81,  82,  83,  84,  85,  86,  87,  88, 200,
                200,  91,  92,  93,  94,  95,  96,  97,  98, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200
        ));
        occupiedXBoard = new ArrayList(Arrays.asList(
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200,  21,  22,  23,  24,  25,  26,  27,  28, 200,
                200,  31,  32,  33,  34,  35,  36,  37,  38, 200,
                200,  41,  42,  43,  44,  45,  46,  47,  48, 200,
                200,  51,  52,  53,  54,  55,  56,  57,  58, 200,
                200,  61,  62,  63,  64,  65,  66,  67,  68, 200,
                200,  71,  72,  73,  74,  75,  76,  77,  78, 200,
                200,  81,  82,  83,  84,  85,  86,  87,  88, 200,
                200,  91,  92,  93,  94,  95,  96,  97,  98, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200
        ));
        blank = new ArrayList(Arrays.asList(
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200,  21,  22,  23,  24,  25,  26,  27,  28, 200,
                200,  31,  32,  33,  34,  35,  36,  37,  38, 200,
                200,  41,  42,  43,  44,  45,  46,  47,  48, 200,
                200,  51,  52,  53,  54,  55,  56,  57,  58, 200,
                200,  61,  62,  63,  64,  65,  66,  67,  68, 200,
                200,  71,  72,  73,  74,  75,  76,  77,  78, 200,
                200,  81,  82,  83,  84,  85,  86,  87,  88, 200,
                200,  91,  92,  93,  94,  95,  96,  97,  98, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200
        ));

        white.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 1));
        black.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 0));
        System.out.println("White.get(2): " + white.get(2));
        createOccupiedXBoard(white, black);
        System.out.println("occupiedXBoard");
        printBoard(occupiedXBoard);

        createLetterBoardWhileInProgress(gamePiece);
        //System.out.println("\nletterBoard");
        //printBoard(letterBoard);

        createAllMovesOneOfTwo();
        createAllMovesTwoOfTwo();


        //System.out.println("\n");
        //for (ArrayList<ArrayList> Piece : gamePiece) {
        //    System.out.println(Piece);
        //}


        createInfluenceBoards();
        //System.out.println("\nwhiteInfluence");
        //printBoard(whiteInfluence);
        //System.out.println("\nblackInfluence");
        //printBoard(blackInfluence);

        //System.out.println("\ncreateActiveIconBoard(gamePiece)");
        //createActiveIconBoard(gamePiece);
        createLegalBoard(gamePiece);
        //System.out.println("\nlegal");
        //printBoard(legal);


        String moveColor = "White";

        moveColor = returnMoveColor(moveColor, newMove, firstMove);

        ArrayList<ArrayList<ArrayList>> piecesAsColor = new ArrayList<>();
        ArrayList<ArrayList<ArrayList>> piecesWithLegalMoves = new ArrayList<>();
        for (int i = 0; i < gamePiece.size(); i++) {
            String letter = gamePiece.get(i).get(0).get(0).toString();
            if (moveColor.equals("Black")) {
                if (letter.equals("Black")) {
                    piecesAsColor.add(gamePiece.get(i));
                }
            } else {
                if (letter.equals("White")) {
                    piecesAsColor.add(gamePiece.get(i));
                }
            }
        }
        for (int i = 0; i < piecesAsColor.size(); i++) {
            if (piecesAsColor.get(i).get(7).size() > 0) {
                piecesWithLegalMoves.add(piecesAsColor.get(i));
            }
        }
        int pieceToMove = 0;
        int moveToMake = 0;
        String colorPlayer = gameData.get(9).toString();
        colorPlayer = colorPlayer.substring( 1, colorPlayer.length() - 1 );
        colorPlayer = colorPlayer.substring( 1, colorPlayer.length() - 1 );
        System.out.println(" MoveColor: " + moveColor + "    colorPlayer: " + colorPlayer + " || If not the same then random moves.");
        if (!moveColor.equals(colorPlayer)) {
            int max = piecesWithLegalMoves.size();
            int min = 0;
            int range = max - min + 1;
            pieceToMove = (int) (Math.random() * (piecesWithLegalMoves.size()));
            moveToMake = (int) (Math.random() * (piecesWithLegalMoves.get(pieceToMove).get(7).size()));
            System.out.println("The computer player is " + !colorPlayer.equals(colorPlayer) + " or not " + colorPlayer + " and is playing random moves.  pieceToMove: " + pieceToMove + "   moveToMake: " + moveToMake);
        } else {
            int isFirstMove = firstMove;
           if (isFirstMove < 1) {
                System.out.println("First move achieved");
                String temppieceToMove = gameData.get(1).get(1).get(0).toString();
                String tempmoveToMake = gameData.get(1).get(1).get(1).toString();
                pieceToMove = Integer.parseInt(temppieceToMove);
                moveToMake = Integer.parseInt(tempmoveToMake);
                System.out.println("The player is" + !moveColor.equals(colorPlayer) + " or is " + colorPlayer + "and is playing their move. pieceToMove: " + pieceToMove + " moveToMake: " + moveToMake);

            } else {
                System.out.println("Every move after.");
                System.out.println(gameData.get(1).get(1).get(0).toString());
                System.out.println(gameData.get(1).get(1).get(1).toString());


                String temppieceToMove = gameData.get(1).get(1).get(0).toString();
                String tempmoveToMake = gameData.get(1).get(1).get(1).toString();

                pieceToMove = Integer.parseInt(temppieceToMove);
                moveToMake = Integer.parseInt(tempmoveToMake);
                System.out.println(gameData.get(1).get(1));
                System.out.println("Every move after value: " + pieceToMove + " " + moveToMake);
            }
        }

        String startingSquare;
        String endingSquare;
        if (!moveColor.equals(colorPlayer)) {
            startingSquare = piecesWithLegalMoves.get(pieceToMove).get(5).get(0).toString();
            endingSquare = piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake).toString();
            System.out.println("Not " + colorPlayer + " moves translated into players language. startingSquare: " + startingSquare + "   endingSquare: " + endingSquare);
        } else {
            startingSquare = String.valueOf(pieceToMove);
            endingSquare = String.valueOf(moveToMake);
            System.out.println(colorPlayer + "'s or the 'player' moves translated to: startingSquare: " + startingSquare + "    endingSquare: " + endingSquare);
        }


        //Check if legal move
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            //if (gamePiece.get(i).get(5).contains(piecesWithLegalMoves.get(pieceToMove).get(5).get(0))) {
                if (gamePiece.get(i).get(5).contains(startingSquare)) {
                for (int x = 0, len2 = gamePiece.get(i).get(7).size(); x < len2; x++) {
                    //if (gamePiece.get(i).get(7).get(x).equals(piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake))) {
                    if (gamePiece.get(i).get(7).get(x).equals(endingSquare)) {
                        //System.out.println("Legal move = " + true);
                    }
                }
            }
        }



        //Remove taken piece
        int intToRemove = 0;
        boolean removePiece = false;
        for (int z = 0, len = gamePiece.size(); z < len; z++) {
            //System.out.println(gamePiece.get(z).get(5).get(0) + " " + piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake));
            //if (gamePiece.get(z).get(5).get(0).equals(piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake))) {
            System.out.println("gamePiece.get(z).get(5).get(0) " + gamePiece.get(z).get(5).get(0) + "  endingSquare: " + endingSquare);
            if ((gamePiece.get(z).get(5).get(0).toString()).equals((endingSquare).toString())) {
                System.out.println(true);
                intToRemove = z;
                removePiece = true;
            }
        }
        if (removePiece) {
            gamePiece.remove(intToRemove);
        }

        //System.out.println(intToRemove);
        //Change moved piece to new location
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            //for (int x = 0, len2 = gamePiece.get(i).get(7).size(); x < len2; x++) {
                //if (gamePiece.get(i).equals(piecesWithLegalMoves.get(pieceToMove))) {
                //    gamePiece.get(i).get(5).set(0, piecesWithLegalMoves.get(pieceToMove).get(7).get(moveToMake));
                if (gamePiece.get(i).get(5).get(0).toString().equals(startingSquare)) {
                    gamePiece.get(i).get(5).set(0, Integer.parseInt(endingSquare));
                }
            //}
        }

        for (int x = 0; x < 4; x++) {
            white.get(x).clear();
            black.get(x).clear();
        }

        //Chessboard chessboard3 = new Chessboard();
        //ArrayList occupiedXBoard = chessboard3.createOccupiedXBoard();
        occupiedXBoard = new ArrayList(Arrays.asList(
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200,  21,  22,  23,  24,  25,  26,  27,  28, 200,
                200,  31,  32,  33,  34,  35,  36,  37,  38, 200,
                200,  41,  42,  43,  44,  45,  46,  47,  48, 200,
                200,  51,  52,  53,  54,  55,  56,  57,  58, 200,
                200,  61,  62,  63,  64,  65,  66,  67,  68, 200,
                200,  71,  72,  73,  74,  75,  76,  77,  78, 200,
                200,  81,  82,  83,  84,  85,  86,  87,  88, 200,
                200,  91,  92,  93,  94,  95,  96,  97,  98, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200,
                200, 200, 200, 200, 200, 200, 200, 200, 200, 200
        ));
        white.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 1));
        black.set(2, fillEachColorsSquaresOccupiedArray(gamePiece, 0));
        //createOccupiedXBoard(white, black);
        //printBoard(occupiedXBoard);

        Chessboard chessboard2 = new Chessboard();
        ArrayList iconBoard2 = chessboard2.createIconBoard();
        //System.out.println(gamePiece);
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            String setCell = gamePiece.get(i).get(5).toString();
            iconBoard2.set(Integer.parseInt(setCell.substring(1, setCell.length() - 1)), gamePiece.get(i).get(3).get(0));
        }
        printBoard(iconBoard2);

        ArrayList emptyArray = new ArrayList();
        ArrayList<ArrayList> nextMove = new ArrayList<ArrayList>(Arrays.asList(emptyArray, emptyArray));
        System.out.println("move after initilization: " + move);

        if (moveColor.equals("White")) {
            nextMove.get(0).add(0, "Black");
        } else {
            nextMove.get(0).add(0, "White");
        }


        System.out.println("");
        nextMove.get(0).add(0, ((colorPlayer.equals("White")) ? "Black" : "White"));
        nextMove.get(1).set(0, Integer.parseInt(startingSquare));
        nextMove.get(1).add(1, Integer.parseInt(endingSquare));
        //gameData.set(1, nextMove);
        System.out.println("Changing color: " + nextMove);
        return new ArrayList<ArrayList>(Arrays.asList(gameScore, gameData.set(1, newMove), check, castleKingSide, castleQueenSide, castleArray, enPassantTrueFalse, enPassantArray, gamePiece, gameData.get(9), white, black));
    }


    //****************************************************************************

    public static String returnMoveColor(String moveColor, ArrayList newMove, int firstMove){
        int ifFirstMove = firstMove;
        if (ifFirstMove < 1) {
            System.out.println(newMove.get(0).toString() + " the new move color.");
            moveColor = newMove.get(0).toString();
            moveColor = moveColor.substring(1, moveColor.length() - 1);
            System.out.println(moveColor + " first new move result");
            return moveColor;
        } else if (ifFirstMove % 2 == 0) {
            System.out.println(newMove.get(0).toString() + " the other new moves.");
            moveColor = newMove.get(0).toString();
            System.out.println(moveColor);
            moveColor = moveColor.substring(1, moveColor.length() - 1);
            System.out.println(moveColor + " other new move results.");
            return "White";
        } else {
            System.out.println(newMove.get(0).toString() + " the other new moves.");
            moveColor = newMove.get(0).toString();
            System.out.println(moveColor);
            moveColor = moveColor.substring(1, moveColor.length() - 1);
            System.out.println(moveColor + " other new move results.");
            return "Black";
        }
    }

    public static void printBoard(ArrayList boardInput) {
        String result = "";
        int m = 0;
        boolean blackWhite = true;
        for (int i = 21; i < 101; i += 10) {
            for (int x = i; x < i + 8; x++) {
                if ((!(boardInput.get(x) instanceof String)) && !blackWhite) {
                    result += ("\u25A1");
                    blackWhite = true;
                } else if ((!(boardInput.get(x) instanceof String)) && blackWhite) {
                    result += "\u25A0";
                    blackWhite = false;
                } else if (blackWhite) {
                    result += boardInput.get(x);
                    blackWhite = false;
                } else {
                    result += boardInput.get(x);
                    blackWhite = true;
                }
                m++;
                if (m % 8 == 0) {
                    blackWhite = !blackWhite;
                }
            }
            result += "\n";
        }
        System.out.print(result);
    }

    public static ArrayList fillEachColorsSquaresOccupiedArray(ArrayList<ArrayList<ArrayList>> game, int zeroBlackOneWhite) {
        ArrayList occupiedSquares = new ArrayList();
        if (zeroBlackOneWhite == 1) {
            for(int i = 0, len = game.size(); i < len; i++) {
                //System.out.print(i);
                System.out.println(game.get(i).get(0).get(0));
                if (game.get(i).get(0).get(0).equals("White")) {
                    occupiedSquares.add(game.get(i).get(5));
                }
            }
        } else {
            for(int i = 0, len = game.size(); i < len; i++) {
                if (game.get(i).get(0).get(0).equals("Black")) {
                    occupiedSquares.add(game.get(i).get(5));
                }
            }
        }
        System.out.println(occupiedSquares);
        return occupiedSquares;
    }

    public static void createOccupiedXBoard(ArrayList<ArrayList> white, ArrayList<ArrayList> black) {
        for (int i = 0, len = white.get(2).size(); i < len; i++) {
            String setCell = white.get(2).get(i).toString();
            System.out.println(setCell.substring(1, setCell.length() - 1));
            occupiedXBoard.set(Integer.parseInt(setCell.substring(1, setCell.length() - 1)), "X");
        }
        for (int i = 0, len = black.get(2).size(); i < len; i++) {
            String setCell = black.get(2).get(i).toString();
            occupiedXBoard.set(Integer.parseInt(setCell.substring(1, setCell.length() - 1)), "x");
        }
    }

    public static void createLetterBoardWhileInProgress(ArrayList<ArrayList<ArrayList>> gamePiece) {
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            String setCell = gamePiece.get(i).get(5).toString();
            letterBoard.set(Integer.parseInt(setCell.substring(1, setCell.length() - 1)), gamePiece.get(i).get(2).get(0));
        }
    }

    public static void createLegalBoard(ArrayList<ArrayList<ArrayList>> gamePiece) {
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            for (int move = 0, moveLEN = gamePiece.get(i).get(7).size(); move < moveLEN; move++) {
                int setCell = Integer.parseInt(gamePiece.get(i).get(7).get(move).toString());
                legal.set(setCell, "x");
            }
        }
    }

    public static void createActiveIconBoard(ArrayList<ArrayList<ArrayList>> gamePiece) {
        Chessboard chessboard = new Chessboard();
        ArrayList iconBoard = chessboard.blank;
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            String setCell = gamePiece.get(i).get(5).toString();
            iconBoard.set(Integer.parseInt(setCell.substring(1, setCell.length() - 1)), gamePiece.get(i).get(3).get(0));
        }
        printBoard(iconBoard);
    }

    //***********************************************************************************************************
    //***********************************************************************************************************

    public static void createAllMovesOneOfTwo() {
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            switch (gamePiece.get(i).get(2).get(0).toString()) {
                case "K": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setWhite = new ArrayList();
                    int whiteCounter = 0;
                    for (int x = 0; x < 8; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) || String.valueOf(occupiedXBoard.get(instanceOfLocationInt +
                                lineOfAttackInt)).equals("X") || String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                            if (occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt).equals("X")) {
                                setWhite.add(whiteCounter, blank.get(instanceOfLocationInt + lineOfAttackInt));
                                whiteCounter++;
                            } else if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                                setInfluence.add(influenceCounter, String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt)));
                                setWhite.add(whiteCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                whiteCounter++;
                            } else {
                                setInfluence.add(influenceCounter, String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt)));
                                setWhite.add(whiteCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                whiteCounter++;
                            }
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    ArrayList setWhiteOriginal = new ArrayList(white.get(0));
                    ArrayList setWhiteCopy = new ArrayList(setWhite);
                    setWhiteCopy.removeAll(setWhiteOriginal);
                    setWhiteOriginal.addAll(setWhiteCopy);
                    white.set(0, setWhiteOriginal);
                    break;
                }
                case "k": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setBlack = new ArrayList();
                    int blackCounter = 0;
                    for (int x = 0; x < 8; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) || String.valueOf(occupiedXBoard.get(instanceOfLocationInt +
                                lineOfAttackInt)).equals("X") || String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                            if (occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt).equals("x")) {
                                setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                blackCounter++;
                            } else if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("X")) {
                                setInfluence.add(influenceCounter, String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt)));
                                setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                blackCounter++;
                            } else {
                                setInfluence.add(influenceCounter, String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt)));
                                setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                blackCounter++;
                            }
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    ArrayList setBlackOriginal = new ArrayList(black.get(0));
                    ArrayList setBlackCopy = new ArrayList(setBlack);
                    setBlackCopy.removeAll(setBlackOriginal);
                    setBlackOriginal.addAll(setBlackCopy);
                    black.set(0, setBlackOriginal);
                    break;
                }
                case "Q":
                case "R":
                case "B": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    ArrayList setWhite = new ArrayList();
                    int whiteCounter = 0;
                    boolean pieceInfluence = false;
                    for (int x = 0, lenLOA = gamePiece.get(i).get(6).size(); x < lenLOA; x++, pieceInfluence = false) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        for (int y = instanceOfLocationInt; (String.valueOf(y).equals(String.valueOf(Chessboard.blank.get(y))) && !pieceInfluence); y += lineOfAttackInt) {
                            if (String.valueOf(y + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(y + lineOfAttackInt))) ||
                                String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("X") ||
                                String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("x")){
                                if (String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("X")) {
                                    setWhite.add(whiteCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    pieceInfluence = true;
                                    whiteCounter++;
                                } else if (String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("x")) {
                                    setInfluence.add(influenceCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setLegal.add(legalCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setWhite.add(whiteCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    pieceInfluence = true;
                                    influenceCounter++;
                                    legalCounter++;
                                    whiteCounter++;
                                } else {
                                    setInfluence.add(influenceCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setLegal.add(legalCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setWhite.add(whiteCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    influenceCounter++;
                                    legalCounter++;
                                    whiteCounter++;
                                }
                            }
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    gamePiece.get(i).set(7, setLegal);
                    ArrayList setWhiteOriginal = new ArrayList(white.get(0));
                    ArrayList setWhiteCopy = new ArrayList(setWhite);
                    setWhiteCopy.removeAll(setWhiteOriginal);
                    setWhiteOriginal.addAll(setWhiteCopy);
                    white.set(0, setWhiteOriginal);
                    break;
                }
                case "q":
                case "r":
                case "b": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    ArrayList setBlack = new ArrayList();
                    int blackCounter = 0;
                    boolean pieceInfluence = false;
                    for (int x = 0, lenLOA = gamePiece.get(i).get(6).size(); x < lenLOA; x++, pieceInfluence = false) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        for (int y = instanceOfLocationInt; (String.valueOf(y).equals(String.valueOf(Chessboard.blank.get(y))) && !pieceInfluence); y += lineOfAttackInt) {
                            if (String.valueOf(y + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(y + lineOfAttackInt))) ||
                                    String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("X") ||
                                    String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("x")){
                                if (String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("x")) {
                                    setBlack.add(blackCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    pieceInfluence = true;
                                    blackCounter++;
                                } else if (String.valueOf(occupiedXBoard.get(y + lineOfAttackInt)).equals("X")) {
                                    setInfluence.add(influenceCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setLegal.add(legalCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setBlack.add(blackCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    pieceInfluence = true;
                                    influenceCounter++;
                                    legalCounter++;
                                    blackCounter++;
                                } else {
                                    setInfluence.add(influenceCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setLegal.add(legalCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    setBlack.add(blackCounter, Chessboard.blank.get(y + lineOfAttackInt));
                                    influenceCounter++;
                                    legalCounter++;
                                    blackCounter++;
                                }
                            }
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    gamePiece.get(i).set(7, setLegal);
                    ArrayList setBlackOriginal = new ArrayList(black.get(0));
                    ArrayList setBlackCopy = new ArrayList(setBlack);
                    setBlackCopy.removeAll(setBlackOriginal);
                    setBlackOriginal.addAll(setBlackCopy);
                    black.set(0, setBlackOriginal);
                    break;
                }
                case "N": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    ArrayList setWhite = new ArrayList();
                    int whiteCounter = 0;
                    for (int x = 0, lenLOA = gamePiece.get(i).get(6).size(); x < lenLOA; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) ||
                                String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("X") ||
                                String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")){
                            if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("X")) {
                                setWhite.add(whiteCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                whiteCounter++;
                            } else if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                                setInfluence.add(influenceCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setLegal.add(legalCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setWhite.add(whiteCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                legalCounter++;
                                whiteCounter++;
                            } else {
                                setInfluence.add(influenceCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setLegal.add(legalCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setWhite.add(whiteCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                legalCounter++;
                                whiteCounter++;
                            }
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    gamePiece.get(i).set(7, setLegal);
                    ArrayList setWhiteOriginal = new ArrayList(white.get(0));
                    ArrayList setWhiteCopy = new ArrayList(setWhite);
                    setWhiteCopy.removeAll(setWhiteOriginal);
                    setWhiteOriginal.addAll(setWhiteCopy);
                    white.set(0, setWhiteOriginal);
                    break;
                }
                case "n": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    ArrayList setBlack = new ArrayList();
                    int blackCounter = 0;
                    for (int x = 0, lenLOA = gamePiece.get(i).get(6).size(); x < lenLOA; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) ||
                                String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x") ||
                                String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("X")){
                            if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                                setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                blackCounter++;
                            } else if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("X")) {
                                setInfluence.add(influenceCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setLegal.add(legalCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                legalCounter++;
                                blackCounter++;
                            } else {
                                setInfluence.add(influenceCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setLegal.add(legalCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                                influenceCounter++;
                                legalCounter++;
                                blackCounter++;
                            }
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    gamePiece.get(i).set(7, setLegal);
                    ArrayList setBlackOriginal = new ArrayList(black.get(0));
                    ArrayList setBlackCopy = new ArrayList(setBlack);
                    setBlackCopy.removeAll(setBlackOriginal);
                    setBlackOriginal.addAll(setBlackCopy);
                    black.set(0, setBlackOriginal);
                    break;
                }
                case "P": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    ArrayList setWhite = new ArrayList();
                    int whiteCounter = 0;
                    boolean oneStep = true;
                    boolean twoStep = true;
                    int pawnLocation = Integer.parseInt(gamePiece.get(i).get(5).get(0).toString());
                    if (pawnLocation > 80 && pawnLocation < 90) {
                        if (black.get(2).contains(pawnLocation - 10)) {
                            oneStep = false;
                            twoStep = false;
                        }
                        if (black.get(2).contains(pawnLocation - 20) || black.get(2).contains(pawnLocation - 10)) {
                            twoStep = false;
                        }
                    } else {
                        twoStep = false;
                        if (black.get(2).contains(pawnLocation - 10)) {
                            oneStep = false;
                        }
                    }
                    if (oneStep) {
                        //if (!black.get(2).contains(pawnLocation - 10)) {
                            setLegal.add(legalCounter, pawnLocation - 10);
                            legalCounter++;
                        //}
                    }
                    if (twoStep) {
                        setLegal.add(legalCounter, pawnLocation - 20);
                        legalCounter++;
                    }
                    for (int x = 0, lenLOA = gamePiece.get(i).get(6).size(); x < lenLOA; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) &&
                                (black.get(2).contains(instanceOfLocationInt + lineOfAttackInt))) {
                            setInfluence.add(influenceCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                            setLegal.add(legalCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                            setWhite.add(whiteCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                            influenceCounter++;
                            legalCounter++;
                            whiteCounter++;
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    gamePiece.get(i).set(7, setLegal);
                    ArrayList setWhiteOriginal = new ArrayList(white.get(0));
                    ArrayList setWhiteCopy = new ArrayList(setWhite);
                    setWhiteCopy.removeAll(setWhiteOriginal);
                    setWhiteOriginal.addAll(setWhiteCopy);
                    white.set(0, setWhiteOriginal);
                    break;
                }
                case "p": {
                    ArrayList setInfluence = new ArrayList();
                    int influenceCounter = 0;
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    ArrayList setBlack = new ArrayList();
                    int blackCounter = 0;
                    boolean oneStep = true;
                    boolean twoStep = true;
                    int pawnLocation = Integer.parseInt(gamePiece.get(i).get(5).get(0).toString());
                    if (pawnLocation > 30 && pawnLocation < 40) {
                        if (black.get(2).contains(pawnLocation + 10)) {
                            oneStep = false;
                            twoStep = false;
                        }
                        if (black.get(2).contains(pawnLocation + 20)) {
                            twoStep = false;
                        }
                    }
                    if (oneStep) {
                        if (!white.get(2).contains(pawnLocation + 10)) {
                            setLegal.add(legalCounter, pawnLocation + 10);
                            legalCounter++;
                        }
                    }
                    if (twoStep) {
                        setLegal.add(legalCounter, pawnLocation + 20);
                        legalCounter++;
                    }
                    for (int x = 0, lenLOA = gamePiece.get(i).get(6).size(); x < lenLOA; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) &&
                                (white.get(2).contains(instanceOfLocationInt + lineOfAttackInt))) {
                            setInfluence.add(influenceCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                            setLegal.add(legalCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                            setBlack.add(blackCounter, Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt));
                            influenceCounter++;
                            legalCounter++;
                            blackCounter++;
                        }
                    }
                    gamePiece.get(i).set(8, setInfluence);
                    gamePiece.get(i).set(7, setLegal);
                    ArrayList setBlackOriginal = new ArrayList(black.get(0));
                    ArrayList setBlackCopy = new ArrayList(setBlack);
                    setBlackCopy.removeAll(setBlackOriginal);
                    setBlackOriginal.addAll(setBlackCopy);
                    black.set(0, setBlackOriginal);
                    break;
                }
            }
        }

    }

    public static void createAllMovesTwoOfTwo() {
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            switch (gamePiece.get(i).get(2).get(0).toString()) {
                case "K":
                case "k": {
                    ArrayList setLegal = new ArrayList();
                    int legalCounter = 0;
                    for (int x = 0; x < 8; x++) {
                        String lineOfAttack = gamePiece.get(i).get(6).get(x).toString();
                        int lineOfAttackInt = Integer.parseInt(lineOfAttack);
                        String instanceOfLocation = gamePiece.get(i).get(5).get(0).toString();
                        int instanceOfLocationInt = Integer.parseInt(instanceOfLocation);
                        if (String.valueOf(instanceOfLocationInt + lineOfAttackInt).equals(String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt))) || String.valueOf(occupiedXBoard.get(instanceOfLocationInt +
                                lineOfAttackInt)).equals("X") || String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                            if (occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt).equals("X")) {
                            } else if (String.valueOf(occupiedXBoard.get(instanceOfLocationInt + lineOfAttackInt)).equals("x")) {
                            } else {
                                setLegal.add(legalCounter, String.valueOf(Chessboard.blank.get(instanceOfLocationInt + lineOfAttackInt)));
                                legalCounter++;
                            }
                        }
                    }
                    gamePiece.get(i).set(7, setLegal);
                    break;
                }
            }
        }
    }

    public static void createInfluenceBoards() {
        for (int i = 0, len = gamePiece.size(); i < len; i++) {
            for (int x = 0, pieceLEN = gamePiece.get(i).get(8).size(); x < pieceLEN; x++) {
                String letter = gamePiece.get(i).get(0).get(0).toString();
                if (letter.equals("White")) {
                    //System.out.println(gamePiece.get(i).get(8).get(x));
                    int square = Integer.parseInt(String.valueOf(gamePiece.get(i).get(8).get(x)));
                    whiteInfluence.set(square, "x");
                }
                if (letter.equals("Black")) {
                    //System.out.println(gamePiece.get(i).get(8).get(x));
                    //System.out.println(gamePiece.get(i));
                    int square = Integer.parseInt(String.valueOf(gamePiece.get(i).get(8).get(x)));
                    blackInfluence.set(square, "x");
                }
            }
        }
    }
}


