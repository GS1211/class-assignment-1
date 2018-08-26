import java.util.*;
 class Main
{
public static void main(String[] x)
{
  Scanner z=new Scanner(System.in);
  
int i,n,c=0;
int j=0;
System.out.println("input n");
n=z.nextInt();

int a[]=new int[n];
System.out.println("input a[i]");
for(i=0;i<n;i++)
{
  a[i]=z.nextInt();
  
}
for(i=0;i<n;i++)
{
  if(c<a[i])
  {j=c;
    c=a[i];
    
  }
  else if(j<a[i] && a[i]<c)
  {
    j=a[i];
  }

}
System.out.println("second largest no is = "+j);
}
}


