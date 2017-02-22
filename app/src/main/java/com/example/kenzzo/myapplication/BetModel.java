package com.example.kenzzo.myapplication;

import android.widget.Spinner;

import java.util.Date;

/**
 * Created by benoitpuech on 22/02/2017.
 */

public class BetModel {
    private String date;
    private Spinner etat;
    private Double mise;
    private Double cote;
    private Double result;
    private Double benef;

    public BetModel(String date, Spinner etat, Double mise, Double cote, Double result, Double benef) {
        this.date = date;
        this.etat = etat;
        this.mise = mise;
        this.cote = cote;
        this.result = result;
        this.benef = benef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Spinner getEtat() {
        return etat;
    }

    public void setEtat(Spinner etat) {
        this.etat = etat;
    }

    public Double getMise() {
        return mise;
    }

    public void setMise(Double mise) {
        this.mise = mise;
    }

    public Double getCote() {
        return cote;
    }

    public void setCote(Double cote) {
        this.cote = cote;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getBenef() {
        return benef;
    }

    public void setBenef(Double benef) {
        this.benef = benef;
    }
}
