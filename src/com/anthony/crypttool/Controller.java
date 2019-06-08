package com.anthony.crypttool;

 import javafx.collections.FXCollections;
 import javafx.collections.ObservableList;
 import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
 import javafx.scene.control.ChoiceBox;
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

    @FXML // fx:id="hashChoice";
    private ChoiceBox hashChoice;
    ObservableList<String> hashChoiceList = FXCollections.observableArrayList("MD5","SHA-1","SHA-256","SHA-384",
            "SHA-512");

    @FXML // fx:id="cryptChoice";
    private ChoiceBox cryptChoice;

    @FXML
    private void initialize(){
        this.hashChoice.setValue("SHA-256");
        this.hashChoice.setItems(this.hashChoiceList);
    }

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
