package com.example.contenitorebrani;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.Objects;


public class Controller {

    //Utilizzo questa variable per identificare cosa dovrò fare con il tasto conferma
    static int flag = 4;


    //Liste
    public ListView<String> nomebranolista;
    public ListView<String> autorebranolista;
    public ListView<String> duratabranolista;


    //Bottoni
    @FXML
    Button addbrano, removebrano, editbrano, confirmbutton, backbutton;

    //Campi inserimento testo
    @FXML
    TextField nomebranofield, autorebranofield, duratabranofield, numelencofield;

    //Scritte
    @FXML
    Label nomebranolabel, autorebranolabel, duratabranolabel, numelencolabel;

    public static Controller INSTANCE;



    public Controller(){
        INSTANCE=this;
    }


    // **********************************************************************************************
    //                                 Click del bottone Aggiungi Brano
    // **********************************************************************************************
    public void aggiungibrano(ActionEvent actionEvent) {

        //Verifico se il contenitore è pieno, se è pieno non faccio nulla
        if(num >= 20){
            nomebranolabel.setText("Il contenitore è PIENO!");
            nomebranolabel.setOpacity(1);
            nomebranolabel.setDisable(false);

            //Rimuovo il bottone aggiungi brano
            addbrano.setOpacity(0);
            addbrano.setDisable(true);

        }else{

            //Imposto la flag a UNO che simboleggia aggiungi brano
            flag = 1;

            //Disabilito e nascondo i bottoni iniziali

                //Bottone aggiungi brano
                addbrano.setOpacity(0);
                addbrano.setDisable(true);

                //Bottone rimuovi brano
                removebrano.setOpacity(0);
                removebrano.setDisable(true);

                //Bottone modifica brano
                editbrano.setOpacity(0);
                editbrano.setDisable(true);

            //Abilito e faccio apparire il bottone di conferma e gli cambio il testo
            confirmbutton.setDisable(false);
            confirmbutton.setOpacity(1);
            confirmbutton.setText("Aggiungi");

            //Abilito e faccio apparire il bottone per tornare indietro
            backbutton.setDisable(false);
            backbutton.setOpacity(1);


            //Abilito e faccio apparire i campi d'inserimento testo e le scritte

                //Inserimento nome brano + label
                nomebranolabel.setText("Inserisci Nome Brano");
                nomebranofield.setOpacity(1);
                nomebranofield.setDisable(false);
                nomebranolabel.setOpacity(1);
                nomebranolabel.setDisable(false);

                //Inserimento autore brano + label
                autorebranofield.setOpacity(1);
                autorebranofield.setDisable(false);
                autorebranolabel.setOpacity(1);
                autorebranolabel.setDisable(false);

                //Inserimento durata brano + label
                duratabranofield.setOpacity(1);
                duratabranofield.setDisable(false);
                duratabranolabel.setOpacity(1);
                duratabranolabel.setDisable(false);

        }

    }

    // **********************************************************************************************
    //                                 Click del bottone Rimuovi Brano
    // **********************************************************************************************

    public void rimuovibrano(ActionEvent actionEvent) {

        if(num <= 0){
            nomebranolabel.setText("Il contenitore è VUOTO!");
            nomebranolabel.setOpacity(1);
            nomebranolabel.setDisable(false);

            removebrano.setDisable(true);
            removebrano.setOpacity(0);

        }else {

            //Imposto la flag a DUE che simboleggia rimuovi brano
            flag = 2;

            //Disabilito e nascondo i bottoni iniziali

                //Bottone aggiungi brano
                addbrano.setOpacity(0);
                addbrano.setDisable(true);

                //Bottone rimuovi brano
                removebrano.setOpacity(0);
                removebrano.setDisable(true);

                //Bottone modifica brano
                editbrano.setOpacity(0);
                editbrano.setDisable(true);

            //Abilito e faccio apparire il bottone di conferma e gli cambio il testo
            confirmbutton.setDisable(false);
            confirmbutton.setOpacity(1);
            confirmbutton.setText("Rimuovi");

            //Abilito e faccio apparire il bottone per tornare indietro
            backbutton.setDisable(false);
            backbutton.setOpacity(1);


            //Abilito e faccio apparire il campo d'inserimento testo e le scritte

            //Nascondo la label di nome brano
            nomebranolabel.setText("Inserisci Nome Brano");
            nomebranolabel.setOpacity(0);
            nomebranolabel.setDisable(true);

            //Inserimento numero elenco + label
            numelencofield.setOpacity(1);
            numelencofield.setDisable(false);
            numelencolabel.setOpacity(1);
            numelencolabel.setDisable(false);

        }
    }

