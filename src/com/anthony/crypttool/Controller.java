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
    ObservableList<String> cryptChoiceList = FXCollections.observableArrayList("AES-128","AES-192","AES-256",
            "DES-56","DESede-112","DESede-168");

    private Crypt crypt = new Crypt();

    @FXML
    private void initialize(){
        this.hashChoice.setValue("SHA-256");
        this.hashChoice.setItems(this.hashChoiceList);
        this.cryptChoice.setValue("AES-256");
        this.cryptChoice.setItems(this.cryptChoiceList);
    }

    public void pressHashBtn(ActionEvent event){
        String choice = String.valueOf(this.hashChoice.getValue());
        String msg = msgField.getText();
        String hash =this.crypt.calculateHash(msg,choice);
        this.hashField.setText(hash);
    }

    public void pressGenerateKey(ActionEvent event){
        String choice = (String) this.cryptChoice.getValue();
        String[] choiceList = choice.split("-");
        String algo = choiceList[0];
        String keySize = choiceList[1];
        String key = this.crypt.generateSymetricKey(algo,keySize);
        this.keyArea.setText(key);
    }

    public void pressEncrypt(ActionEvent event){
        System.out.println("Press Encrypt");
    }

    public void pressDecrypt(ActionEvent event){
        System.out.println("Press Decrypt");
    }
}
