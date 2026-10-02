public class TwoDpart_2 {

        public static void main(String[] args) {
            int[][] marks = {
                    {85, 90, 78},
                    {88, 76, 95},
                    {92, 89, 84}
            };

            for (int i = 0; i < marks.length; i++) {
                int total = 0;

                for (int j = 0; j < marks[i].length; j++) {
                    System.out.print(marks[i][j] + " ");
                    total += marks[i][j];
                }

                System.out.println(" = Total: " + total);
            }
        }
    }


