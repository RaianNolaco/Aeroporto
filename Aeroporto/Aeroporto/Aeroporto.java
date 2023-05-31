package Aeroporto;
// Cada Aeroporto possui um número variável de pistas, terminais e hangares, mas deve, obrigatoriamente,

// possuir ao menos uma pista e uma torre de controle. Cada avião, aeroporto, pista, terminal e torre de controle
// devem possuir um número único de identificação para que possa haver o tráfego aéreo

import Intalacoes.Hangar;
import Intalacoes.Pista;
import Intalacoes.Terminal;
import Intalacoes.TorreDeControle;

// Cada aeroporto possui Radares que fazem parte da torre de controle.

public class Aeroporto {
    private int id;
    private Pista[] pistas;
    private Hangar[] hangares;
    private Terminal[] terminais;
    private TorreDeControle torreDeControle;
    private String clima;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pista[] getPistas() {
        return pistas;
    }

    public void setPistas(Pista[] pistas) {
        this.pistas = pistas;
    }

    public Hangar[] getHangares() {
        return hangares;
    }

    public void setHangares(Hangar[] hangares) {
        this.hangares = hangares;
    }

    public Terminal[] getTerminais() {
        return terminais;
    }

    public void setTerminais(Terminal[] terminais) {
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
