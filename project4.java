public class project4 {

    public static void main(String[] args) {
        int[][]numbers={
                {5,10,15,20},
                {5,10,15,20},
                {5,10,15,20},
                {5,10,15,20},
        };
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);

                }if(numbers[i][j]%2!=0){
                    System.out.println(numbers[i][j]);

                }
                }

            }

        }

    }



