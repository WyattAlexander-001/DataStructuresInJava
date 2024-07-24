package VisitorPattern;

public interface FoodItemElement {
    void accept(FoodVisitor v);
}
