package VisitorPattern;

public class ConcreteVegetable implements FoodItemElement {
    private String name;
    private int calories;

    public ConcreteVegetable(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Vegetable [name=" + name + ", calories=" + calories + "]";
    }
}
