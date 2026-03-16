public class Chair implements Furniture {
    private int size;

    public Chair(int size) {
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitChair(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}