/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//to concatenate two string
//"java program"
package com.mycompany.sample3.java;

import java.util.Scanner;
public class Sample3Java {

    public static void main(String[] args) {
         String a, b;
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter the first string:");
    a=Scan.nextLine();
    System.out.println("Enter the second string:");
    b=Scan.nextLine();
    
    a=a.concat(b);
    System.out.println("\n first string after concatenation:"+a);
}
}
//to find largest and smallest from an array    
package com.mycompany.sample3.java;

import java.util.Scanner;
public class Sample3Java {

    public static void main(String[] args) {
         int count, max, min, i;
        int[] inputArray = new int[500];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = in.nextInt();
        System.out.println("Enter " + count + "elements");
         
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
   
        max = min = inputArray[0];
         
        for(i = 1; i < count; i++) {
            if(inputArray[i] > max)
                max = inputArray[i];
            else if (inputArray[i] < min)
                min = inputArray[i];
                
        }
        
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }
}
//number system
package com.mycompany.sample3.java;

import java.util.Scanner;
public class Sample3Java {

    public static void main(String[] args) {

Scanner obj=new Scanner(System.in);
System.out.println("enter size n:");
int n=obj.nextInt();
int i, j;
for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print(j);
    }
   System.out.println();
}
    }
}
/* enter size n:
6
1
12
123
1234
12345
123456
*/
//to greet message according to mark
package com.mycompany.sample3.java;

import java.util.Scanner;
public class Sample3Java {

    public static void main(String[] args) {

{
 Scanner obj=new Scanner(System.in);
 String name=obj.next();
 System.out.println("name:"+name);
 int rollno=obj.nextInt();
 System.out.println("rollno:"+rollno);
 int totalmark=obj.nextInt();
 System.out.println("totalmarks:"+totalmark);
    if(totalmark>90 && totalmark<100)
    {
        System.out.println("congratulation you are pass with o grade");
    }
    else if(totalmark>90 && totalmark<80)
    {
        System.out.println("you are pass with A grade");
    }
    else if(totalmark>80 && totalmark<70)
    {
        System.out.println(" you are pass with B grade");
    }
    else if(totalmark>70 && totalmark<60)
    {
        System.out.println(" you are pass with C grade");
    }
    else if(totalmark>60 && totalmark<50)
    {
        System.out.println(" you are pass with D grade");
    }
     else  
    {
        System.out.println(" you are fail");
    }
    }    
}
}
//to find the greatest number using command line argument
package com.mycompany.sample3.java;

import java.util.Scanner;
public class Sample3Java {

    public static void main(String[] args) {

Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
System.out.println("first value:"+a);
int b=obj.nextInt();
System.out.println("second value:"+b);
if(a>b)
{
    System.out.println("a is greater than b");
}
else
{
    System.out.println("b is greater than a");
}
    }
}



