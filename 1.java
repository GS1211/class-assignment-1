import java.util.*;
 class Main
{
public static void main(String[] x)
{
  Scanner z=new Scanner(System.in);
  int a,b;
  a=z.nextInt();
  b=z.nextInt();
Area obj=new Area();
obj.get(a,b);
obj.calc();

}
}
class Area{
  int l,y;
  public void get(int a,int b)
  {
l=a;
y=b;
  }
  public void calc()
  {
System.out.println(l*y);
  }
}


