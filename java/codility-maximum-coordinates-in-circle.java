import java.util.ArrayList;

public class Main {

    static class Solution {
        public int solution(String S, int[] X, int[] Y) {
            ArrayList<Coordinates> list = new ArrayList<>();
            double maxDist = Double.MAX_VALUE;

            for (int i = 0; i < S.length(); i++) {
                Coordinates coord = new Coordinates(S.charAt(i), X[i], Y[i]);
                if (coord.dist >= maxDist) {
                    continue;
                }
                // Check if circle contains letter
                Coordinates exists = list.stream().filter(coor -> coor.c == coord.c).findFirst().orElse(null);
                if (exists != null) {
                    // check who is closer to the center
                    if (coord.dist >= exists.dist) {
                        // remove all other coordinates farther than this
                        list.removeIf(obj -> obj.dist >= coord.dist);
                        maxDist = coord.dist;
                    } else {
                        maxDist = exists.dist;
                        list.removeIf(obj -> obj.dist >= exists.dist);
                        list.add(coord);
                    }
                } else {
                    list.add(coord);
                }

            }

            return list.size();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] y = { 1, -1, 2, 2 };
        int[] x = { 1, -1, -2, -2 };
        System.out.println(sol.solution("CCDD", x, y));
    }

    public static double distanceFromCenter(int x, int y) {
        return Math.sqrt((x * x) + (y * y));
    }

    static class Coordinates {
        int x;
        int y;
        char c;
        double dist;

        Coordinates(char c, int x, int y) {
            this.c = c;
            this.x = x;
            this.y = y;
            this.dist = distanceFromCenter(x, y);
        }
    }
}
