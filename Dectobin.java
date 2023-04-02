import java.util.*;
class Dectobin
{
public static void main(String args[])
{
int index=0,i=1,num;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the decimal number:");
num=sc.nextInt();

while(num>0)
{
a[index]=num%2;
index=index+1;
num=num/2;
}

System.out.println("Binary number is");

for(i=index-1;i>=0;i--)
{
System.out.print(a[i]);
}

}
}