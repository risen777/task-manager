package ru.shumov.tm;

public class CalcService {
    public Integer sum(Integer a, Integer b)
    {

        if (a== null || b ==null)
            return  null;
        else {
        return  a+b;

    }}


public  boolean isPositive(Integer a ){
        return  a >0;

}

}
