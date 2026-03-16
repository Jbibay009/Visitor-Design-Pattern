public interface Furniture {
    void accept(Visitor visitor);
    int getSize();
}