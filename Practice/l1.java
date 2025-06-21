class l1 {
    // public static int[] plusOne(int[] digits) {

    // long num = 0;

    // int j = 0;
    // for (int i = digits.length - 1; i >= 0; i--) {
    // num += digits[i] * Math.pow(10, j);
    // j++;
    // }

    // System.out.println(num);

    // num++;

    // long original_num = num;

    // int k = 0;

    // while (num != 0) {

    // num /= 10;
    // k++;
    // }
    // int arr[];

    // if (k > digits.length) {
    // arr = new int[k];
    // } else {
    // arr = new int[digits.length];
    // }

    // long temp = original_num;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // arr[i] = (int) temp % 10;
    // temp /= 10;
    // }

    // return arr;

    // }

    // Or

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // All digits were 9: result is 1000...0
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }



public static void main(String args[]) {
    int[] digits = { 9, 9 };
    int[] result = plusOne(digits);
    for (int num : result) {
        System.out.print(num + " ");
    }
}
}
