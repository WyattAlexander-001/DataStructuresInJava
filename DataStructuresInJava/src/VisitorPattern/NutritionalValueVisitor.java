package VisitorPattern;

public class NutritionalValueVisitor implements FoodVisitor {
    @Override
    public void visit(ConcreteFruit fruit) {
        System.out.println("Nutritional Value of " + fruit.getName() + ": " + fruit.getCalories() + " calories.");
    }

    @Override
    public void visit(ConcreteVegetable vegetable) {
        System.out.println("Nutritional Value of " + vegetable.getName() + ": " + vegetable.getCalories() + " calories.");
    }

    @Override
    public void visit(ConcreteMeat m) {
        System.out.println("Nutritional Value of " + m.getName() + ": " + m.getCalories() + " calories.");
    }
}
