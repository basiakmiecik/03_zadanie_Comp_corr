public class ComputerAssembly {


    public Computer assembly(String name, String procName, double clockProc, String memName, int memCount, double memClock ){
        Processor proc= new Processor(procName,clockProc);
        Memory mem= new Memory(memName, memCount,memClock);
            Computer comp= new Computer(name, proc,mem);
        return comp;
    }
    }
