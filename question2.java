public class question2 {
    public static void main(String[] args) {
        // Unlabeled break
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Unlabeled break: Breaking out of inner loop");
                    break;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Labeled break
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Labeled break: Breaking out of both loops");
                    break outerLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
