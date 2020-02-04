package section2_method.class1;
public class Polynomial2 {
    public char name;
    public Term2[] terms;
    public int nTerms = 0;

    public void addTerm(int c, int e) {
        int index = findTerm(e);
        if(index !=-1 ){
            terms[index].coef+= c;    // -5x^3 + 5x^3 이면 배열이 사라짐
        }
        else{
            int i=nTerms-1;
            while (i >=0 && terms[i].exp < e){
                terms[i+i]=terms[i];
                i--;
            }
            terms[i+1]= new Term2();
            terms[i+1].coef = c;
            terms[i+1].exp = e;
            nTerms++;
        }
    }

    public int calcPolynomial(int x) {
        int result = 0;
        for (int i = 0; i < nTerms; i++)
            result += terms[i].calcTerm(x);
        return result;
    }

    public void printPolynomial() {
        for (int i = 0; i < nTerms; i++) {
            terms[i].printTerm();
            System.out.print("+");
        }
        System.out.println();
    }

    public int findTerm(int e) {
        for (int i = 0; i < nTerms && terms[i].exp >= e; i++)
            if (terms[i].exp == e)
                return i;
        return -1;

    }
}
//= new Term[1000]