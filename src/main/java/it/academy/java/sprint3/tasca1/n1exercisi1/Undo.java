package it.academy.java.sprint3.tasca1.n1exercisi1;

import java.util.ArrayList;

public class Undo {

    private static Undo undo;
    private ArrayList<String> comandes;

    private Undo() {
    }

    public static Undo getInstance() {
        if (null == undo) {

            undo = new Undo();
        }
        return undo;
    }


    public ArrayList<String> getComandes() {
        return comandes;
    }

    public void setComandes(ArrayList<String> comandes) {
        this.comandes = comandes;
    }

    @Override
    public String toString() {
        return "Undo{" +
                "comandes=" + comandes +
                '}';
    }
}
