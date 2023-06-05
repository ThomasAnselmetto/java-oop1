package org.lessons.java.bank;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {

//        faccio inserire il nome al nuovo cliente
        System.out.println("Inserisci il tuo nome per aprire un conto");
        Scanner scanner = new Scanner(System.in);
        String nuovoCorsista  = scanner.nextLine();

//        apro un nuovo conto istanziando appunto un nuovo Conto passando come parametro il nomeProprietario
        Conto conto1 = new Conto(nuovoCorsista);





    scanner.close();
    }
}
