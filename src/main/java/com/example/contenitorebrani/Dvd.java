package com.example.contenitorebrani;

public class Dvd {

    private String Traccia = " ";
    private String Autore = " ";
    private String DurataBr = " ";

    public Dvd(String tr, String aut, String durata){
        Traccia=tr;
        Autore=aut;
        DurataBr=durata;

    }
    public Dvd(){
    }
    public String getTraccia() {
        return Traccia;
    }
    public String getAutore() {
        return Autore;
    }
    public String getDurataBr() {
        return DurataBr;
    }
}