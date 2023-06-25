import java.util.ArrayList;
import java.util.List;

class RefrigeratedContainer extends Container {
    private double temperatura;
    private List<String> produkty;


    public RefrigeratedContainer(double masaLadunku, int wysokosc, int dlugosc, int numerSeryjny, double maksymalnaWaga,
                                 double temperatura) {
        super(masaLadunku, wysokosc, dlugosc, numerSeryjny, maksymalnaWaga);
        this.temperatura = temperatura;

    }

    public double getTemperature() {
        return temperatura;
    }

    public void setTemperature(double temperature) {
        this.temperatura = temperature;
    }

    {
        produkty = new ArrayList<>();
        int indeks = getNumerSeryjny();

        String indeksString = String.valueOf(indeks); // Konwersja liczby na tekst

        for (int i = 0; i < indeksString.length(); i++) {
            char cyfra = indeksString.charAt(i);
            switch (cyfra) {
                case '0':
                    produkty.add("banany");
                    break;
                case '1':
                    produkty.add("czekolada");
                    break;
                case '2':
                    produkty.add("ryba");
                    break;
                case '3':
                    produkty.add("mięso");
                    break;
                case '4':
                    produkty.add("lody czekoladowe");
                    break;
                case '5':
                    produkty.add("mrożona pizza");
                    break;
                case '6':
                    produkty.add("ser");
                    break;
                case '7':
                    produkty.add("kiełbaski");
                    break;
                case '8':
                    produkty.add("masło");
                    break;
                case '9':
                    produkty.add("mleko");
                    break;
            }
        }
    }

    public List<String> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<String> produkty) {
        this.produkty = produkty;
    }
}