package section2_method.class3;

public class OrthorPolygon {    //직교 다각형 확인
    public int n;
    public MyPoint3 [] vertices;        //꼭지점을 배열에 저장

    public OrthorPolygon(int k ){       //다각형을 결정하는 꼭지점의 갯수만 체크
        n=0;                //실제로 입력된 꼭지점의 갯수를확인
        vertices = new MyPoint3[k];
    }

    public void addVertex(int x, int y){
        vertices[n++]= new MyPoint3(x,y); // 꼭지점을 추가
    }

    public int maxX(){
        int max= vertices[0].x;
        for(int i=0; i<n; i++){
            if(vertices[i].x>max)
                max=vertices[i].x;
        }
        return max;
    }


    public boolean contains(MyPoint3 p){    //다각형이 외부인지 내부인지 확인함.
        OrthoLine arrow = new OrthoLine(p, new MyPoint3(maxX()+1 , p.y ));
        int count =0;
        for(int i=0; i<n; i++){
            OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1) % n] );
                    if(arrow .intersects(edge))
                        count++;
        }
        return (count %2 ==1);      //홀수이면 포함으로 치기떄문에

    }
}
