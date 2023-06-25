import java.util.ArrayList;
import java.util.List;

class ContainerShip {
    private List<Container> kontenery;
    private double maksymalnaPredkosc;
    private int maksymalnaIloscKontenerow;

    private static int numerIndeksu = 29530;
    public List<Container> getKontenery() {
        return kontenery;
    }

    public void setKontenery(List<Container> kontenery) {
        this.kontenery = kontenery;
    }

    public double getMaksymalnaPredkosc() {
        return maksymalnaPredkosc;
    }

    public void setMaksymalnaPredkosc(double maksymalnaPredkosc) {
        this.maksymalnaPredkosc = maksymalnaPredkosc;
    }

    public int getMaksymalnaIloscKontenerow() {
        return maksymalnaIloscKontenerow;
    }

    public void setMaksymalnaIloscKontenerow() {
        if (numerIndeksu % 2 == 0) {
            this.maksymalnaIloscKontenerow = numerIndeksu / 2;
        } else {
            this.maksymalnaIloscKontenerow = numerIndeksu / 5;
        }
    }
    public ContainerShip() {
        kontenery = new ArrayList<>();
        setMaksymalnaIloscKontenerow();
    }

    public List<Container> getContainers() {
        return kontenery;
    }


    public void dodajKontener(Container kontener) {
        kontenery.add(kontener);
    }

    public void dodajKontenery(List<Container> noweKontenery) {
        kontenery.addAll(noweKontenery);
    }

    public void usunKontener(Container container) {
        kontenery.remove(container);
    }

    public void usunKontener(List<Container> containersToRemove) {
        kontenery.removeAll(containersToRemove);
    }

    public void zamienKontener(int pozycja, Container nowyKontener) {
        kontenery.set(pozycja, nowyKontener);
    }

    public static void przeniesKontenery(ContainerShip skad, ContainerShip dokad) {
        dokad.dodajKontenery(skad.getContainers());
        skad.getContainers().clear();
    }

    public static ContainerShip utworzStatek(int speed) {
        ContainerShip statek = new ContainerShip();
        statek.setMaksymalnaPredkosc(speed);
        statek.setMaksymalnaIloscKontenerow();
        return statek;
    }
}
