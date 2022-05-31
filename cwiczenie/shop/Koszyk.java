package pl.edu.pw.elka.pag.cwiczenie.shop;

import java.util.Stack;

public class Koszyk {
    private Stack<ProduktWKoszyku> produkty;

    public Koszyk(Stack<ProduktWKoszyku> produkty) {
        this.produkty = produkty;
    }

    public Stack<ProduktWKoszyku> getProdukty() {
        return produkty;
    }
}
