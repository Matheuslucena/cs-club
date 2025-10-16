package Programs.src.chapterFive;

import java.util.Random;

public class Die {
    private int faceValue;
    private int maxValue;
    private Random random;

    Die() {
        this.maxValue = 6;
        this.setFaceValue(1);
        random = new Random();
    }

    Die(int faceValue, int maxValue) {
        this.faceValue = faceValue;
        this.maxValue = maxValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >= 1 && faceValue <= maxValue) {
            this.faceValue = faceValue;
        }
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public void roll() {
        this.setFaceValue(random.nextInt(maxValue) + 1);
    }

    public String toString() {
        return "" + this.faceValue;
    }
}
