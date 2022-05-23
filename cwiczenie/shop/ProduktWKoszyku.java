package pl.edu.pw.elka.pag.cwiczenie.shop;

public class ProduktWKoszyku extends Produkt{
    private int liczbaSztukProduktu;

    public int getLiczbaSztukProduktu() {
        return liczbaSztukProduktu;
    }

    public ProduktWKoszyku(String nazwa, double cena, int liczbaSztukProduktu) {
        super(nazwa, cena);
        this.liczbaSztukProduktu = liczbaSztukProduktu;
    }

    public double sumarycznaCena()
    {
        return getCena() * getLiczbaSztukProduktu();

    }
}
