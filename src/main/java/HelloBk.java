public class HelloBk {

    public static void main(String[] args) {
        String name = "Bruno";

        System.out.println(name);

         HelloBk rand = new HelloBk();
         rand.printNumbers();

    }


    public void printNumbers() {

        for (int i = 0; i <= 3; i ++) {

            for (int k=1; k <= i; k++) {
                System.out.println(i);
            }

        }


    }

}
