/**
 * @author Chris Campo
 */
public class Calculator {

    private int memory = 0;

    public int getMemory() {
        return memory;
    }

    public void setMemory(final int memory) {
        this.memory = memory;
    }

    public int add(final int a, final int b) {
        return a + b;
    }

    public int multiply(final int a, final int b) {
        return a * b;
    }

    public int divide(final int a, final int b) {
        return a / b;
    }
}
