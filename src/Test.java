public class Test {
    public static void main(String[] args) {


        Processor processor1 = new Processor("Intel", "i9-xyz", 3.3);
        Processor processor2 = new Processor("AMD", "wrnb", 3.6);
        Memory memory1 = new Memory("IBM", "Fury", 8, 2.2);
        Memory memory2 = new Memory("Acer", "Black", 16, 2.4);

        Computer computer1 = new Computer("Tesla", processor1, memory1);
        Computer computer2 = new Computer("Gates", processor2, memory2);

       computer1.showInfo();
       OverClock overClock=new OverClock();
       overClock.increaseCpuClock(computer1,0.5);

        System.out.println("Po podkręceniu o 0.5");
       computer1.showInfo();

    }
}
