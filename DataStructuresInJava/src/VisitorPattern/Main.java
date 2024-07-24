package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        //Make Your Elements
        FoodItemElement apple = new ConcreteFruit("Apple", 95);
        FoodItemElement carrot = new ConcreteVegetable("Carrot", 25);
        FoodItemElement chicken = new ConcreteMeat("Chicken", 335);

        System.out.println(apple);
        System.out.println(carrot);
        System.out.println(chicken);

        //Make Your Visitors You're Going To Use
        FoodVisitor nutritionalValueVisitor = new NutritionalValueVisitor();
        FoodVisitor printDetailsVisitor = new PrintDetailsVisitor();

        System.out.println("\nAn Example With An APPLE!!!!!!\n");
        apple.accept(nutritionalValueVisitor);
        apple.accept(printDetailsVisitor);

        System.out.println("\nAn Example With A CHICKEN!!!!!!\n");
        chicken.accept(nutritionalValueVisitor);
        chicken.accept(printDetailsVisitor);

        System.out.println("\nITERATION!!!!!\n");
        FoodItemElement[] foodItems = { apple, carrot, chicken };

        for (FoodItemElement foodItem : foodItems) {
            foodItem.accept(nutritionalValueVisitor);
        }

        for (FoodItemElement foodItem : foodItems) {
            foodItem.accept(printDetailsVisitor);
        }
    }
}
