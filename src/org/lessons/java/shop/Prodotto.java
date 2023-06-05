package org.lessons.java.shop;
import java.util.Random;
public class Prodotto {
    // Attributi
    private int codice;
    private String nome;
    private String descrizione;
    private double  prezzo;
    private int iva;

   //Costruttore
    public Prodotto(String nome,String descrizione,double  prezzo, int iva) {
        this.codice = new Random().nextInt(0, 1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }
//    I getter non hanno parametri e
//    restituiscono un tipo di dato = al tipo
//    dell'attributo mentre
//    I setter restituiscono void e hanno un
//    parametro di tipo = al tipo dell'attributo

    //Getters e Setters
        public int getCodice() {
            return codice;
        }
        public String getNome() {
            return nome;
        }
        public String getDescrizione() {
            return descrizione;
        }
        public double getPrezzo() {
            return prezzo;
        }
        public int getIva() {
            return iva;
        }

    // non inserisco il setter del codice in quando ha accesso solo per la lettura,per gli altri creo un setter public che dara' void(
//     traducibile come "vuoto" dichiarare un metodo void significa dire che il metodo non ritornerà alcun valore ed in tal caso la keyword return può essere anche omessa.
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }
        public void setPrezzo(double prezzo) {
            this.prezzo = prezzo;
        }
        public void setIva(int iva) {
            this.iva = iva;
        }

//        alcuni setter inseriti ma non utilizzati

//    Metodi

//    Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
        public double prezzoIvato(){
            return prezzo + prezzo * iva / 100;
        }
    //    Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
        public String NomeCompleto() {

            return codice + "-" + nome;
        }


}
