package section3_static.class1;

public class Polynomial3 {
    public char name;
    public Term3[] terms;
    public int nTerms = 0;

    public Polynomial3(){
        nTerms =0;
        terms = new Term3[100];
    }

    public Polynomial3(char name) {
        this.name= name;
        nTerms=0;
        terms= new Term3[100];
    }

        public void addTerm(int c, int e) {
        int index = findTerm(e);
        if(index !=-1 ){
            terms[index].setCoef(terms[index].getCoef() + c);    // -5x^3 + 5x^3 이면 배열이 사라짐
        }
        else{
            int i=nTerms-1;
            while (i >=0 && terms[i].getExp() < e){
                terms[i+i]=terms[i];
                i--;
            }
            terms[i+1]= new Term3(c,e);
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
        for (int i = 0; i < nTerms && terms[i].getExp() >= e; i++)
            if (terms[i].getExp() == e)
                return i;
        return -1;

    }
}
//= new Term[1000]