import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab2P1 {
    private  static Scanner sc;
    public static void main(String[] args) {
        int choice =0;
        sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        mulTest();
                        /* add mulTest() call */
                        break;
                    case 2: /* add divide() call */
                        divide();
                        break;
                    case 3: /* add modulus() call */
                        modulus();
                        break;
                    case 4: /* add countDigits() call */
                        countDigits();
                        break;
                    case 5: /* add position() call */
                        position();
                        break;
                    case 6: /* add extractOddDigits() call */
                        extractOddDigits();
                        break;
                    case 7: System.out.println("Program terminating ….");
                }
            } catch(InputMismatchException ex) {
                System.out.println("Invalid input.");
                sc.next();
            }
        } while (choice < 7);

    }
    public static void mulTest() {
        System.out.print("Number of questions:");
        int len = sc.nextInt();
        int correctAns = 0, num1, num2, ans;
        for (int i = 0; i < len; ++i) {
            num1 = (int)Math.floor(Math.random() * 12);
            num2 = (int)Math.floor(Math.random() * 12);

            do {
                try {
                    System.out.print("How much is ");
                    System.out.print(num1);
                    System.out.print(" times ");
                    System.out.print(num2);
                    System.out.print("? ");
                    ans = sc.nextInt();
                    if (ans == (num1 * num2)) ++correctAns;
                    break;
                }catch (InputMismatchException ex) {
                    System.out.println("Invalid input.");
                    sc.next();
                }
            }while(true);
        }
        //answers out of 5 are correct.
        System.out.print('\n');
        System.out.print(correctAns);
        System.out.print(" answers out of ");
        System.out.print(len);
        System.out.println(" are correct.");

    }

    public static void divide() {
        System.out.print("Number of division:");

        int lan = sc.nextInt();
        int[] m = new int[lan];
        int[] n = new int[lan];
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") m = ");
            m[i] = sc.nextInt();
            System.out.print(", n = ");
            n[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") ");
            System.out.print(m[i]);
            System.out.print('/');
            System.out.print(n[i]);
            System.out.print(" = ");
            System.out.print(divide(m[i],n[i]));
            System.out.print("; ");

        }
        System.out.println();
    };

    public static long divide(long m, int n) {
        long ans = 0;
        while (m >= n) {
            m -=n;
            ++ans;
        }
        return ans;
    }

    public static void  modulus() {
        System.out.print("Number of modulus:");
        int lan = sc.nextInt();
        int[] m = new int[lan];
        int[] n = new int[lan];
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") m = ");
            m[i] = sc.nextInt();
            System.out.print(", n = ");
            n[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") ");
            System.out.print(m[i]);
            System.out.print('%');
            System.out.print(n[i]);
            System.out.print(" = ");
            System.out.print(modulus(m[i],n[i]));
            System.out.print("; ");

        }
        System.out.println();
    }
    public static long modulus(long m, int n) {
        while (m >= n) {
            m -=n;
        }
        return m;
    }

    public static void countDigits() {
        System.out.print("Number of Digits to count:");
        int lan = sc.nextInt();
        int[] n = new int[lan];
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") n : ");
            n[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") n : ");
            System.out.print(n[i]);
            System.out.print(" - ");
            if (n[i] < 0) {
                System.out.print("Error input!! ");
            } else {
                System.out.print("count = ");
                System.out.print(countDigits(n[i]));
                System.out.print("; ");
            }
        }
        System.out.println();
    }
    public static int countDigits(int n) {
        int ans = 1;
        while (n > 9) {
            n = (int)divide(n, 10);
            ++ans;
        }
        return ans;
    }
    public static void position() {
        System.out.print("Number of Digits position:");
        int lan = sc.nextInt();
        int[] n = new int[lan];
        int[] digit = new int[lan];
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") n : ");
            n[i] = sc.nextInt();
            System.out.print(", digit: ");
            digit[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") position =");

            System.out.print(position(n[i], digit[i]));
            System.out.print("; ");
        }
        System.out.println();
    }
    public static int position(int n, int digit) {
           int ans = 1;
        while (n > 9) {
            if (modulus(n, 10) == digit) return ans;
            ++ans;
            n = (int)divide(n, 10);

        }
        if (n == digit) return ans;
        return -1;

    }
    public static void extractOddDigits() {
        System.out.print("Number of Digits to check:");
        int lan = sc.nextInt();
        long[] n = new long[lan];
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") n : ");
            n[i] = sc.nextLong();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i< lan; ++i) {
            System.out.print('(');
            System.out.print(i + 1);
            System.out.print(") oddDigits = ");
            if (n[i] < 0) {
                System.out.print("Error input!! ");
            } else {
                System.out.print(extractOddDigits(n[i]));
            }
            System.out.print("; ");
        }
    }
    public static long extractOddDigits(long n) {
        long ans = 0;
        int digi;
        int pos = 0;
        while (n > 9) {
            digi = (int)modulus(n, 10);
            if ((digi & 1) == 1) {
                ans += digi * ((long)Math.pow(10, pos++));
            }
            n = divide(n, 10);

        }
        if ((n & 1) == 1)  {
            ans += n * ((long)Math.pow(10, pos));
        }
        return ans == 0 ? -1: ans;
    }

}
