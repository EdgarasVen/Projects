public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int n=size;
        for (int i = 1; i <= size; i++) {
            printWhitespaces(n);
            printStars(i);
            n--;
            //System.out.println();

        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int space=height-1;
        int star=1;
        while ( space>=0 ){
            printWhitespaces(space);
            printStars(star);
            space--;
            star+=2;
            //System.out.println();
        }

        space=height-2;
        star=3;
        for (int i = 0; i < 2; i++) {
            printWhitespaces(space);
            printStars(star);
            //System.out.println();
        }
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
