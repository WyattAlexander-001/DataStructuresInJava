package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        FoodItemElement apple = new ConcreteFruit("Apple", 95);
        FoodItemElement carrot = new ConcreteVegetable("Carrot", 25);
        FoodItemElement chicken = new ConcreteMeat("Chicken", 335);

        System.out.println(apple);
        System.out.println(carrot);
        System.out.println(chicken);

        FoodVisitor nutritionalValueVisitor = new NutritionalValueVisitor();
        FoodVisitor printDetailsVisitor = new PrintDetailsVisitor();

        FoodItemElement[] foodItems = { apple, carrot, chicken };

        for (FoodItemElement foodItem : foodItems) {
            foodItem.accept(nutritionalValueVisitor);
        }

        for (FoodItemElement foodItem : foodItems) {
            foodItem.accept(printDetailsVisitor);
        }
    }
}
