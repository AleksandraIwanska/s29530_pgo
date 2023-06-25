class GasContainer extends Container implements Explosible {
    private double cisnienie;

    public GasContainer(double masaLadunku, int wysokosc, int dlugosc, int numerSeryjny, double maksymalnaWaga,
                        double cisnienie) {
        super(masaLadunku, wysokosc, dlugosc, numerSeryjny, maksymalnaWaga);
        this.cisnienie = cisnienie;

    }

    @Override
    public void usuniecieLadunku() {
        super.usuniecieLadunku();
        setMasaLadunku(getMasaLadunku() * 0.05);
    }

    @Override
    public void zaladowanieLadunku(double masa) throws OverfillException {
        if (masa > getMasaLadunku()){
            explode();
            throw new OverfillException();
        }
        setMasaLadunku(masa);
    }

    @Override
    public void explode() {
        System.out.println("Gas container with serial number: " + getNumerSeryjny() + " exploded!");
    }

    public double getCisnienie() {
        return cisnienie;
    }

    public void setCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
    }
}