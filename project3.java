public class project3 {

    public static void main(String[] args) {
        int[][]numbers={
                {10,20,30},
                {10,20,30},
                {10,20,30},
        };
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                sum=sum+numbers[i][j];



            }
        }System.out.println(sum);

    }


}
