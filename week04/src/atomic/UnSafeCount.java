package atomic;

public class UnSafeCount {

    private int num = 0;

    public int add() {
        return num++;
    }

    public int getNum() {
        return num;
    }
}
