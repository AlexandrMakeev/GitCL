public class MaxNumberService {
    public int max(int a, int b) {
        int maxNumber;
        if (a > b) {
            maxNumber = a;
        } else {
            maxNumber = b;
        }
        return maxNumber;
    }
}
