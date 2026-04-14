package bit;

import java.util.Arrays;

public class ImageFlip {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int col = image[0].length - 1;
        for(int[] row: image){
            for (int i = 0; i <= col / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[col-i] ^ 1;
                row[col-i] = temp;
            }
        }
        return image;
    }
}
