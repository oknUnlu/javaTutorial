package day2;

    // Inheritance
    /* When one object acquires all the properties and behaviors of a parent object, it is known as inheritance.
      It provides code reusability. It is used to achieve runtime polymorphism. */
    // Polymorphism
    /* If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer
       differently, to draw something, for example, shape, triangle, rectangle, etc.
       In Java, we use method overloading and method overriding to achieve polymorphism.
       Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc. */
    // Abstraction
    /* Hiding internal details and showing functionality is known as abstraction. For example phone call,
       we don't know the internal processing. */
    // Encapsulation
    /* Binding (or wrapping) code and data together into a single unit are known as encapsulation.
       For example, a capsule, it is wrapped with different medicines.
       A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data
       members are private here. */
    class Student{
        int id;
        String name;
    }
    class TestStudent2{
        public static void main(String[] args) {
            Student s1 = new Student();

            s1.id = 1;
            s1.name = "AAAaaa";
            System.out.println(s1.id + s1.name);
        }
    }
