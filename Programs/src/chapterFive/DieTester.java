package Programs.src.chapterFive;

public class DieTester {
    public static void main(String[] args) {
        Die die = new Die();

        System.out.println("Beginning state of die: ");
        System.out.println("faceValue : " + die.getFaceValue());
        System.out.println("maxValue : " + die.getMaxValue());

        die.roll();
        System.out.println("\nState of die after invoking roll method(faceValue can be different): ");
        System.out.println("faceValue : " + die.getFaceValue());
        System.out.println("maxValue : " + die.getMaxValue());

        die.setFaceValue(15);
        System.out.println("\nState of die after trying to set faceValue to 15: ");
        System.out.println("faceValue : " + die.getFaceValue());
        System.out.println("maxValue : " + die.getMaxValue());

        die.roll();
        System.out.println("\nThe faceValue of die after a roll: " + die.toString());
    }
}
