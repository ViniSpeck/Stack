public class Pancake {
    private String flavor;
    private double height;

    public Pancake(){
    }

    public Pancake(String flavor, double height) {
        this.flavor = flavor;
        this.height = height;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pancake{" +
                "flavor='" + flavor + '\'' +
                ", height=" + height + "cm" +
                '}';
    }
}