    // **********************************************************************************************
    //                                 Click del bottone Modifica Brano
    // **********************************************************************************************

    public void modificabrano(ActionEvent actionEvent) {

        if(num <= 0){
            nomebranolabel.setText("Il contenitore è VUOTO!");
            nomebranolabel.setOpacity(1);
            nomebranolabel.setDisable(false);

            editbrano.setOpacity(0);
            editbrano.setDisable(true);

        }else {


            //Imposto la flag a TRE che simboleggia modifica brano
            flag = 3;

            //Disabilito e nascondo i bottoni iniziali

            //Bottone aggiungi brano
            addbrano.setOpacity(0);
            addbrano.setDisable(true);

            //Bottone rimuovi brano
            removebrano.setOpacity(0);
            removebrano.setDisable(true);

            //Bottone modifica brano
            editbrano.setOpacity(0);
            editbrano.setDisable(true);

            //Abilito e faccio apparire il bottone di conferma e gli cambio il testo
            confirmbutton.setDisable(false);
            confirmbutton.setOpacity(1);
            confirmbutton.setText("Modifica");

            //Abilito e faccio apparire il bottone per tornare indietro
            backbutton.setDisable(false);
            backbutton.setOpacity(1);

            //Abilito e faccio apparire il campo d'inserimento testo e le scritte

            //Inserimento nome brano + label
            nomebranofield.setOpacity(1);
            nomebranofield.setDisable(false);
            nomebranolabel.setText("Inserisci Nome Brano");
            nomebranolabel.setOpacity(1);
            nomebranolabel.setDisable(false);

            //Inserimento autore brano + label
            autorebranofield.setOpacity(1);
            autorebranofield.setDisable(false);
            autorebranolabel.setOpacity(1);
            autorebranolabel.setDisable(false);

            //Inserimento durata brano + label
            duratabranofield.setOpacity(1);
            duratabranofield.setDisable(false);
            duratabranolabel.setOpacity(1);
            duratabranolabel.setDisable(false);

            //Inserimento numero elenco + label
            numelencofield.setOpacity(1);
            numelencofield.setDisable(false);
            numelencolabel.setOpacity(1);
            numelencolabel.setDisable(false);

        }
    }

