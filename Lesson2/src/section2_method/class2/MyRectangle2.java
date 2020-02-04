package section2_method.class2;

public class MyRectangle2 {
    public MyPoint2 lu;
    public MyPoint2 r1;     //이것으로도 할 수 있다.

    public int width;
    public int height;

    public MyRectangle2(int x, int y, int w, int h){
        lu =new MyPoint2(x,y);
        width=w;
        height =h;
    }
    public int calc( )
    {
        return width* height;
    }

    public String toString(){
      return "("+ lu.x +", "+lu.y +")"+" "+width +" "+height +" " ;


    }

}
