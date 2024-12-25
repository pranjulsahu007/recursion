public class num0
{
    public static void main(String args[])
    {
        int k = noof0(1020);
        System.out.println(k);
    }
    static int noof0(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int k =0;
        k=n%10;
        if(k==0)
        {
            return 1+noof0(n/10);
        }
        else
        {
            return noof0(n/10);
        }

    }
}

/*package com.kunal.easy;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(30210004));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
} */

//really smart way to solve this problem