    // **********************************************************************************************
    //                                 Click del bottone di Conferma
    // **********************************************************************************************
    public void Clicked(ActionEvent actionEvent) {

        switch (flag) {
            case 1 -> {
                Dvd cd1 = new Dvd(nomebranofield.getText(), autorebranofield.getText(), duratabranofield.getText());
                aggiungi(cd1);

                //Resetto il contenuto delle fields
                nomebranofield.setText("");
                autorebranofield.setText("");
                duratabranofield.setText("");

                //Abilito e faccio riapparire i bottoni iniziali

                //Bottone aggiungi brano
                addbrano.setOpacity(1);
                addbrano.setDisable(false);

                //Bottone rimuovi brano
                removebrano.setOpacity(1);
                removebrano.setDisable(false);

                //Bottone modifica brano
                editbrano.setOpacity(1);
                editbrano.setDisable(false);

                //Disabilito e nascondo il bottone di conferma
                confirmbutton.setDisable(true);
                confirmbutton.setOpacity(0);

                //Disabilito e nascondo il bottone per tornare indietro
                backbutton.setDisable(true);
                backbutton.setOpacity(0);

                //Disabilito e nascondo i campi d'inserimento testo e le scritte

                //Inserimento nome brano + label
                nomebranofield.setOpacity(0);
                nomebranofield.setDisable(true);
                nomebranolabel.setOpacity(0);
                nomebranolabel.setDisable(true);

                //Inserimento autore brano + label
                autorebranofield.setOpacity(0);
                autorebranofield.setDisable(true);
                autorebranolabel.setOpacity(0);
                autorebranolabel.setDisable(true);

                //Inserimento durata brano + label
                duratabranofield.setOpacity(0);
                duratabranofield.setDisable(true);
                duratabranolabel.setOpacity(0);
                duratabranolabel.setDisable(true);

                //Inserimento numero elenco + label
                numelencofield.setOpacity(0);
                numelencofield.setDisable(true);
                numelencolabel.setOpacity(0);
                numelencolabel.setDisable(true);

                //Resetto la flag
                flag=4;
            }
            case 2 -> {
                String temp2 = nomebranolabel.getText();

                int flagtry = 0;

                //Try serve per provare se l'azione compiuta nel primo blocco è vera. Se riporta errore esegue il blocco catch
                try {
                    int a = Integer.parseInt(numelencofield.getText());
                } catch (Exception e) {

                    //Dico l'errore
                    nomebranolabel.setText("Inserisci un num INTERO!");
                    nomebranolabel.setDisable(false);
                    nomebranolabel.setOpacity(1);

                    //Imposto la flagtry a UNO per verificare se il numero inserito è un intero
                    flagtry=1;
                }

                if(flagtry==0) {

                    if(Integer.parseInt(numelencofield.getText())>num){
                        nomebranolabel.setText("Numero troppo grande");
                        nomebranolabel.setOpacity(1);
                        nomebranolabel.setDisable(false);
                        numelencofield.setText("");

                    } else if (Integer.parseInt(numelencofield.getText())<=0) {
                        nomebranolabel.setText("Numero troppo piccolo");
                        nomebranolabel.setOpacity(1);
                        nomebranolabel.setDisable(false);
                        numelencofield.setText("");
                    } else{


                        String delnums=numelencofield.getText();

                        int delnumi =Integer.valueOf(delnums);

                        DelBrano(delnumi);

                        //Resetto la scritto dell'errore e la nascondo
                        nomebranolabel.setText(temp2);
                        nomebranolabel.setOpacity(0);
                        nomebranolabel.setDisable(true);

                        //Resetto il contenuto della field
                        numelencofield.setText("");

                        //Abilito e faccio riapparire i bottoni iniziali

                        //Bottone aggiungi brano
                        addbrano.setOpacity(1);
                        addbrano.setDisable(false);

                        //Bottone rimuovi brano
                        removebrano.setOpacity(1);
                        removebrano.setDisable(false);

                        //Bottone modifica brano
                        editbrano.setOpacity(1);
                        editbrano.setDisable(false);

                        //Disabilito e nascondo il bottone di conferma
                        confirmbutton.setDisable(true);
                        confirmbutton.setOpacity(0);

                        //Disabilito e nascondo il bottone per tornare indietro
                        backbutton.setDisable(true);
                        backbutton.setOpacity(0);

                        //Disabilito e nascondo i campi d'inserimento testo e le scritte

                        //Inserimento nome brano + label
                        nomebranofield.setOpacity(0);
                        nomebranofield.setDisable(true);
                        nomebranolabel.setOpacity(0);
                        nomebranolabel.setDisable(true);

                        //Inserimento autore brano + label
                        autorebranofield.setOpacity(0);
                        autorebranofield.setDisable(true);
                        autorebranolabel.setOpacity(0);
                        autorebranolabel.setDisable(true);

                        //Inserimento durata brano + label
                        duratabranofield.setOpacity(0);
                        duratabranofield.setDisable(true);
                        duratabranolabel.setOpacity(0);
                        duratabranolabel.setDisable(true);

                        //Inserimento numero elenco + label
                        numelencofield.setOpacity(0);
                        numelencofield.setDisable(true);
                        numelencolabel.setOpacity(0);
                        numelencolabel.setDisable(true);

                        nomebranolabel.setText(temp2);

                        //Resetto la flag
                        flag=4;
                    }

                }else{
                    numelencofield.setText("");
                }
            }
            case 3 -> {

                String temp2 = nomebranolabel.getText();

                Dvd cd2 = new Dvd(nomebranofield.getText(), autorebranofield.getText(), duratabranofield.getText());

                int flagtry = 0;

                //Try server per provare se l'azione compiuta nel primo blocco è vera. Se riporta errore esegue il blocco catch
                try {
                    int a = Integer.parseInt(numelencofield.getText());
                } catch (Exception e) {
                    //Dico l'errore e disabilito la field e il bottone
                    nomebranolabel.setText("Inserisci un num INTERO!");

                    //Imposto la flagtry a UNO per verificare se il numero inserito è un intero
                    flagtry=1;
                }
                if(flagtry==0) {

                    if(Integer.parseInt(numelencofield.getText())>num){
                        nomebranolabel.setText("Numero troppo grande");
                        nomebranolabel.setOpacity(1);
                        nomebranolabel.setDisable(false);
                        numelencofield.setText("");

                    } else if (Integer.parseInt(numelencofield.getText())<=0) {
                        nomebranolabel.setText("Numero troppo piccolo");
                        nomebranolabel.setOpacity(1);
                        nomebranolabel.setDisable(false);
                        numelencofield.setText("");
                    } else {

                        modifica(cd2, Integer.parseInt(numelencofield.getText()));

                        //Resetto il contenuto delle fields
                        nomebranofield.setText("");
                        autorebranofield.setText("");
                        duratabranofield.setText("");
                        numelencofield.setText("");

                        //Abilito e faccio riapparire i bottoni iniziali

                        //Bottone aggiungi brano
                        addbrano.setOpacity(1);
                        addbrano.setDisable(false);

                        //Bottone rimuovi brano
                        removebrano.setOpacity(1);
                        removebrano.setDisable(false);

                        //Bottone modifica brano
                        editbrano.setOpacity(1);
                        editbrano.setDisable(false);

                        //Disabilito e nascondo il bottone di conferma
                        confirmbutton.setDisable(true);
                        confirmbutton.setOpacity(0);

                        //Disabilito e nascondo il bottone per tornare indietro
                        backbutton.setDisable(true);
                        backbutton.setOpacity(0);

                        //Disabilito e nascondo i campi d'inserimento testo e le scritte

                        //Inserimento nome brano + label
                        nomebranofield.setOpacity(0);
                        nomebranofield.setDisable(true);
                        nomebranolabel.setOpacity(0);
                        nomebranolabel.setDisable(true);

                        //Inserimento autore brano + label
                        autorebranofield.setOpacity(0);
                        autorebranofield.setDisable(true);
                        autorebranolabel.setOpacity(0);
                        autorebranolabel.setDisable(true);

                        //Inserimento durata brano + label
                        duratabranofield.setOpacity(0);
                        duratabranofield.setDisable(true);
                        duratabranolabel.setOpacity(0);
                        duratabranolabel.setDisable(true);

                        //Inserimento numero elenco + label
                        numelencofield.setOpacity(0);
                        numelencofield.setDisable(true);
                        numelencolabel.setOpacity(0);
                        numelencolabel.setDisable(true);

                        nomebranolabel.setText(temp2);

                        //Resetto la flag
                        flag = 4;
                    }
                }else{
                    numelencofield.setText("");
                }
            }
            default -> {

            }
        }



        // **********************************************************************************************
        //                            Click del bottone di Torna Indietro
        // **********************************************************************************************


    }

