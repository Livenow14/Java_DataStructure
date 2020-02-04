package section2_method.class3;

import section2_method.class2.MyPoint2;

public class OrthoLine {
    public MyPoint3 u;
    public MyPoint3 v;

    public OrthoLine(MyPoint3 p1, MyPoint3 p2){
        u=p1;
        v= p2;
        if(p1.x>p2.x|| p1.x==p2.x && p1.y>p2.y) {         //p1이 p2보다 더 오른쪽에있다면 스왑
            swap();
        }
    }
    public void swap(){             //u가 위쪽, 왼쪽에 무조건 자리잡게 한다.
        MyPoint3 tmp =u;
        u=v;
        v= tmp;
    }
    public OrthoLine(int x1, int y1, int x2, int y2){
        u = new MyPoint3(x1, y1);
        v = new MyPoint3(x2, y2);
    }
    public boolean isVertical(){    //수직선분인지 확인
        return ( u.x==v.x );
    }

    public boolean intersects(OrthoLine other){     //다론 선분과 교차하는지 확인

        if(isVertical() && !other.isVertical())
            return(other.u.x < u.x && other.v.x> u.x && u.y<other.u.y && v.y> other.u.y);
        else if(!isVertical() && other.isVertical())
            return(other.u.y< u.y && other.v.y > u.y && u.x<other.u.x&& v.x>other.u.x);
        else
            return false;

    }


}
