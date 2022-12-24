package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private boolean isValidTriangle(double firstSide, double secondSide, double thirdSide) {
        return firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide
            && secondSide + thirdSide > firstSide;
    }
}