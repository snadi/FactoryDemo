## Factory Demo

This repo illustrates two creational design patterns from the Gang of Four patterns: Abstract Factory and Singleton. 
The example is based on [https://refactoring.guru/design-patterns/creational-patterns](https://refactoring.guru/design-patterns/creational-patterns).

## What's in this demo

- The [main branch](https://github.com/snadi/FactoryDemo) has the base code without applying any design pattern
- The [abstract-factory-soln](https://github.com/snadi/FactoryDemo/tree/snadi/abstract-factory-soln) has an example of changing this code to use the abstract factory pattern
- The [apply-singleton-to-abstract-factory](https://github.com/snadi/FactoryDemo/tree/snadi/apply-singleton-to-abstract-factory) branch shows how to use Singleton within the abstract factory pattern

Before looking at the other branches, we advise you to first look at the base code and try to think of how you would refactor this code to be more extensible. For example, what if we now have a third OS (Linux) that we need to support? What if the GUI gets complicated with more GUI elements that we need to adapt for each OS?

You can switch between the branches by using `git checkout <name of the branch>`

## How to run the code

### Requirements

- Java 17 or higher
- Maven 3.9.6 or higher
- Git (if you will be using git on the command line; the alternative is download each version of the code but it's time to make sure you know how to use Git!)

### Compile and run

1. `mvn clean package`
2. `java -jar target/factorydemo-1.0-SNAPSHOT.jar`