public class Patterns { 
    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner - columns
            for(int j=1; j<=totCols; j++) {
                //cell - (i,j)
                if(i ==1 || i == totRows || j == 1 || j == totCols) {
                    //bondary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramind(int n) {
        //outer
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }


            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();


        }
    }
    public static void main(String args[]) {
        //hollow_rectangle(50, 80);
        inverted_rotated_half_pyramind(80);
    } 
}
