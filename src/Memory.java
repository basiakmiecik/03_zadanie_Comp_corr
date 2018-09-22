public class Memory {
    String producent;
    String model;
    int count;
    double clocking;

    public Memory(String producent, String model, int count, double clocking) {
        this.producent = producent;
        this.model = model;
        this.count = count;
        this.clocking = clocking;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getClocking() {
        return clocking;
    }

    public void setClocking(double clocking) {
        this.clocking = clocking;
    }
}
