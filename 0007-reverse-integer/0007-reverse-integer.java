class Solution
{
    public int reverse(int x)
    {
        int sign = 1;

        if(x < 0)
        {
            sign = -1;
            x = -x;
        }

        long revnum = 0;

        while(x > 0)
        {
            int lastdigit = x % 10;

            revnum = (revnum * 10) + lastdigit;

            x = x / 10;
        }

        revnum = sign * revnum;

        if(revnum > Integer.MAX_VALUE || revnum < Integer.MIN_VALUE)
        {
            return 0;
        }

        return (int)revnum;
    }
}