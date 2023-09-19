package com.codeclan;

public class Printer {
    private int sheets;
    private int toner;
    public Printer(int _sheets, int _toner){
        this.sheets = _sheets;
        this.toner = _toner;
    }
    public int getSheets(){
        return this.sheets;
    }
    public int getToner(){
        return this.toner;
    }
    public void print(int pages, int copies){
        if (this.sheets>=pages*copies && toner>0){
            this.sheets-=pages*copies;
            this.toner-=1;
        } else if (toner==0) {
            System.out.println("not enough toner");
        } else {
            System.out.println("not enough paper");
        }
    }
}
