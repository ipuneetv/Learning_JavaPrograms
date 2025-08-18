package Fun;

public class Song_10_Green_Bottles {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if (bottlesNum ==1) {
                word = "bottle";// singular, as in One Bottle
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And If One green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum >0) {
                System.out.println("There will be " + bottlesNum + " green " + word + ", hanging on the wall");
                System.out.println("==========================================");
            }
            else {
                System.out.println("There will be no green bottles, hanging on the wall");

            }
        }
    }
}
