public class Main {
    public static void main(String[] args) {
        // Create furniture items with different sizes
        Furniture chair = new Chair(5);
        Furniture table = new Table(10);
        Furniture sofa = new Sofa(15);

        // Create the visitor
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        // Calculate shipping costs
        chair.accept(calculator);
        System.out.println("Shipping cost for Chair (size 5): $" + calculator.getCost());

        table.accept(calculator);
        System.out.println("Shipping cost for Table (size 10): $" + calculator.getCost());

        sofa.accept(calculator);
        System.out.println("Shipping cost for Sofa (size 15): $" + calculator.getCost());
    }
}