import java.util.Scanner;

public class tut1 {
    public static void bubble(int[] a)
    {
        int i,j,t;
        int n = a.length;
        for(i=n-2;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }//end function.

    public static void main(String[] args)
    {
        int n,i;

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n Enter number of Integer elements to be sorted: ");
        n  = input.nextInt();
        int[] a =  new int[n];

        for( i=0;i<=n-1;i++)
        {
            System.out.println("\n\n Enter integer value for element no."+ ( i + 1) +" : ");
            a[i] =  input.nextInt();
        }

        bubble(a);

        System.out.println("\n\n Finally sorted array is: ");
        for( i=0;i<=n-1;i++)
            System.out.println(a[i]);
    } //e
}
