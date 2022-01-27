package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Controller implements Initializable {

    @FXML
    public Text a1;
    @FXML
    public Text a2;
    @FXML
    public Text a3;
    @FXML
    public Text a4;
    @FXML
    public Text a5;
    @FXML
    public Text a6;
    @FXML
    public Text a7;
    @FXML
    public Text a8;
    @FXML
    public Text b1;
    @FXML
    public Text b2;
    @FXML
    public Text b3;
    @FXML
    public Text b4;
    @FXML
    public Text b5;
    @FXML
    public Text b6;
    @FXML
    public Text b7;
    @FXML
    public Text b8;
    @FXML
    public Text c1;
    @FXML
    public Text c2;
    @FXML
    public Text c3;
    @FXML
    public Text c4;
    @FXML
    public Text c5;
    @FXML
    public Text c6;
    @FXML
    public Text c7;
    @FXML
    public Text c8;
    @FXML
    public Text d1;
    @FXML
    public Text d2;
    @FXML
    public Text d3;
    @FXML
    public Text d4;
    @FXML
    public Text d5;
    @FXML
    public Text d6;
    @FXML
    public Text d7;
    @FXML
    public Text d8;
    @FXML
    public Text e1;
    @FXML
    public Text e2;
    @FXML
    public Text e3;
    @FXML
    public Text e4;
    @FXML
    public Text e5;
    @FXML
    public Text e6;
    @FXML
    public Text e7;
    @FXML
    public Text e8;
    @FXML
    public Text f1;
    @FXML
    public Text f2;
    @FXML
    public Text f3;
    @FXML
    public Text f4;
    @FXML
    public Text f5;
    @FXML
    public Text f6;
    @FXML
    public Text f7;
    @FXML
    public Text f8;
    @FXML
    public Text g1;
    @FXML
    public Text g2;
    @FXML
    public Text g3;
    @FXML
    public Text g4;
    @FXML
    public Text g5;
    @FXML
    public Text g6;
    @FXML
    public Text g7;
    @FXML
    public Text g8;
    @FXML
    public Text h1;
    @FXML
    public Text h2;
    @FXML
    public Text h3;
    @FXML
    public Text h4;
    @FXML
    public Text h5;
    @FXML
    public Text h6;
    @FXML
    public Text h7;
    @FXML
    public Text h8;
    @FXML
    public Button newGameWhite;
    @FXML
    public Button newGameBlack;
    @FXML
    public Button resign;
    @FXML
    public Button submitMove;
    @FXML
    public TextField moveBox;
    @FXML
    public Label gameWarning;
    @FXML
    public Pane coverButtons;
    @FXML
    public Pane coverInstructions;
    @FXML
    public Button howToPlay;
    @FXML
    public Pane coverSubmitMove;

    public void clearBoard() {
        a1.setText("");
        a2.setText("");
        a3.setText("");
        a4.setText("");
        a5.setText("");
        a6.setText("");
        a7.setText("");
        a8.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        c1.setText("");
        c2.setText("");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
        d1.setText("");
        d2.setText("");
        d3.setText("");
        d4.setText("");
        d5.setText("");
        d6.setText("");
        d7.setText("");
        d8.setText("");
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        e7.setText("");
        e8.setText("");
        f1.setText("");
        f2.setText("");
        f3.setText("");
        f4.setText("");
        f5.setText("");
        f6.setText("");
        f7.setText("");
        f8.setText("");
        g1.setText("");
        g2.setText("");
        g3.setText("");
        g4.setText("");
        g5.setText("");
        g6.setText("");
        g7.setText("");
        g8.setText("");
        h1.setText("");
        h2.setText("");
        h3.setText("");
        h4.setText("");
        h5.setText("");
        h6.setText("");
        h7.setText("");
        h8.setText("");
    }

    public void startBoard() {
        a1.setText("♖");
        a2.setText("♙");
        a3.setText("");
        a4.setText("");
        a5.setText("");
        a6.setText("");
        a7.setText("♟");
        a8.setText("♜");
        b1.setText("♘");
        b2.setText("♙");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("♟");
        b8.setText("♞");
        c1.setText("♗");
        c2.setText("♙");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        c6.setText("");
        c7.setText("♟");
        c8.setText("♝");
        d1.setText("♕");
        d2.setText("♙");
        d3.setText("");
        d4.setText("");
        d5.setText("");
        d6.setText("");
        d7.setText("♟");
        d8.setText("♛");
        e1.setText("♔");
        e2.setText("♙");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        e7.setText("♟");
        e8.setText("♚");
        f1.setText("♗");
        f2.setText("♙");
        f3.setText("");
        f4.setText("");
        f5.setText("");
        f6.setText("");
        f7.setText("♟");
        f8.setText("♝");
        g1.setText("♘");
        g2.setText("♙");
        g3.setText("");
        g4.setText("");
        g5.setText("");
        g6.setText("");
        g7.setText("♟");
        g8.setText("♞");
        h1.setText("♖");
        h2.setText("♙");
        h3.setText("");
        h4.setText("");
        h5.setText("");
        h6.setText("");
        h7.setText("♟");
        h8.setText("♜");
    }

    public static ArrayList boardNumbers = new ArrayList(Arrays.asList(
            21, 22, 23, 24, 25, 26, 27, 28,
            31, 32, 33, 34, 35, 36, 37, 38,
            41, 42, 43, 44, 45, 46, 47, 48,
            51, 52, 53, 54, 55, 56, 57, 58,
            61, 62, 63, 64, 65, 66, 67, 68,
            71, 72, 73, 74, 75, 76, 77, 78,
            81, 82, 83, 84, 85, 86, 87, 88,
            91, 92, 93, 94, 95, 96, 97, 98));


    public void paintBoard(ArrayList<ArrayList> gamePiece) {
        ArrayList<ArrayList<ArrayList>> newGamePiece = new ArrayList<>();
        newGamePiece = (ArrayList<ArrayList<ArrayList>>) gamePiece.clone();
        for (int i = 21; i < 99; i++) {
            boolean filled = false;
            for (int x = 0; x < newGamePiece.size(); x++) {
                if (newGamePiece.get(x).get(5).get(0).equals(i)) {
                    if (i < 29) {
                        boardNumbers.set(i - 21, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 30 && i < 39) {
                        boardNumbers.set(i - 23, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 40 && i < 49) {
                        boardNumbers.set(i - 25, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 50 && i < 59) {
                        boardNumbers.set(i - 27, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 60 && i < 69) {
                        boardNumbers.set(i - 29, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 70 && i < 79) {
                        boardNumbers.set(i - 31, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 80 && i < 89) {
                        boardNumbers.set(i - 33, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    } else if (i > 90) {
                        boardNumbers.set(i - 35, newGamePiece.get(x).get(3).get(0));
                        filled = true;
                    }
                }
            }
            if (!filled) {
                if (i < 29) {
                    boardNumbers.set(i - 21, "");
                } else if (i > 30 && i < 39) {
                    boardNumbers.set(i - 23, "");
                } else if (i > 40 && i < 49) {
                    boardNumbers.set(i - 25, "");
                } else if (i > 50 && i < 59) {
                    boardNumbers.set(i - 27, "");
                } else if (i > 60 && i < 69) {
                    boardNumbers.set(i - 29, "");
                } else if (i > 70 && i < 79) {
                    boardNumbers.set(i - 31, "");
                } else if (i > 80 && i < 89) {
                    boardNumbers.set(i - 33, "");
                } else if (i > 90) {
                    boardNumbers.set(i - 35, "");
                }
            }
        }
        System.out.println(boardNumbers);
        a1.setText(boardNumbers.get(56).toString());
        a2.setText(boardNumbers.get(48).toString());
        a3.setText(boardNumbers.get(40).toString());
        a4.setText(boardNumbers.get(32).toString());
        a5.setText(boardNumbers.get(24).toString());
        a6.setText(boardNumbers.get(16).toString());
        a7.setText(boardNumbers.get(8).toString());
        a8.setText(boardNumbers.get(0).toString());
        b1.setText(boardNumbers.get(57).toString());
        b2.setText(boardNumbers.get(49).toString());
        b3.setText(boardNumbers.get(41).toString());
        b4.setText(boardNumbers.get(33).toString());
        b5.setText(boardNumbers.get(25).toString());
        b6.setText(boardNumbers.get(17).toString());
        b7.setText(boardNumbers.get(9).toString());
        b8.setText(boardNumbers.get(1).toString());
        c1.setText(boardNumbers.get(58).toString());
        c2.setText(boardNumbers.get(50).toString());
        c3.setText(boardNumbers.get(42).toString());
        c4.setText(boardNumbers.get(34).toString());
        c5.setText(boardNumbers.get(26).toString());
        c6.setText(boardNumbers.get(18).toString());
        c7.setText(boardNumbers.get(10).toString());
        c8.setText(boardNumbers.get(2).toString());
        d1.setText(boardNumbers.get(59).toString());
        d2.setText(boardNumbers.get(51).toString());
        d3.setText(boardNumbers.get(43).toString());
        d4.setText(boardNumbers.get(35).toString());
        d5.setText(boardNumbers.get(27).toString());
        d6.setText(boardNumbers.get(19).toString());
        d7.setText(boardNumbers.get(11).toString());
        d8.setText(boardNumbers.get(3).toString());
        e1.setText(boardNumbers.get(60).toString());
        e2.setText(boardNumbers.get(52).toString());
        e3.setText(boardNumbers.get(44).toString());
        e4.setText(boardNumbers.get(36).toString());
        e5.setText(boardNumbers.get(28).toString());
        e6.setText(boardNumbers.get(20).toString());
        e7.setText(boardNumbers.get(12).toString());
        e8.setText(boardNumbers.get(4).toString());
        f1.setText(boardNumbers.get(61).toString());
        f2.setText(boardNumbers.get(53).toString());
        f3.setText(boardNumbers.get(45).toString());
        f4.setText(boardNumbers.get(37).toString());
        f5.setText(boardNumbers.get(29).toString());
        f6.setText(boardNumbers.get(21).toString());
        f7.setText(boardNumbers.get(13).toString());
        f8.setText(boardNumbers.get(5).toString());
        g1.setText(boardNumbers.get(62).toString());
        g2.setText(boardNumbers.get(54).toString());
        g3.setText(boardNumbers.get(46).toString());
        g4.setText(boardNumbers.get(38).toString());
        g5.setText(boardNumbers.get(30).toString());
        g6.setText(boardNumbers.get(22).toString());
        g7.setText(boardNumbers.get(14).toString());
        g8.setText(boardNumbers.get(6).toString());
        h1.setText(boardNumbers.get(63).toString());
        h2.setText(boardNumbers.get(55).toString());
        h3.setText(boardNumbers.get(47).toString());
        h4.setText(boardNumbers.get(39).toString());
        h5.setText(boardNumbers.get(31).toString());
        h6.setText(boardNumbers.get(23).toString());
        h7.setText(boardNumbers.get(15).toString());
        h8.setText(boardNumbers.get(7).toString());
    }

    public void Controller() {
        clearBoard();
        startBoard();
    }

    public static ArrayList gameScore = new ArrayList();
    public static ArrayList move = new ArrayList();
    public static ArrayList check = new ArrayList();
    public static ArrayList castleKingSide = new ArrayList();
    public static ArrayList castleQueenSide = new ArrayList();
    public static ArrayList castleArray = new ArrayList();
    public static ArrayList enPassantTrueFalse = new ArrayList();
    public static ArrayList enPassantArray = new ArrayList();
    public static ArrayList<ArrayList> gamePiece = new ArrayList<>();
    public static ArrayList playerColor = new ArrayList();
    public static ArrayList white = new ArrayList();
    public static ArrayList black = new ArrayList();
    //ArrayList newGameArray = new ArrayList();
    ArrayList<ArrayList<ArrayList>> gameArray = new ArrayList<ArrayList<ArrayList>>(Arrays.asList());

    public void startGameAsWhite() {
        Controller();
        coverButtons.toFront();
        gameWarning.setText("Good luck.");
        Compression compression = new Compression();
        coverSubmitMove.toBack();
        move.add(Arrays.asList("White"));
        playerColor.add(Arrays.asList("White"));
        gameScore.add(0, 0);
        System.out.println(gameScore.get(0) + "Controller Message: startGameAsWhite() engaged. gameScore.get(0); displayed: " + gameScore.get(0));
    }

    public void startGameAsBlack() {
        coverButtons.toFront();
        gameWarning.setText("Good luck.");
        Compression compression = new Compression();
        gameArray.get(1).get(0).add(0, "Black");
    }

    public void endGame() {
        coverButtons.toBack();
        coverSubmitMove.toFront();
        gameWarning.setText("Good game.");
        gameScore.set(0, 0);
    }

    public void hideInstructions() {
        coverInstructions.toFront();
    }

    public void showInstructions() {
        coverInstructions.toBack();
    }

    int firstMove = 0;

    public void createCurrentMove() {
        System.out.println("Controller Message: createCurrentMove() engaged.");
        String moveBoxString = moveBox.getText();
        moveBox.clear();
        gameWarning.setText("");
        {
            String color = move.get(0).toString();
            ArrayList tempArray = new ArrayList();
            ArrayList<String> moveString = new ArrayList<String>();

            decipherMove(moveBoxString, tempArray, moveString);
            move.clear();
            move.add(color);
            move.add(tempArray);
            System.out.println("Controller Message: decipherMove() engaged. move displayed: "+ move);
        }
            //gameScore.set(0, move);
        if (firstMove < 1) {
            gameArray.add(gameScore);
            System.out.println(move + " move before gameArray modified");
            gameArray.add(move);
            System.out.println("Controller Message: Controller Audit of: move - move contains: " + move + " gameArray contains " + gameArray.get(1));
            gameArray.add(check);
            gameArray.add(castleKingSide);
            gameArray.add(castleQueenSide);
            gameArray.add(castleArray);
            gameArray.add(enPassantTrueFalse);
            gameArray.add(enPassantArray);
            gameArray.add(gamePiece);
            gameArray.add(playerColor);
            gameArray.add(white);
            gameArray.add(black);
            gameArray = Compression.newGame(gameArray);
            gamePiece = ((ArrayList<ArrayList>) gameArray.get(8).clone());
            paintBoard(gamePiece);
            gameArray = Compression.continueGame(gameArray, firstMove);
            gamePiece = ((ArrayList<ArrayList>) gameArray.get(8).clone());
            paintBoard(gamePiece);
            Controller.gamePiece.clear();
            firstMove++;
            gameArray = Compression.continueGame(gameArray, firstMove);
            gamePiece = ((ArrayList<ArrayList>) gameArray.get(8).clone());
            paintBoard(gamePiece);
            Controller.gamePiece.clear();
            firstMove++;
        } else {
            gameArray = Compression.continueGame(gameArray, firstMove);
            gamePiece = ((ArrayList<ArrayList>) gameArray.get(8).clone());
            paintBoard(gamePiece);
            Controller.gamePiece.clear();
            firstMove++;
            gameArray = Compression.continueGame(gameArray, firstMove);
            gamePiece = ((ArrayList<ArrayList>) gameArray.get(8).clone());
            paintBoard(gamePiece);
            Controller.gamePiece.clear();
            firstMove++;
        }
        firstMove++;
        System.out.println("Controller announces end of loop. Thank you all for participating.");
    }




    public ArrayList decipherMove(String moveBoxString, ArrayList tempArray, ArrayList moveString) {


        for (int i = 0; i < moveBoxString.length(); i += 2) {
            moveString.add(moveBoxString.substring(i, Math.min(i + 2, moveBoxString.length())));
        }

        for (int x = 0; x < 2; x++) {
            for (int i = 0; i < 100; i++) {
                if (moveString.get(x).equals(Chessboard.human.get(i))) {
                    tempArray.add(x, Chessboard.blank.get(i));
                }
            }
        }
        return move;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    /*
    public void playRandomGame(game) {
        gameArray.add(gameScore);
        gameArray.add(move);
        gameArray.add(check);
        gameArray.add(castleKingSide);
        gameArray.add(castleQueenSide);
        gameArray.add(castleArray);
        gameArray.add(enPassantTrueFalse);
        gameArray.add(enPassantArray);
        gameArray.add(gamePiece);
        gameArray.add(playerColor);
        gameArray = Compression.newGame(gameArray);
        paintBoard(gamePiece);
        gameArray = Compression.continueGame(gameArray);
        paintBoard(gamePiece);
        gameScore.set(0, 1);
        Controller.gamePiece.clear();
        gamePiece = ((ArrayList<ArrayList>) gameArray.get(8).clone());
        gameArray = Compression.continueGame(gameArray);
        paintBoard(gamePiece);
        Controller();
        coverButtons.toFront();
        gameWarning.setText("Good luck.");
        Compression compression = new Compression();
        ArrayList<ArrayList<ArrayList>> gameArray = compression.newGame();
        for (int i = 0; i < 35; i++) {
            for (int x = 0; x < 1; x++) {
                gameArray = compression.continueGame(gameArray);
                createCurrentMove(gameArray);
            }
        }
    }

     */
}
