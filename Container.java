public class Container {
    private double masaLadunku;
    private int wysokosc;
    private int dlugosc;
    private int numerSeryjny;
    private double maksymalnaWaga;

    public Container(double masaLadunku, int wysokosc, int dlugosc, int numerSeryjny, double maksymalnaWaga) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
        this.numerSeryjny = numerSeryjny;
        this.maksymalnaWaga = maksymalnaWaga;
    }

    public void usuniecieLadunku(){
        masaLadunku = 0;
    }

    public void zaladowanieLadunku(double masa) throws OverfillException {
        if (masa > maksymalnaWaga) {
            throw new OverfillException();
        }
        this.masaLadunku = masa;
    }

    public double getMasaLadunku() {
        return masaLadunku;
    }

    public void setMasaLadunku(double masaLadunku) {
        this.masaLadunku = masaLadunku;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(int numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    public double getMaksymalnaWaga() {
        return maksymalnaWaga;
    }

    public void setMaksymalnaWaga(double maksymalnaWaga) {
        this.maksymalnaWaga = maksymalnaWaga;
    }
}
