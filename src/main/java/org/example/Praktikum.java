package org.example;

public class Praktikum {

    public static void main(String[] args) {
        Account accountOne = new Account("Черкасов Вадим");
        Account accountTwo = new Account("ЧеркасовВадим");
        Account accountThree = new Account("Ч В");
        Account accountFour = new Account("Черкасов Вадим Вадимыч");
        accountOne.checkNameToEmboss();
        accountTwo.checkNameToEmboss();
        accountThree.checkNameToEmboss();
        accountFour.checkNameToEmboss();
    }
}