public class VariablesQuestions{

    public static void main(String[] args) {

        //question1();
        //question2();
        //question3();
        //question4();
        //question5();
        question6();





       
        }

        static void question1(){
              String name = "sudarshan";
        int age = 20;

        System.out.println("My age is "+ age);
        }

        static void question2(){

        String name = "Sudarshan";
        int age = 20;
        double marks = 85.5;
        char grade = 'A';
        boolean passed = true;
        
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Marks:" +marks);
        System.out.println("Passed:" +passed);
        System.out.println("Grade:" +grade);


        }

        static void question3(){
            //swap a and b values

        

    int a = 10;
    int b = 20;

    int temp = 10;
    a=b;
    b = temp;

    System.out.println("a: " + a);
    System.out.println("b: " + b);

        }

// Q4: Swap the values of three variables.
//
// Given:
// a = 15
// b = 25
// c = 35
//
// Change them to:
// a = 25
// b = 35
// c = 15
//
// Use variables to solve the problem.

static void question4() {

    int a = 15;
    int b = 25;
    int c = 35;

    int temp = a;
    a = b;
    b = c;
    c = temp;
    
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
}

// Q5: Calculate the total and average of three numbers.
//
// Given:
// a = 10
// b = 20
// c = 30
//
// Find:
// total
// average

static void question5() {

    int a = 10;
    int b = 20;
    int c = 30;

    int total = a + b + c;
    double average = total / 3.0;

    
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);
}

// Q6: Calculate the area of a rectangle.
//
// Given:
// length = 10
// width = 5
//
// Find:
// area

static void question6() {

    int length = 10;
    int width = 5;

    int area = length * width; 


    System.out.println("Area: " + area);
}



}