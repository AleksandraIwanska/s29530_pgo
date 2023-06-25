// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContainerShip statek1 = ContainerShip.utworzStatek(200, 10);

        RefrigeratedContainer refrigeratedContainer = new RefrigeratedContainer(200.0,3000,1400,29530,250.0,10.0);
        LiquidContainer liquidContainer = new LiquidContainer(200.0,1500,1000,29530,500.0,false);
        GasContainer gasContainer = new GasContainer(200.0,2000,1500,29530,452,99.5);

        try {
            refrigeratedContainer.zaladowanieLadunku(100.0);
            liquidContainer.zaladowanieLadunku(50.0);
            gasContainer.zaladowanieLadunku(100.0);
        }
        catch (OverfillException e){
            System.out.println(e.getMessage());
        }
        statek1.dodajKontener(refrigeratedContainer);
        statek1.dodajKontener(liquidContainer);
        statek1.dodajKontener(gasContainer);

        ContainerShip statek2 = ContainerShip.utworzStatek(150, 8);

        ContainerShip.przeniesKontenery(statek1, statek2);
        statek2.getContainers().clear();
    }
}