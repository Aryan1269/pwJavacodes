package Unique_topics;
class varargs {
    // use vargs in last
    static int[] vargsSum(int... A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        return A;
    }

    public static void main(String[] args) {

        int a[] = { 12, 4 };
        int b[] = { 1, 3, 4 };
        int c[] = { 123, 4, 3, 4, 5 };

        int result[] = vargsSum(a);
        for (int i : result) {

            System.out.println(i);
        }

    }
}
