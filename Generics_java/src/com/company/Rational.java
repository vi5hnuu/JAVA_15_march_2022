package com.company;

public class Rational extends Number implements Comparable<Rational>{
    private long numerator=0;
    private long deniminator=1;

    public Rational(){
        this(0,1);
    }
    public Rational(long numerator,long deniminator){
        long gcd=gcd(numerator,deniminator);
        this.numerator=(deniminator>0?1:-1)*numerator/gcd;
        this.deniminator=Math.abs(deniminator)/gcd;
    }
    private static long gcd(long n,long d){
        long n1=Math.abs(n);
        long n2=Math.abs(d);
        long smaller=n1>n2?n2:n1;
        int gcd=1;
        for(long k=smaller;k>=1;k--)
            if(n1%k==0 && n2%k==0)
                return k;
    return gcd;
    }
    public long getNumerator(){
        return numerator;
    }
    public long getDeniminator(){
        return deniminator;
    }
    public Rational add(Rational secondvalue){
        long n=numerator*secondvalue.getDeniminator()+deniminator*secondvalue.getNumerator();
        long d=deniminator*secondvalue.getDeniminator();
        return new Rational(n,d);
    }
    public Rational subtract(Rational secondRational){
        long n=numerator*secondRational.deniminator-deniminator*secondRational.numerator;
        long d=deniminator*secondRational.deniminator;
        return new Rational(n,d);
    }
    public Rational multiply(Rational secondRational){
        long n=numerator*secondRational.numerator;
        long d=deniminator*secondRational.deniminator;
        return new Rational(n,d);
    }
    public Rational divide(Rational secondRational){
        long n=numerator*secondRational.deniminator;
        long d=deniminator*secondRational.numerator;
        return new Rational(n,d);
    }

    @Override // Override the equals method in the Object class
 public boolean equals(Object other) {
        if ((this.subtract((Rational) (other))).getNumerator() == 0)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        return numerator+"/"+deniminator;
    }

         @Override // Implement the abstract intValue method in Number
 public int intValue() {
         return (int)doubleValue();
         }

         @Override // Implement the abstract floatValue method in Number
 public float floatValue() {
         return (float)doubleValue();
         }

         @Override // Implement the doubleValue method in Number
 public double doubleValue() {
         return numerator * 1.0/deniminator;
         }

         @Override // Implement the abstract longValue method in Number
 public long longValue() {
         return (long)doubleValue();
         }

         @Override // Implement the compareTo method in Comparable
 public int compareTo(Rational o) {
         if (this.subtract(o).getNumerator() > 0)
             return 1;
         else if (this.subtract(o).getNumerator() < 0)
             return -1;
         else
         return 0;
         }
}
