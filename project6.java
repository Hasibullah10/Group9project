public class project6 {

    public static void main(String[] args) {
        int number = 15;
        boolean condition = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                condition = true;
                break;
            }
        }if(!condition){
            System.out.println(number+"is a prime number.");
            System.out.println(number+"is not a prime number.");
        }

    }
}


