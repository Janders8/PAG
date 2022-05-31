package pl.edu.pw.elka.pag.cwiczenie.shop;

import java.util.ArrayList;
import java.util.Stack;

public class Klient {
    private String PESEL;
    private Koszyk koszyk;

    public String getPESEL() {
        return PESEL;
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }

    public Klient(String PESEL, Koszyk koszyk) {
        this.PESEL = PESEL;
        this.koszyk = koszyk;
    }



    public static void main(String[] args)
    {
        ArrayList<Produkt> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkt("makaron", 15.99));
        listaProduktow.add(new Produkt("ser", 9.99));
        listaProduktow.add(new Produkt("pierogi", 19.99));
        listaProduktow.add(new Produkt("cola", 6.99));
        listaProduktow.add(new Produkt("humus", 4.99));
        listaProduktow.add(new Produkt("marchewka", 3.99));


        ArrayList<Klient> listaKlientow = new ArrayList<>();
//        listaKlientow.add(new Klient("0111111111",
//                new Koszyk(new ProduktWKoszyku("makaron", 15.99, 2)) ));

        /// jak dodac taka serie obiektow czytelnie?

        Stack<ProduktWKoszyku> tempStack = new Stack<>();
        tempStack.push(new ProduktWKoszyku("marchewka", 3.99, 2));
        tempStack.push(new ProduktWKoszyku("pierogi", 19.99,3));

        listaKlientow.add(new Klient("0111111111", new Koszyk(tempStack)));

        tempStack = null;

        tempStack = new Stack<>();
        tempStack.push(new ProduktWKoszyku("cola", 6.99, 1));
        tempStack.push(new ProduktWKoszyku("humus", 4.99, 5));

        listaKlientow.add(new Klient("0222222222", new Koszyk(tempStack)));

        Stack<Klient> kolejka = new Stack<>();

        kolejka.push(listaKlientow.get(1));
        kolejka.push(listaKlientow.get(0));

        tempStack = null;
        // po klientach
//        for(int i =0; i < kolejka.capacity(); i++)
        while(!kolejka.empty())
        {
            double sum = 0;
            String name = kolejka.peek().getPESEL();
            // po produktach
//            for (int j =0; j< kolejka.peek().getKoszyk().getProdukty().capacity(); j++)
            while(!kolejka.peek().getKoszyk().getProdukty().empty())
            {
                sum += Math.round(kolejka.peek().getKoszyk().getProdukty().pop().sumarycznaCena());
            }
            kolejka.pop();
            System.out.println("Klient :" + name + " zaplacil :" + sum + " zl" );
        }

    }

}
