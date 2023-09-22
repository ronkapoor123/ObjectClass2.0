public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.name = "Hotdog's";
        restaurant1.Name();
        restaurant1.price = 1;
        restaurant1.bill();
        // wait to get some order  restaurant.order = "whatever they order" ;
        restaurant1.order();
        // wait to get order restaurant1.foodpreparation = "";
        restaurant1.foodpreperation();

        Drink drink1 = new Drink();{
            drink1.flavor = "Water.";
            drink1.giveFlavor();

            drink1.temperature = "Any Temperature.";
            drink1.giveTemperature();

            drink1.density = "1g.";
            drink1.giveDensity();
        }
    }
}