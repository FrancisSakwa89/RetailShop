public class Square {
    public static void main(String args[]) {
        int side=3, i=0, j;
        while(i <= side)
        {
            j = 0;
            while(j <= side)
            {
                System.out.print("* ");

                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
}
