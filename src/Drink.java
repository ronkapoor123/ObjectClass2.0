public class Drink {
    String flavor;
    String temperature;
    String density;

    void giveFlavor(){
        System.out.println("This is " + flavor);
    }

    void giveTemperature(){
        System.out.println("It can be drinked at " + temperature);
    }


    void giveDensity(){
        System.out.println("It also has a density of " + density);
    }


}
