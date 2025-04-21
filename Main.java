import java.util.*;
class Value{
int age=19;
void change_age(int age)
{
age=age+10;
System.out.println("age is"+age);
}}
public class Main{
public static void main(String args[])
{
Value b=new Value();
System.out.println("before age is"+b.age);
b.change_age(10);
System.out.println("after age is"+b.age);
}
}
