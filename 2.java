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
obj.display(a,b);


}
}
class Area{
  int real,img;
  public void display(int a,int b)
  {
real=a;
img=b;
System.out.println(real+"+"+img+"i");
  }
  
}


