package VisitorPattern;

public class ConcreteMeat implements FoodItemElement {
    private String name;
    private int calories;

    public ConcreteMeat(String name, int calories) {
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
}
