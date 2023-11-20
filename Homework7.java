abstract class Printer{
    public abstract boolean print();
    public String model;
    public int printedCount = 1;
    public int availableCount;
}
class InkjetPrinter extends Printer{
    String model; int count;
    InkjetPrinter(String model, int count){
        super.availableCount = count;
        this.model = model;
        this.count = count;
    }
    @Override
    public boolean print(){
        if(availableCount >= 1){
            printedCount +=1;
            availableCount -=1;
            return true;
        }
        else{
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n",model, printedCount);
            return false;
        }
    }
}
class LaserPrinter extends Printer{
    String model; int count;
    LaserPrinter(String model, int count){
        super.availableCount = count;
        this.model = model;
        this.count = count;
    }
    @Override
    public boolean print(){
        if(availableCount >= 1){
            printedCount +=1;
            availableCount -=1;
            return true;
        }
        else{
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n",model,printedCount);
            return false;
        }
    }
}
public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}