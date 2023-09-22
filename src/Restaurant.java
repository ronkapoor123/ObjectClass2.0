

public class Restaurant {
    String mealspeed;
    int price;
    String mealtype;
    String name;


    void Name(){
        System.out.println("The name of this restaurant is " + name);
    }
    void bill() {
        System.out.println("Your bill is $" + price );
    }

    void order() {
        System.out.println("what do you want to eat");
    }

    void foodpreperation() {
        System.out.println("WE'RE MAKING " + mealtype + "AT " + mealspeed);
    }
}
