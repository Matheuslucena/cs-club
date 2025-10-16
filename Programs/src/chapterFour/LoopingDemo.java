package Programs.src.chapterFour;

public class LoopingDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }

        System.out.println(total);
    }
}
