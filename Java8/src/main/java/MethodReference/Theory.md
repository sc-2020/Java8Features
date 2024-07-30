###What is Method Reference?

- Introduced as part of Java8 and sole purpose is to simplify the implementation of Functional Interfaces.
- This is also achieved by Lambdas. Lambdas do help to move away from reading anonymous inner classes.
- Method reference is going to simplify the Lambdas itself. 
- Shortcut for writing the Lambda Expressions.
- Refer a methos in a class

###Syntax of a Method Reference 

- className :: instance-methodName
- classname :: static-methodName 
- instance :: methodName

###Where to use method reference 

 - Lambda expressions referring to a method directly.
 - Using Lambda 
 
 ```
    Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
 ```
- Using Method Reference 
 
 ```
    Function<String, String> toUpperCaseMethodReference = String :: toUpperCase;
 ```
