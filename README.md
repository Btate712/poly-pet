# poly-pet

This repository is an example of using polymorphism in Java. Abstract class Pet
provides a simple constructor method allowing new pets to be created with a name,
a getter method for that name, and an abstract speak() method.

Each Pet sub-class (Dog, Cat, Fish, and Turtle) calls the Pet constructor in its 
own constructor method and implements the speak() method in a way that's appropriate
for the type of animal it represents. 

The Pet-Test class creates one instance of each of the four Pet sub-classes and
stores them in an array "pets" of type Pet. We then iterate through pets and call
the speak method for each pet, resulting in each type of pet "speaking" in its own
custom way.