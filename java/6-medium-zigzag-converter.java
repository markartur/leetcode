class Solution {
    public static String convert(String s, int numRows) {

        char[][] matrix = new char[numRows][s.length()];
        char[] arr = s.toCharArray();
        int zig = 0;
        int col = 0;
        int increment = 1;
        String result = "";
        for (char c : arr) {
            matrix[zig][col] = c;
            if (zig == 0) {
                increment = 1;
                col++;
            } else if (zig + 1 == numRows) {
                increment = -1;
                col++;
            }

            if (numRows > 1) {
                zig += increment;
            }

        }

        for (int i = 0; i < numRows; i++) {
            for (int x = 0; x < s.length(); x++) {
                if ((int) matrix[i][x] != 0) {
                    result += matrix[i][x];
                }
            }
        }
        return result;
    }
}