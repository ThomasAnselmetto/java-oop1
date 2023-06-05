package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
//        passo nel nuovo prodotto istanziato i parametri che avevo nel costruttore (nome,descrizione,prezzo,iva)
        Prodotto prodotto1 = new Prodotto("Air-Jordan-1","Scarpa iconica degli anni 90'",350,22);

        System.out.println("Codice: " + prodotto1.getCodice());
        System.out.println("Nome: " + prodotto1.getNome());
        System.out.println("Descrizione: " + prodotto1.getDescrizione());
        System.out.println("Prezzo: " + prodotto1.getPrezzo());
        System.out.println("Aliquota IVA: " + prodotto1.getIva() + "%");

        System.out.println("Prezzo ivato: " + prodotto1.prezzoIvato());
        System.out.println("Nome completo: " + prodotto1.NomeCompleto());

//        provo ad istanziare un nuovo prodotto e stampo

        Prodotto prodotto2 = new Prodotto("Air-Max","Scarpa iconica degli ultimi 15 anni",180,22);

        System.out.println("Codice: " + prodotto2.getCodice());
        System.out.println("Nome: " + prodotto2.getNome());
        System.out.println("Descrizione: " + prodotto2.getDescrizione());
        System.out.println("Prezzo: " + prodotto2.getPrezzo());
        System.out.println("Aliquota IVA: " + prodotto2.getIva() + "%");

        System.out.println("Prezzo ivato: " + prodotto2.prezzoIvato());
        System.out.println("Nome completo: " + prodotto2.NomeCompleto());
    }
}
