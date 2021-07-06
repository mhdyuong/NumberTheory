
/**
 * Write a description of class PrimeFactor here.
 * 
 * @author Mr. Allen
 * @version (a version number or a date)
 */
public class PrimeFactor
{
    private int value;
    private int exponent;

    /**
     * Constructor for objects of class PrimeFactor
     */
    public PrimeFactor(int v, int exp)
    {
       value = v;
       exponent = exp;
    }

    public int getExponent()
    {
       return exponent;
    }

    public int getValue()
    {
       return value;
    }

    public int hashCode()
    {
     return new Integer(value).hashCode() + new Integer(exponent).hashCode();
    }

    public boolean equals(Object obj)
    {
       PrimeFactor p = (PrimeFactor) obj;
       return p.getExponent() == this.getExponent() && p.getValue() == this.getValue();
    }

    /*
     *   This method is not tested
     */
    public String toString()
    {
       return "*---*";
    }
}