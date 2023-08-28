public class project5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("The value of a before swapping is " + a);
        System.out.println("The value of a before swapping is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a after swapping is " + a);
        System.out.println("The value of b after swapping is " + b);

    }
}



