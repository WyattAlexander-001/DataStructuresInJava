package VisitorPattern;

public class PrintDetailsVisitor implements FoodVisitor {
    @Override
    public void visit(ConcreteFruit fruit) {
        System.out.println("Fruit: " + fruit.getName() + ", Calories: " + fruit.getCalories());
    }

    @Override
    public void visit(ConcreteVegetable vegetable) {
        System.out.println("Vegetable: " + vegetable.getName() + ", Calories: " + vegetable.getCalories());
    }

    @Override
    public void visit(ConcreteMeat m) {
        System.out.println("Meat: " + m.getName() + ", Calories: " + m.getCalories());
    }
}
