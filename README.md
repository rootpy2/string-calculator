# string-calculator
A simple calculator using string data-type

Task 7:

**Using TDD, Add a method to StringCalculator
called public int GetCalledCount()
that returns how many times Add() was invoked.**

Initially, I thought of using a class variable for "count" which can keep track of all the invokes irrespective of the 
objects created of StringCalculator class. JUnit doesn't have a proper order of execution defined for existing test 
cases which makes it difficult to write a test case for that. So, instead, I have used
instance variable "count" which can keep a count of how many times Add() method was invoked on that object.
Also, It wasn't mentioned in the KATA, whether to keep track of all the invokes throughout the lifetime of
the program or just for an instance of the Class.

Assumption:
    1) Dangling meta character handled - "*"
    2) Defined delimiter will only be used

Steps to test the solution,
Dependencies:
    -> install gradle

-> git clone the repo or download the zip
-> unzip the .zip file, import it to an IDE (IntelliJ, Eclipse, etc.)
-> run `gradle clean` and `gradle build` command
-> to run tests `gradle test`

To run a custom valid input string
-> open cmd and change directory to {path_till_unzip_folder}\string-calculator\build\libs\
-> run the following command
        `java -jar string-calculator.jar "input_string"`
-> for eg:  java -jar build\libs\string-calculator.jar "//[**][%%]\n1**2%%3"
