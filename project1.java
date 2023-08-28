public class project1 {

    public static void main(String[] args) {

        int[] Temperatures = {75, 85, 90, 95};
        int tempHigh = Temperatures[3];
        int tempLow = Temperatures[0];
        for (int i = 0; i < Temperatures.length; i++) {

            if (Temperatures[i] > tempHigh) {
                tempHigh = Temperatures[i];

                if (Temperatures[i] < tempLow) {
                    tempLow = Temperatures[i];
                    System.out.println("The temp high of the week is " + tempHigh);
                    System.out.println("The temp low of the week is " + tempHigh);

                }
            }
        }
    }
}


