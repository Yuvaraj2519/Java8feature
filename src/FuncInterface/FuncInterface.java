/*
* functional interface in annotation which allows only one method.
* the reason is it will auto config the method. see below implementation
*/

package FuncInterface;

@FunctionalInterface
interface A{
    void greet(String name);
}

/* if we want to use interface we need to implement in a class and
 then call the method by func interface we can directly create anonymous class*/

public class FuncInterface {

//   A obj = new A(); -> it will not work

    public static void main(String[] args) {

        A obj1 = new A() {
            @Override
            public void greet(String name) {
                System.out.println("Hi "+name);
            }
        };

        // simple version of above which is use of functional interface
        A obj = (name) -> System.out.println("Hi " + name);

        obj1.greet("java");
        obj.greet("java");
    }
}
