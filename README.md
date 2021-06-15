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
