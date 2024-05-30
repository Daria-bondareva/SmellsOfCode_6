package CodeSmells_lab_6.Part_4.ReplaceParameterwithMethodCall;

public class Processor {
    private Calculator calculator;
    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }
    public int process() {
        int x = 10;
        int y = 20;
        int result = calculator.add(x, y);

        return result;
    }
}
