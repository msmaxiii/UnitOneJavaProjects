public class Mars {
    public static void main(String[]args){
        String ColonyName = "NarrowGate";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        System.out.println(ShipFood);

        ShipFood = ShipFood + (ShipFood * .5);
        ShipPopulation = ShipPopulation + 5;

        String LandingLocation = "The Ocean";

        if(LandingLocation.equalsIgnoreCase("The Plain"))
        System.out.println("Bbzzz Landing on the Plain");
    }
     else
    {
        System.out.println("Error!!! Flight plan already set. Landing on the Plain");
    }
    Landing = LandingCheck(100);


}


