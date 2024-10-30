package Ejercicio13inc;

import java.util.ArrayList;

class Menu {
    private ArrayList<IFastFood> elementos;

    public Menu() {
        this.elementos = new ArrayList<>();
    }

    public ArrayList<IFastFood> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<IFastFood> elementos) {
        this.elementos = elementos;
    }
}
