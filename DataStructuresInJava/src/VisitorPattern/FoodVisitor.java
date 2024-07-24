package VisitorPattern;

public interface FoodVisitor {
    //Method overloading used for different ELEMENTS -> These get fed to the FoodItemElement interface
    void visit(ConcreteFruit f);
    void visit(ConcreteVegetable v);
    void visit(ConcreteMeat m);
}
