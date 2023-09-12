public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int result = 0;
        while (start != 0){
            boolean divideby2 = start % 2 == 0;
            if (divideby2) {
                start = start / 2;
            }
            else {
                start = start - 1;
            }
            result++;
        }
        System.out.println(result);
    }
}
