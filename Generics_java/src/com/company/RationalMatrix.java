package com.company;

class RationalMatrix extends GenericMatrix<Rational>{
    protected Rational multiply(Rational r1,Rational r2){
        return r1.multiply(r2);
    }
    @Override
    protected Rational add(Rational r1,Rational r2){
        return r1.add(r2);
    }
    @Override
    protected Rational Zero(){
        return new Rational(0,1);
    }

}