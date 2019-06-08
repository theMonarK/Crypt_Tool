package com.anthony.crypttool;

 import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
 import javafx.scene.control.TextArea;
 import javafx.scene.control.TextField;


public class Controller {

    @FXML // fx:id="msgField";
    private TextField msgField;

    @FXML // fx:id="hashField";
    private TextField hashField;

    @FXML // fx:id="keyArea";
    private TextArea keyArea;

    @FXML // fx:id="cryptMsgArea";
    private TextArea cryptMsgArea;

    public void pressHashBtn(ActionEvent event){
        System.out.println("Press Hash button");
    }

    public void pressGenerateKey(ActionEvent event){
        System.out.println("Press generate key");
    }

    public void pressEncrypt(ActionEvent event){
        System.out.println("Press Encrypt");
    }

    public void pressDecrypt(ActionEvent event){
        System.out.println("Press Decrypt");
    }
}