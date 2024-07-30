###What is Lambda Expression?

- Lambda is equivalent to a function (method) without a name.
- Lambda's are also referred as Anonymous functions.
  - Method parameters
  - Method body
  - Return type
- Lambdas are not ties to any class like a regular method.
- Lambda can also be assigned to a variable and passed around.

### Syntax of a Lambda expression 

Lambda expression 

        (      )             ->      {      }
Lambda input parameters  |  Arrow | Lambda Body


### Usages of Lambda

- Lambda is mainly used to implement Functional Interfaces. (SAM - Single Abstract Method)

```
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}
    
@FunctionalInterface
public interface Runnable {
    public abstract void run();
}
```

### Lambda in practice (Things to keep in mind)

- () -> Single Statement or Expression; //curly braces are not needed
- () -> {<Multiple statements>};        //curly braces are needed

### Lambdas vs Legacy Java

Legacy: 
```
Runnable runnable = new Runnable() {
    public void run() {
        System.out.println("Inside Runnable 1");
    }
};
new Thread(runnable).start();
```

Java 8: 
```
Runnable runnableLambda = () -> System.out.println("Inside Runnable 2");
new Thread(runnableLambda).start();
```
