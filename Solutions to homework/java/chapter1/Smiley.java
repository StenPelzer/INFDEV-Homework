package chapter1;

public class Smiley {
    public static void main(String[] args) {
        int size  = 10;
        String result = "";
        int diameter = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = diameter - i;
                int y = diameter - j;

                if(Math.round(Math.sqrt(x*x + y*y)) == diameter){
                    result += "*";
                }

                //TODO not finished yet

            }
        }
    }

}
