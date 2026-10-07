/*
==================================================
                JAVA - VARIABLES
==================================================

What is a Variable?
-------------------
A variable is a named storage location used to
store a value in a Java program.

Basic Syntax:
-------------
dataType variableName = value;

Example:
--------
int age = 20;

Here:
int   -> Data type
age   -> Variable name
=     -> Assignment operator
20    -> Value


--------------------------------------------------
1. DECLARATION
--------------------------------------------------

Creating a variable without giving it a value.

Example:
int age;


--------------------------------------------------
2. INITIALIZATION
--------------------------------------------------

Giving a variable its first value.

Example:
int age = 20;


--------------------------------------------------
3. ASSIGNMENT
--------------------------------------------------

Changing or giving a value to an existing variable.

Example:
int age;
age = 20;

Example of changing value:
int age = 20;
age = 21;

Now age contains 21.


--------------------------------------------------
4. COMMON VARIABLE DATA TYPES
--------------------------------------------------

int      -> Whole numbers
Example: int age = 20;

double   -> Decimal numbers
Example: double marks = 85.5;

char     -> Single character
Example: char grade = 'A';

boolean  -> true or false
Example: boolean passed = true;

String   -> Text
Example: String name = "Sudarshan";


--------------------------------------------------
5. IMPORTANT: char vs String
--------------------------------------------------

char uses SINGLE quotes:

char grade = 'A';

String uses DOUBLE quotes:

String name = "Sudarshan";


--------------------------------------------------
6. CHANGING A VARIABLE
--------------------------------------------------

Example:

int age = 20;

age = 21;

The old value is replaced by the new value.


--------------------------------------------------
7. PRINTING A VARIABLE
--------------------------------------------------

Example:

int age = 20;

System.out.println(age);

Output:
20


--------------------------------------------------
8. STRING CONCATENATION
--------------------------------------------------

We can combine text and variables using +.

Example:

int age = 20;

System.out.println("My age is " + age);

Output:
My age is 20


--------------------------------------------------
9. VARIABLE NAMING RULES
--------------------------------------------------

Valid:

int age;
int studentAge;
int age2;
int _age;

Invalid:

int 2age;          // Cannot start with number
int student age;   // Space is not allowed


--------------------------------------------------
10. JAVA IS CASE-SENSITIVE
--------------------------------------------------

These are different variables:

age
Age
AGE


--------------------------------------------------
11. NAMING CONVENTION
--------------------------------------------------

Use camelCase for variable names.

Good:

studentName
studentAge
collegeName
totalMarks

Avoid:

StudentName
student_name
STUDENTNAME


--------------------------------------------------
12. BASIC EXAMPLE
--------------------------------------------------

String name = "Sudarshan";
int age = 20;
double marks = 85.5;
char grade = 'A';
boolean passed = true;

System.out.println(name);
System.out.println(age);
System.out.println(marks);
System.out.println(grade);
System.out.println(passed);


==================================================
IMPORTANT:
==================================================

Variable = Named storage for a value.

Syntax:
dataType variableName = value;

Example:
int age = 20;

Remember:

Declaration  -> int age;
Initialization -> int age = 20;
Assignment   -> age = 21;

==================================================
*/