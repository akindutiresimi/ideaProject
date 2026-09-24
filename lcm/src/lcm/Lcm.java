package lcm;

public class Lcm {
    public static int numbers(int[] number) {

        int count = 1;
        for(count = 1; count <= 9; count++){

            for(int index= 0; index < number.length; index++){

                if(number[index] % count == 0){
                    count *= count;
                }

            }
        }
        return count;
    }
}
