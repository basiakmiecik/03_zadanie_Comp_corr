public class OverClock {
    public void increaseCpuClock(Computer computer, double increaseClocking){
    computer.processor.setClocking(computer.processor.clocking+=increaseClocking);
    }

    public void decreaseCpuClock(Computer computer, double decreaseClocking){
        computer.processor.setClocking(computer.processor.clocking-=decreaseClocking);
    }
}
