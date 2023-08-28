public class project8 {

    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50};
        int max=numbers[4];
        int min=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
                if (numbers[i]<min){
                    min=numbers[i];
                    System.out.println("Maximum number is "+max);
                    System.out.println("Minimum numner is "+min);


                }
            }

        }
    }
    }

