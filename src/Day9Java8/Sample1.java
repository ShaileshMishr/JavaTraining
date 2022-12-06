package JavaBasics.src.Day9Java8;

public class Sample1 {

    public static void main(String[] args) {
        Sample1 obj = new Sample1();
        obj.getVal();
        obj.getVal(1,4);
        obj.getVal(1,4,5);

    }
    int getVal(int ... value) {
        if(value.length==0)
        System.out.println("Variable Argument");
        return 350;
    }

   /* int getVal(int a) {
        System.out.println("One Argument ");
        return a;
    }

    int getVal(int a , int b) {
        System.out.println("Two Argument");
        return a+b;
    } */
}

// varargs: variable arguments
// Rules associated with varargs:
//1. varargs variable should always be the last variable in parameter list
//2. there can be only one variable args in a method.

// Stream API : Streams will operate on collection
// Intermediate operations: transform the collection
// Terminal Operations : End the stream
// there can be n number of intermediates operation but only one terminal operation

// Functional Interface
// Lambda Expression
// VarArgs
// Static and defult methods
// Stream API

