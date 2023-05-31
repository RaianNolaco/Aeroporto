package Aeroporto;

import java.util.ArrayList;

import Aeronave.Voo;

public class BaseDeVoos {
    private static ArrayList<Voo> voos;

    public static void cadastrarvoo(Voo voo) {
        voos.add(voo);
    }

    public static ArrayList<Voo> getVoos() {
        return voos;
    }

}
