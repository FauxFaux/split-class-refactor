public class Original {
    private final left left = new left();
    private final Right right = new Right();

    public void alpha() {
        getLeft().alpha();
    }

    public void beta() {
        getLeft().beta();
    }

    public void gamma() {
        getRight().gamma();
    }

    public left getLeft() {
        return left;
    }

    public Right getRight() {
        return right;
    }
}
