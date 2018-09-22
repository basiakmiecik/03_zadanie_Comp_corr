public class Processor {
    String producent;
    String model;
    double clocking;

    public Processor(String producent, String model, double clocking) {
        this.producent = producent;
        this.model = model;
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

    public double getClocking() {
        return clocking;
    }

    public void setClocking(double clocking) {
        this.clocking = clocking;
    }
}
