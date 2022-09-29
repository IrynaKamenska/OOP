package flowers;

public class MainFlower {
    public static void main(String[] args) {
// ohne Instanz kann zugreifen - static
        System.out.println("MAX_DIAMETER: " + FlowerPot.MAX_DIAMETER);
        System.out.println("MIN_DIAMETER: " + FlowerPot.MIN_DIAMETER);


        // create new Object
        FlowerPot anasPot = new FlowerPot("braun");
        anasPot.setSize("mittel");
        System.out.println(anasPot);
/*        anasPot.shape = "rund";
        anasPot.material = "ton";
        anasPot.diameter = 30;
        anasPot.hole = true;*/

        FlowerPot stevensPot = new FlowerPot("braun");
        stevensPot.setSize("groß");
        System.out.println(stevensPot);
/*        stevensPot.shape = "rund";
        stevensPot.material = "ton";
        stevensPot.diameter = 10;
        stevensPot.hole = false;*/


        // Ausgabe
        System.out.println("Size von Anas Pot: " + anasPot.getSize());
        System.out.println(anasPot);

        System.out.println("Stev hash: " + stevensPot.hashCode());
        System.out.println("Anas hash: " + anasPot.hashCode());
        System.out.println(stevensPot.equals(anasPot));



    }
}
