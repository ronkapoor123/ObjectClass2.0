class Drink {
    private String flavor;
    private String temperature;

    private String density;
    public Drink(String flavor, String temperature, String density) {
        this.flavor = flavor;
        this.temperature = temperature;
        this.density = density;
    }


    void giveFlavor(){
        System.out.println("This is " + flavor);
    }

    void giveTemperature(){
        System.out.println("It can be drunk at " + temperature);
    }


    void giveDensity(){
        System.out.println("It also has a density of " + density);
    }


}
