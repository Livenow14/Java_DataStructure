package section3_static.class1;

public class Term3 {
    private int coef;
    private int exp;
    public Term3(int c, int e)
    {
        setCoef(c);
        setExp(e);
    }

    public int calcTerm( int x) {
        return (int)(getCoef() * Math.pow(x, getExp()));
    }
    public void printTerm() {
        System.out.print(getCoef() + "x^"+ getExp());
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