    public void TornaIndietro(ActionEvent actionEvent) {

        //Resetto il contenuto di tutti i fields
        nomebranofield.setText("");
        autorebranofield.setText("");
        duratabranofield.setText("");
        numelencofield.setText("");

        //Nascondo e disabilito i bottoni: Torna Indietro e Conferma
        backbutton.setDisable(true);
        backbutton.setOpacity(0);
        confirmbutton.setDisable(true);
        confirmbutton.setOpacity(0);

        //Nascondo e disabilito i fields + label

            //Nome Brano field + label
            nomebranofield.setOpacity(0);
            nomebranofield.setDisable(true);
            nomebranolabel.setOpacity(0);
            nomebranolabel.setDisable(true);

            //Autore Brano field + label
            autorebranofield.setOpacity(0);
            autorebranofield.setDisable(true);
            autorebranolabel.setOpacity(0);
            autorebranolabel.setDisable(true);

            //Durata Brano field + label
            duratabranofield.setOpacity(0);
            duratabranofield.setDisable(true);
            duratabranolabel.setOpacity(0);
            duratabranolabel.setDisable(true);

            //Numero Elenco field + label
            numelencofield.setOpacity(0);
            numelencofield.setDisable(true);
            numelencolabel.setOpacity(0);
            numelencolabel.setDisable(true);

        //Abilito e faccio riapparire i bottoni iniziali

            //Bottone aggiungi brano
            addbrano.setOpacity(1);
            addbrano.setDisable(false);

            //Bottone rimuovi brano
            removebrano.setOpacity(1);
            removebrano.setDisable(false);

            //Bottone modifica brano
            editbrano.setOpacity(1);
            editbrano.setDisable(false);

    }









