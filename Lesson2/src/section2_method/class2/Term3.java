package section2_method.class2;

import section1_class.Term;

public class Term3 {
    public int coef;
    public int exp;
    public Term3(int c, int e)
    {
        coef=c;
        exp=e;
    }

    public int calcTerm( int x) {
        return (int)(coef * Math.pow(x, exp));
    }
    public void printTerm() {
        System.out.print(coef + "x^"+ exp);
    }
}
