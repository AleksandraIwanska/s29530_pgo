class LiquidContainer extends Container implements Explosible {
    private boolean czyNiebezpieczny;

    public LiquidContainer(double masaLadunku, int wysokosc, int dlugosc, int numerSeryjny, double maksymalnaWaga,
                           boolean czyNiebezpieczny) {
        super(masaLadunku, wysokosc, dlugosc, numerSeryjny, maksymalnaWaga);
        this.czyNiebezpieczny = czyNiebezpieczny;

    }

    public void zaladowanieLadunku(double masa) throws OverfillException {
        if (czyNiebezpieczny && masa > getMaksymalnaWaga() / 2) {
            explode();
            throw new OverfillException();
        } else if (!czyNiebezpieczny && masa > getMaksymalnaWaga() * 0.9) {
            explode();
            throw new OverfillException();
        }
        super.zaladowanieLadunku(masa);
    }

    public void explode() {
        System.out.println("Liquid container with serial number: " + getNumerSeryjny() + " exploded!");
    }
}