    //CONTENUTO DELLA CLASSE ELENCO CHE ORA NON ESISTE PIÙ, HO DOVUTO FARE COSÌ PERCHÈ NON RIUSCIVA A PRENDERE I VALORI
    //DEI TEXTFIELD

    static int num=0;

    public String[] Nomebrano = new String[22];
    public String[] Autorebrano = new String[22];
    public String[] Duratabrano = new String[22];


    public void aggiungi(Dvd miocd){

        //Aggiungo agli array il brano che si vuole aggiungere
        Nomebrano[num+1] = String.join(" ", String.valueOf(num+1), miocd.getTraccia());
        Autorebrano[num+1] = miocd.getAutore();
        Duratabrano[num+1] = miocd.getDurataBr();
        //Incremento il puntatore
        num++;

        //"Stampo" la lista
        nomebranolista.getItems().setAll(Nomebrano);
        autorebranolista.getItems().setAll(Autorebrano);
        duratabranolista.getItems().setAll(Duratabrano);
    }

    public void DelBrano(int numelenco) {
        Nomebrano[numelenco] = " ";
        Autorebrano[numelenco] = " ";
        Duratabrano[numelenco] = " ";
        int target=numelenco+1;
        String temp;
        while (!Objects.equals(Nomebrano[target], " " )){
            temp = Nomebrano[target];
            temp=temp.replaceFirst(String.valueOf(target), String.valueOf(numelenco));
            Nomebrano[numelenco]=temp;
            Autorebrano[numelenco]=Autorebrano[target];
            Duratabrano[numelenco]=Duratabrano[target];
            Nomebrano[target]= " ";
            Autorebrano[target]= " ";
            Duratabrano[target]= " ";
            numelenco++;
            target++;
        }
        num--;
        nomebranolista.getItems().setAll(Nomebrano);
        autorebranolista.getItems().setAll(Autorebrano);
        duratabranolista.getItems().setAll(Duratabrano);
    }

    public void modifica(Dvd miocd, int numelenco){
        Nomebrano[numelenco] = String.join(" ", String.valueOf(numelenco), miocd.getTraccia());
        Autorebrano[numelenco] = miocd.getAutore();
        Duratabrano[numelenco] = miocd.getDurataBr();
        nomebranolista.getItems().setAll(Nomebrano);
        autorebranolista.getItems().setAll(Autorebrano);
        duratabranolista.getItems().setAll(Duratabrano);
    }

    public void Inizio(){
        //Riempio tutti gli array con uno spazio per ogni cella, così da togliere il "null"
        Arrays.fill(Nomebrano, " ");
        Arrays.fill(Autorebrano, " ");
        Arrays.fill(Duratabrano, " ");
        //Imposto all'inizio di ogni array il titolo della lista di appartenenza
        Arrays.fill(Nomebrano, 0, 1, "NOME BRANO");
        Arrays.fill(Autorebrano, 0, 1, "AUTORE BRANO");
        Arrays.fill(Duratabrano, 0, 1, "DURATA BRANO");

        nomebranolista.getItems().setAll(Nomebrano);
        autorebranolista.getItems().setAll(Autorebrano);
        duratabranolista.getItems().setAll(Duratabrano);

    }
}