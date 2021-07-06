import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
/**
 * Friday the 13.
 *
 * @author  
 * @version (a version number or a date)
 */
public class NumberTheoryProblems
{
    /*
     *    returns the prime factorization of m
     */
    public ArrayList<PrimeFactor> getPrimeFactorization(int m)
    {
        ArrayList<PrimeFactor> lpf = new ArrayList<PrimeFactor>();
        int cnt = 0;
        for ( int x = 2; x <= m; x++)
        {
            while( m%x == 0 )
            {
                m = m/x;
                cnt++;
            }
            if( cnt!= 0)
            {
                lpf.add(new PrimeFactor(x, cnt));
            }
            cnt = 0;
        }

        return lpf;
    }

    public int get_GCD(int m, int n)
    {
        if (m == 0)
            return n;

        while (n != 0) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }

        return m;
    }

    public int get_LCM(int m, int n)
    {
        return m * (n / get_GCD(m, n));
    }
    public String toBinary(int n)
    {
        return Integer.toBinaryString(n);
    }

    public String toHexadecimal(int n)
    {
      String temp = Integer.toHexString(n);
      String t = "";
      for( int x = 0; x < temp.length(); x++)
      {
         if (Character.isLetter(temp.charAt(x)))
         {
            t = t + Character.toUpperCase(temp.charAt(x));
         }
         else
         {
            t = t + temp.charAt(x);    
         }
      }
      return t;
    }

    public String hexadecimalToBinary(String hex)
    {
       return new BigInteger(hex, 16).toString(2);  
       
    }

    public int binaryToDecimal(String bin)
    {
        return Integer.parseInt(bin, 2);
    }

    public int hexadecimalToDecimal(String hex)
    {
        return Integer.parseInt(hex, 16);
    }

    //   no leading zero's allowed
    public String binaryToHexadecimal(String bin)
    {
         return new BigInteger(bin, 2).toString(16).toUpperCase(); 
//       int binInt = binaryToDecimal(bin);
//       String str =  toHexadecimal(binInt);
//       while ( str.charAt(0) == '0')
//       {
//          str = str.substring(1);    
//       }
//       return str;
    }

    public int page246_algorithm_5_2_19(int base, int exp, int mod)
    {
        int result = 1;
        int x = base%mod;
        while (exp > 0)
        {
            if ( exp%2 == 1)
            {
                result = (result*x)%mod;
            }
            x = (x*x)%mod;
            exp = (int) Math.floor(exp/2);
        }

        return result;
    }
}