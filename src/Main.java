public class Main {
    private static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.name = "Hot dog's";
        restaurant1.Name();
        restaurant1.price = 1;
        restaurant1.bill();
        // wait to get some order  restaurant.order = "whatever they order" ;
        restaurant1.order();
        // wait to get order restaurant1.preparation = "";
        restaurant1.foodpreperation();

        Drink drink1 = new Drink("Water.","Any Temperature.","1g.");{
            drink1.giveFlavor();
            drink1.giveTemperature();
            drink1.giveDensity();
        }
    }
}