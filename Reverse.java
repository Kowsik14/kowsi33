import java.io.*;
import java.net.*;
import java.util.*;
public class Reverse
{
public static void main(String args[])
{
int num,rev=0,rem;
Scanner s=new Scanner(System.in);
num=s.nextInt();
while(num!=0)
{
rem=num%10;
rev=(rev*10)+rem;
num/=10;
}
System.out.println(""+rev);
}}
