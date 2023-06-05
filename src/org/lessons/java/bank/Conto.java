package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    private int numeroDiConto;
    private String nomeDelProprietario;
    private double saldo;


//    costruttore

    public Conto(String nomeDelProprietario){
        this.numeroDiConto = new Random().nextInt(1, 1000);
        this.nomeDelProprietario = nomeDelProprietario;
        this.saldo = 0;
    }

    //getter e setter
    public int getNumeroDiConto() {
    return numeroDiConto;
}
    public String getNomeDelProprietario() {
        return nomeDelProprietario;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNomeDelProprietario(String nomeDelProprietario) {
        this.nomeDelProprietario = nomeDelProprietario;
    }

//    metodi

    public String saldoFormattato(){
        return new DecimalFormat("#,###.##€").format(saldo);
    }
//    creo metodo per prelevare denaro e gli passo un parametri cifra che sara' un double
        public void prelevaDenaro(double cifraDaPrelevare){
        if(cifraDaPrelevare > saldo){
            System.out.println("La Cifra selezionata supera il tuo budget! inserisci una nuova cifra");
        }else if(cifraDaPrelevare == 0){
            System.out.println("Hai inserito un importo pari a 0! inserisci una nuova cifra");
        }else{
            saldo += cifraDaPrelevare;
            System.out.println("Sperpera tutti i soldi prelevati,mi raccomando");
        }
        }
    public void versaDenaro(double cifraDaVersare){
        if(cifraDaVersare <= 0){
            System.out.println("Impossibile versare cifre negative o pari a zero");
        }else{
            System.out.println("operazione di versamento effettuata!");
        }
    }


}



