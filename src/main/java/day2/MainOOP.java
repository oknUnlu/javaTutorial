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

    class TestStudent2{
        public static void main(String[] args) {
            Product product1 = new Product();
            product1.setName("Delonghi Kahve Makinesi");
            product1.setUnitPrice(7500);
            product1.setDiscount(7);
            product1.setUnitsInStock(3);
            product1.setImageUrl("1.jpg");

            Product product2 = new Product();
            product2.setName("Smeg Kahve Makinesi");
            product2.setUnitPrice(6500);
            product2.setDiscount(8);
            product2.setUnitsInStock(5);
            product2.setImageUrl("2.jpg");

            Product product3 = new Product();
            product3.setName("Kitchen Kahve Makinesi");
            product3.setUnitPrice(4500);
            product3.setDiscount(6);
            product3.setUnitsInStock(2);
            product3.setImageUrl("3.jpg");

            Product[] products = { product1, product2, product3 };

            System.out.println("<ul>");
            for (Product product : products) {
                System.out.println("<li>" + product.getName() + "</li>");
            }
            System.out.println("</ul>");

            IndividualCustomer individualCustomer = new IndividualCustomer();
            individualCustomer.setId(1);
            individualCustomer.setPhone("123456789");
            individualCustomer.setCustomerNumber("1234");
            individualCustomer.setFirstName("Okan");
            individualCustomer.setLastName("Ünlü");

            CorporateCustomer corporateCustomer = new CorporateCustomer();
            corporateCustomer.setId(2);
            corporateCustomer.setCompanyName("test.company");
            corporateCustomer.setCustomerNumber("6543");
            corporateCustomer.setPhone("1111111111");
            corporateCustomer.setTaxNumber("2222222222");

            Customer[] customers = { individualCustomer, corporateCustomer };
        }
    }
