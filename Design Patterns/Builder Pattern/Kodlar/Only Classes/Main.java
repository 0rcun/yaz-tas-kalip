package com.company;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        ComputerBuilder gameComputerBuilder = new GameComputerBuilder();
        ComputerBuilder workstationComputerBuilder = new WorkstationComputerBuilder();

        factory.setComputerBuilder( gameComputerBuilder );
        factory.constructComputer();

        Computer computer = factory.getComputer();
        System.out.println(computer.getCPU()+"\t"+computer.getRAM()+"\t"+computer.getSSDSize()+"\n");

        factory.setComputerBuilder( workstationComputerBuilder );
        factory.constructComputer();

        Computer computer1 = factory.getComputer();
        System.out.println(computer1.getCPU()+"\t"+computer1.getRAM()+"\t"+computer1.getSSDSize());

    }
}
/* "Product" */
class Computer {
    private String CPU = "";
    private int RAM;
    private int SSDSize;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setSSDSize(int SSDSize) {
        this.SSDSize = SSDSize;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getSSDSize() {
        return SSDSize;
    }
}

/* "Abstract Builder" */
abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer() {
        computer = new Computer();
    }

    public abstract void determineCPU();
    public abstract void determineRAM();
    public abstract void determineSSDSize();
}

/* "ConcreteBuilder" */
class GameComputerBuilder extends ComputerBuilder {
    public void determineCPU() {
        computer.setCPU("Intel Core i5-6200U");
    }

    public void determineRAM() {
        computer.setRAM(8);
    }

    public void determineSSDSize() {
        computer.setSSDSize(256);
    }
}

/* "ConcreteBuilder" */
class WorkstationComputerBuilder extends ComputerBuilder {
    public void determineCPU() {
        computer.setCPU("Intel Core i9-9900k");
    }

    public void determineRAM() {
        computer.setRAM(64);
    }

    public void determineSSDSize() {
        computer.setSSDSize(1024);
    }
}

/* "Director" */
class Factory {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder pb) {
        computerBuilder = pb;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.createNewComputer();
        computerBuilder.determineCPU();
        computerBuilder.determineRAM();
        computerBuilder.determineSSDSize();
    }
}



