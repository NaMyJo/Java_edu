class PersonalComputer{
    Computer computer = new Computer();
    Monitor monitor = new Monitor();
    public void turnon(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printinfoComputer(){
        computer.printinfo();
    }
    public void printinfoMonitor(){
        monitor.printinfo();
    }
}
class Monitor{
    private String monitorSize = "32 inch";
    private String color = "Black";
    private String power = "45W";
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printinfo(){
        System.out.printf("The spec of the monitor\n"+
                " monitersize: %s\n"+" color: %s\n"+" power: %s\n",
                monitorSize,color,power);
    }

}
class Computer{
    private String cpu = "Core i7";
    private String memory = "32GB";
    private String HDD = "2TB";
    private String coolor = "White";
    private String power = "700W";
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printinfo(){
        System.out.printf("The spec of the computer\n"+
                        " cpu: %s\n"+" memory: %s\n"+" HDD: %s\n"+" cooler: %s\n"+" power:%s\n",
                cpu,memory,HDD,coolor,power);
    }
}


public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer personalComputer = new PersonalComputer();
        personalComputer.turnon();
        personalComputer.printinfoComputer();
        personalComputer.printinfoMonitor();
    }
}