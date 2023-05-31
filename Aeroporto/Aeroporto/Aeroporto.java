package Aeroporto;
// Cada Aeroporto possui um número variável de pistas, terminais e hangares, mas deve, obrigatoriamente,

import java.util.ArrayList;

import Instalacoes.Hangar;
import Instalacoes.Pista;
import Instalacoes.Terminal;
import Instalacoes.TorreDeControle;

// Cada aeroporto possui Radares que fazem parte da torre de controle.

public class Aeroporto {
    private int id;
    private ArrayList<Pista> pistas;
    private ArrayList<Hangar> hangares;
    private ArrayList<Terminal> terminais;
    private TorreDeControle torreDeControle;
    private String clima;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pista> getPistas() {
        return pistas;
    }

    public void setPistas(ArrayList<Pista> pistas) {
        this.pistas = pistas;
    }

    public ArrayList<Hangar> getHangares() {
        return hangares;
    }

    public void setHangares(ArrayList<Hangar> hangares) {
        this.hangares = hangares;
    }

    public ArrayList<Terminal> getTerminais() {
        return terminais;
    }

    public void setTerminais(ArrayList<Terminal> terminais) {
        this.terminais = terminais;
    }

    public TorreDeControle getTorreDeControle() {
        return torreDeControle;
    }

    public void setTorreDeControle(TorreDeControle torreDeControle) {
        this.torreDeControle = torreDeControle;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

}
