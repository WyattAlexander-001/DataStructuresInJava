package VisitorPattern;

public interface FoodVisitor {
    void visit(ConcreteFruit fruit);
    void visit(ConcreteVegetable vegetable);
    void visit(ConcreteMeat meat);
}
