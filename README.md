# Basic Math Library
This project is to implement a basic math library. There are a couple of different implementations of math functions in the library, but the most useful one is likely to be the classes in the StringUtils package. They contain static methods for performing arithmetic functions as well as static methods for converting between data types. All methods take in strings and return strings, so they provide common interfaces to calling applications. 

The AbstractUtils Package contains a set of classes, one for each type of data and its corresponding math functions. The MathAbstract class is the parent abstract class, implemented with generics and the remaining classes in that package are for math with each type of data.

# Testing
JUnit testing was done on all methods of the MathFunctions class using the MathFunctionsTest class. There was also basic testing performed on all of the functions using the main() application and simple print statements to the console to outline the results of the functions.

# Reusability
This library can easily be used or extended in Java. The common format of using and returning strings for the StringUtils package would be especially useful in UI applications where things are displayed as strings.
