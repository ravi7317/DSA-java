

//package class A
/*package accessModifiers1;
//private class pc Classes cannot be private
//{
//
//}
 public class A {

  int x =10; //default or package private
    private int y= 15;
public int z=20; 
protected int w = 25;

public static void main(String[] args) {

A obj =new A(); 
System.out.println(obj.x);
System.out.println(obj.y); 
System.out.println(obj.z);
System.out.println(obj.w);
}
}
*/




//package class c
/*package accessModifiers2;
import accessModifiers1.A;
public class D extends A{
public static void main(String[] args) {
A obj = B new C();
C childobj = new C();
System.out.println(obj.x); //default is not accessible outside the package
System.out.println(childObj.x); // NOT VISIBLE
System.out.println(obj.y); //private not accessible outside the class.
System.out.println(childobj.y); / NOT VISIBLE
System.out.println(obj.z); //public is accessible everywhere the object is available System.out.println(childobj.w); //protected will be visible in different package in subclass, using ob
System.out.println(childobj.w);//protected will be visible in different package in subclass using object
*/



//package class d
/*package accessModifiers2;
import accessModifiers1.A;
public class D {
public static void main(String[] args) {
A obj = new A();
//System.out.println(obj.x); //default is not accessible outside the package
// System.out.println(obj.y); //private not accessible outside the class
System.out.println(obj.z); //public is accessible everywhere the object is available
//System.out.println(obi w):protecte will not be accessible outside package in non-subclass
}
}*/


//package class B
/*package accessModifiers1;
public class B {
 public static void main(String[] args) {
A obj= new A();
System.out.println(obj.x); //default is accessible in same package System.out.println(ohj.y); //private not accessible outside the class System.out.println(obj.z); //public is accessible everywhere the object is available.
//System.out.println(obj.y);
System.out.println(obj.z);
System.out.println(obj.w);
 }
}*/


//Encapsulation Method
/*package encapsulation;
class Demo{
       private int a = 5;
       private int b =18;
       private int c = 15;
       private int d=20;

public int getA() //getter
{

      System.out.println("Value of A read");
           return this.a;
}

          public int getB()
{
         System.out.println("Value of B read");

           return this.b;
         }

          public void setA(int a)
          {

          if(a>100)
{

       this.a = a;
         System.out.println("Value of A changed to: "+a);
} 
        else {
       System.out.println("Cannot set value outside limits");
     }
    }
    public void setB(int b)
{
this.b = b;
}

       public class EncapStudy {

         public static void main(String[] args){
// TODO Auto-generated method stub
Demo d= new Demo();
System.out.println(d.a); //not visible because private
System.out.println(d.getA());
d.setA(100);
System.out.println(d.getA());
         }
        }
    }   */
