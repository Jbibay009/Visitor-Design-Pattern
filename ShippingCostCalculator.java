public class ShippingCostCalculator implements Visitor {
    private double cost;

    @Override
    public void visitChair(Chair chair) {
        // Flat rate plus size factor
        cost = 10.0 + 0.5 * chair.getSize();
    }

    @Override
    public void visitTable(Table table) {
        // Base rate plus size factor
        cost = 5.0 + 1.0 * table.getSize();
    }

    @Override
    public void visitSofa(Sofa sofa) {
        // Higher base for bulky items plus size factor
        cost = 20.0 + 2.0 * sofa.getSize();
    }

    public double getCost() {
        return cost;
    }
}