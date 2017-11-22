package Thread;

public class test extends Thread{
    private int i, sum=0;

    public void run() {
        for (; i < 10; i++) {
            sum=sum+1;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int sum2=10;
        for (int i = 0; i < 10; i++) {
            sum2=sum2-1;
            System.out.println(sum2);
            new test().start();
        }

    }
}