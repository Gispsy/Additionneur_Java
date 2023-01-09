package fr.additionneur.additioneur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdditionneurControll {

    public javafx.scene.control.TextField TextField;
    public Button Btn1;
    public Button Btn2;
    public Button Btn3;
    public Button Btn4;
    public Button Btn5;
    public Button Btn6;
    public Button Btn7;
    public Button Btn8;
    public Button Btn9;
    public Button Btn0;
    public Button BtnCalcul;
    public Button BtnClear;
    public Button BtnAdd;
    public Button BtnSous;
    public Button BtnDiv;
    public Button BtnMulti;

    private double chiffre;
    private String operateur = "";
    private String resultat = "";


    public void Btn1ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 1");
        chiffre = 1 + chiffre;
        operateur = "+";

    }
    public void Btn2ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 2");
        chiffre = 2 + chiffre;
        operateur = "+";

    }

    public void Btn3ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 3");
        chiffre = 3 + chiffre;
        operateur = "+";

    }

    public void Btn4ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 4");
        chiffre = 4 + chiffre;
        operateur = "+";

    }

    public void Btn5ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 5");
        chiffre = 5 + chiffre;
        operateur = "+";

    }

    public void Btn6ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 6");
        chiffre = 6 + chiffre;
        operateur = "+";

    }

    public void Btn7ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 7");
        chiffre = 7 + chiffre;
        operateur = "+";

    }

    public void Btn8ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 8");
        chiffre = 8 + chiffre;
        operateur = "+";

    }

    public void Btn9ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 9");
        chiffre = 9 + chiffre;
        operateur = "+";

    }

    public void Btn0ActionClick(ActionEvent actionEvent) {
        TextField.appendText("+ 0");
        chiffre = 0 + chiffre ;
        operateur = "+";

    }

    public void BtnClearActionClick(ActionEvent actionEvent) {
        TextField.clear();

    }
    public void BtnCalculActionClick(ActionEvent actionEvent) {
        Calcul();
        TextField.appendText("= " + resultat);
    }

    private void Calcul() {
        resultat = String.valueOf(chiffre);

    }
}