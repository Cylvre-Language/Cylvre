# Features that currently work in Cylvre

- `main()` function
```java
 func main(){
    //code goes here...
 }
```

- Basic variable declarations with direct value
```java
/* ':' is used to free up '=' for conditional statements */
x : 10;  //integer (implicit definition) 
float y : 12.345 * 3.1415; //float (explicit definition) 
```

- Printing (Although String concatenation is unavailable)
```java
println("Hello, World!");
println(x); //printing of variable values

print("Hello ");
print("World."); //print() also added
```

- Arithmetics
```java
x : 12 * 24 + (7 - 1);
```

- Basic conditionals with one condition (`else` statement doesn't work yet...)
```java
x : 10;
x = 10 ? println("ten");
```

- Ranged for loop
```java
/*If loop variable is not declared, Cylvre will implicitly declare it*/
for x (0 to ten) println(x);
```

- Autocasting for variables
- Curly braces can be omitted for loops and conditionals if only one statement is present (excluding functions).

**_Comments haven't been added yet._**
