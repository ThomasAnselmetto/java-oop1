//Anche oggi l’esercitazione è composta da due esercizi distinti, da pushare in un unica repo.
//        Nome repo: java-oop1
//        Esercizio 1 : Java Shop. :shopping_trolley:
//        Nel progetto java-oop-1, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
//        Un prodotto è caratterizzato da:
//        - codice (numero intero)
//        - nome
//        - descrizione
//        - prezzo
//        - iva
//        Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “servizio” per fare in modo che:

//        alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//        Il codice prodotto sia accessibile solo in lettura
//        Gli altri attributi siano accessibili sia in lettura che in scrittura
//        Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
//        Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
//        Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è) Buon lavoro!
//
//
//        Esercizio 2: Java Bank :bank:
//
//        - alla creazione di un nuovo conto il saldo sia 0€

//        - Il codice conto sia accessibile solo in lettura, il proprietario sia accessibile in lettura e in scrittura e il saldo sia accessibile solo in lettura

//        - siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)

//        - altri metodi per ritornare le informazioni del conto e il saldo formattato

//        dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
//        Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro, oppure uscire. Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e
//        proviamo ad effettuare l’operazione sul conto. Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto. Il menu continua ad apparire fino a che l’utente sceglie di uscire.
//        Buon lavoro! :slightly_smiling_face: