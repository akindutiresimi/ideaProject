import java.util.Arrays;

public class SquareArray {

    public static int[] solution(int[] numbers) {

        int[] result = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < -100 || numbers[index] > 1000){
                throw new IllegalArgumentException("Enter numbers between -100 and 1000");
            }
            result[index] = numbers[index] * numbers[index];
        }

        for (int first = 0; first < result.length - 1; first++) {
            for (int second = 0; second < result.length - 1 - first; second++) {

                if (result[second] > result[second+ 1]) {
                    int temp = result[second];
                    result[second] = result[second + 1];
                    result[second + 1] = temp;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(new int[] {3, 5, 2, 6})));
    }
}
