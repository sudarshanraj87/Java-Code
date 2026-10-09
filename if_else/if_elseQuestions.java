public class if_elseQuestions {

    public static void main(String[] args) {

        //question1();
        //question2();
        //question3();
        //question4();
        //question5();
        //question6();
        //question7();
        //question8();
        //question9();
        //question10();
        //question11();
        //question12();
        //question13();
        //question14();
        //question15();
        //question16();
        question17();
    
    }


// Q1: Find the bigger number.
//
// Given:
// a = 25
// b = 40
//
// Find which number is bigger.

static void question1() {

    int a = 25;
    int b = 40;

    if(a>b){
    System.out.println("Bigger number:"  + a);
    }
    else {
    System.out.println("Bigger number:" + b);
    }

}
// Q2: Check whether a number is even or odd.
//
// Given:
// number = 25
//
// Task:
// Print "Even" if the number is even.
// Otherwise print "Odd".

static void question2() {

    int a = 25;

    if(a % 2 == 0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }

}

// Q3: Find the grade based on marks.
//
// Given:
// marks = 82
//
// Rules:
// 90 or above → A
// 75 or above → B
// 50 or above → C
// Below 50 → Fail
//
// Print the grade.

static void question3() {

    int marks = 82;

    if( marks >= 90){
        System.out.println("A");
    }
    else if( marks >= 75){
        System.out.println("B");
    }
    else if( marks >= 50){
        System.out.println("C");
    }
    else{
        System.out.println("Fail");
    }

}
// Q4: Check whether a number is positive, negative, or zero.
//
// Given:
// number = -8
//
// Print:
// Positive
// Negative
// Zero

static void question4() {

    int number = -8;

    if(number > 0){
        System.out.println("Positive");

    } 
    else if(number < 0 ){
        System.out.println("Negative");
    }
    else{
        System.out.println("Zero");
    }

}
// Q5: Check whether a number is divisible by 5.
//
// Given:
// number = 25
//
// Print:
// Divisible by 5
// or
// Not divisible by 5

static void question5() {

    int number = 25;

    if (number % 5 == 0){
        System.out.println("Divisible by 5");
     
    }
    else{
        System.out.println("Not divisible by 5");
    }

}
// Q6: Check whether a number is between 10 and 20.
//
// Given:
// number = 15
//
// Print:
// Between
// or
// Not Between

static void question6() {

    int number = 15;

    if(number >= 10 && number <=20){
        System.out.println("Between");
    }
    else{
        System.out.println("Not Between");
    }

}
// Q7: Check whether a person can enter.
//
// Given:
// age = 20
//
// Rule:
// Age should be 18 or more AND 60 or less.
//
// Print:
// Allowed
// or
// Not Allowed

static void question7() {

    int age = 20;

    if(age >= 18 && age <= 60){
        System.out.println("Allowed");
    }
    else{
        System.out.println("Not Allowed");
    }

}
// Q8: Check whether a person gets a discount.
//
// Given:
// age = 65
//
// Rule:
// Person gets discount if age is 60 or above
// OR age is 18 or below.
//
// Print:
// Discount
// or
// No Discount

static void question8() {

    int age = 65;

    if(age <= 18 || age >=60){
        System.out.println("Discount");
    }
    else{
        System.out.println("No Diiscount");
    }

}
// Q9: Check whether a person is NOT a student.
//
// Given:
// isStudent = false
//
// Print:
// Not a student
// or
// Student

static void question9() {

    boolean isStudent = false;

    if(!isStudent){
        System.out.println("Not a Student");
    }
    else{
        System.out.println("Student");
    }

}
// Q10: Check whether a number is positive and even.
//
// Given:
// number = 24
//
// Print:
// Positive Even
// or
// Not Positive Even

static void question10() {

    int number = 24;

    if(number > 0 && number % 2 == 0){
        System.out.println("Positive Even");
    }
    else{
        System.out.println("Not Positive Even");
    }

}
// Q11: Check whether a person can enter.
//
// Given:
// age = 20
// hasId = true
//
// Rules:
// First check age.
// If age is 18 or above, then check ID.
// If both are valid → Allowed
//
// Otherwise → Not Allowed

static void question11() {

    int age = 20;
    boolean hasId = true;

    if(age >= 18){
        if(hasId == true){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not Allowed");
        }
    }
    else{
        System.out.println("Not Allowed");
    }

}
// Q12: Check whether a person can vote.
//
// Given:
// age = 20
// isCitizen = true
//
// Rules:
// First check age.
// If age is 18 or above, then check citizenship.
// If both are valid → Can Vote
// Otherwise → Cannot Vote

static void question12() {

    int age = 20;
    boolean isCitizen = true;

    if(age >= 18){
        if(isCitizen == true){
            System.out.println("Can Vote");
        }
        else{
            System.out.println("Cannot Vote");
        }
    }
    else{
        System.out.println("Cannot Vote");
    }

}
// Q13: Check whether a student can give the exam.
//
// Given:
// attendance = 80
// hasAdmitCard = true
//
// Rules:
// First check attendance.
// If attendance is 75 or above, then check admit card.
// If both are valid → Can Give Exam
// Otherwise → Cannot Give Exam

static void question13() {

    int attendance = 80;
    boolean hasAdmitCard = true;

    if(attendance >= 75){
        if(hasAdmitCard){
        System.out.println("Can give exam");
        }
        else{
            System.out.println("Cannot give exam");
        }
    }
    else{
        System.out.println("Cannot give exam");
    }

}
// Q14: Check whether a student passed the exam.
//
// Given:
// marks = 72
// attendance = 80
//
// Rules:
// First check attendance.
// If attendance is 75 or above, check marks.
// If marks are 40 or above → Passed
// Otherwise → Failed
//
// If attendance is below 75 → Not Eligible

static void question14() {

    int marks = 72;
    int attendance = 80;

    if(attendance >= 75){
        if(marks >= 40){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
    else{
        System.out.println("Not Eligible");
    }

}
// Q15: Check whether a student gets a scholarship.
//
// Given:
// marks = 85
// attendance = 90
//
// Rules:
// First check marks.
// If marks are 80 or above, check attendance.
// If attendance is 75 or above → Scholarship
// Otherwise → No Scholarship
//
// If marks are below 80 → No Scholarship.

static void question15() {

    int marks = 95;
    int attendance = 40;

    if(marks >= 80){
        if(attendance >= 75){
            System.out.println("Scholarship");
        }
        else{
            System.out.println("No Scholarship");
        }
    }
    else{
        System.out.println("No Scholarship");
    }
    


}
// Q16: Check whether a student can appear in an exam.
//
// Given:
// marks = 45
// attendance = 80
// hasAdmitCard = true
//
// Rules:
// Attendance must be 75 or above.
// Marks must be 40 or above.
// Student must have an admit card.
//
// If all conditions are satisfied, print "Eligible".
// Otherwise, print "Not Eligible".

static void question16() {

    int marks = 45;
    int attendance = 80;
    boolean hasAdmitCard = true;

    if(attendance >= 75){
        if(marks >= 40){
            if(hasAdmitCard){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    else{
        System.out.println("Not Eligible");
    }

}
// Q17: Check whether a person gets a discount.
//
// Given:
// age = 22
// isMember = true
//
// Rules:
// A person gets a discount if:
// 1. Age is 60 or above, OR
// 2. The person is a member AND age is 18 or above.
//
// Print:
// Discount
// or
// No Discount

static void question17() {

    int age = 22;
    boolean isMember = true;

    if(age >= 60 ){
        System.out.println("Discount");
    }
    else if(isMember && age >=18){
        System.out.println("Discount");
    }
    else{
        System.out.println("No Discout");
    }

}
    
}