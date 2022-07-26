package it.academy.java.sprint3.tasca1.n1exercisi1;

import java.util.ArrayList;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 01. Testing (Spring3), Nivell 1, Exercisi 1");

        ArrayList<String> comandes = new ArrayList<>();
        comandes.add("crear");
        comandes.add("rename");
        comandes.add("close");
        comandes.add("copy");
        comandes.add("paste");


        Undo undo1 = Undo.getInstance();
        undo1.setComandes(comandes);
        Undo undo2 = Undo.getInstance();

        //check that we have only one object using the hashCode as a verification
        System.out.println(undo1.hashCode());
        System.out.println(undo2.hashCode());
    }


}
