public class Computer {
    String name;
    Processor processor;
    Memory memory;

    public Computer(String name, Processor processor, Memory memory) {
        this.name = name;
        this.processor = processor;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void showInfo(){
        System.out.println("Nazwa: "+getName()+" \nTaktowanie procesora: "+getProcessor().clocking);
    }
}
