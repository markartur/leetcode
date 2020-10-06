public class Main {

    public static void main(String[] args) {

        System.out.println(getChange(5, 0.99));

    }

    public static int[] getChange(double money, double price) {

        double totalChange = money - price;

        double returnedChange = 0;
        int onedollar = 0;
        int onec = 0;
        int fivec = 0;
        int tenc = 0;
        int twentyfivec = 0;
        int fiftyc = 0;

        while (returnedChange < totalChange) {
            if (returnedChange + 1 <= totalChange) {
                onedollar++;
                returnedChange += 1D;
            } else if (returnedChange + 0.5 <= totalChange) {
                fiftyc++;
                returnedChange += 0.5;
            } else if (returnedChange + 0.25 <= totalChange) {
                twentyfivec++;
                returnedChange += 0.25;
            } else if (returnedChange + 0.10 <= totalChange) {
                tenc++;
                returnedChange += 0.10;
            } else if (returnedChange + 0.05 <= totalChange) {
                fivec++;
                returnedChange += 0.05;
            } else if (returnedChange + 0.01 <= totalChange) {
                onec++;
                returnedChange += 0.01;
            }
        }

        return new int[] { onec, fivec, tenc, twentyfivec, fiftyc, onedollar };

    }
}