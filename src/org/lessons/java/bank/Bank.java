package org.lessons.java.bank;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Faccio inserire il nome al nuovo cliente
        System.out.println("Inserisci il tuo nome per aprire un conto");
        Scanner scanner = new Scanner(System.in);
        String nuovoCorsista = scanner.nextLine();

        // Apro un nuovo conto istanziando un nuovo oggetto Conto, passando il nome del proprietario come parametro
        Conto conto1 = new Conto(nuovoCorsista);
        System.out.println("Complimenti " + nuovoCorsista + ", hai creato il tuo conto");

        // Utilizzo un loop do-while per richiedere l'operazione finché non viene inserito un numero compreso tra 1 e 3
        int inputOperazione;
        double saldoBase = conto1.getSaldo();
        do {
            System.out.println("Scegli un'opzione: ");
            System.out.println("Preleva una somma (digita 1)");
            System.out.println("Versa una somma (digita 2)");
            System.out.println("Esci (digita 3)");
            inputOperazione = scanner.nextInt();
            System.out.println("Hai digitato " + inputOperazione);
        } while (inputOperazione < 1 || inputOperazione > 3);

        switch (inputOperazione) {
            case 1: // Preleva una somma
                System.out.println("Quale cifra desideri prelevare?");
                double sommaDaPrelevare = scanner.nextDouble();
                conto1.prelevaDenaro(sommaDaPrelevare);
                double aggiornamentoPrelievo = saldoBase - sommaDaPrelevare;
                System.out.println("Il tuo saldo aggiornato è pari a " + aggiornamentoPrelievo);
                break;

            case 2: // Versa una somma
                System.out.println("Quale cifra desideri versare?");
                double cifraDaVersare = scanner.nextDouble();
                conto1.versaDenaro(cifraDaVersare);
                double aggiornamentoVersamento = saldoBase + cifraDaVersare;
                System.out.println("Il tuo saldo aggiornato è pari a " + aggiornamentoVersamento);
                break;

            case 3: // esci
                System.out.println("Arrivederci");
                break;

        }
        scanner.close();
    }
}
