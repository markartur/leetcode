class Solution {
    public String minInteger(String num, int k) {
        char[] arr = num.toCharArray();
        int swaps = k;
        int min, minIndex = 0;
        char curr, nextC;
        outer: for (int i = 0; i < arr.length; i++) {
            min = Character.getNumericValue(arr[i]);
            minIndex = i;
            for (int x = i + 1; x < Math.min((swaps + i + 1), arr.length); x++) {
                if (Character.getNumericValue(arr[x]) < min) {
                    min = Character.getNumericValue(arr[x]);
                    minIndex = x;
                    if (min == 0) {
                        break;
                    }
                }
            }

            for (int x = minIndex; x > i; x--) {
                curr = arr[x];
                nextC = arr[x - 1];
                arr[x - 1] = curr;
                arr[x] = nextC;
                swaps--;
                if (swaps == 0) {
                    break outer;
                }
            }

        }

        return new String(arr);
    }
}