public class Main {
    public static void main(String[] args) {
        //when a function calls another function is known as recursion
        //while the function is not finished executing it will remain in stack
        //when a function finishes executing it is removed from the stack, and the flow of flow is restored to where that function is called //not only for recursion, applies everywhere
        //LIFO applied in stack, last entered item gets out first
        //Recurion is a function that call itself
        //to stop the reursiveness, we need a base condition in recursion:
        //It is a condition where out recursion will stop making new calls(simple if condition)
        //recursive call
        //if you are calling a function again and again, you can treat it as a separate call in the stack
        //if no base condition, then function call keeps happening, stack will filled again and again, and we know that every call take some memory
        //one time will come, when memory of computer will exceeds the limit, known as stack overflow error //sites name came from this


        //why do we need recursion?
        //it helps us in solving bigger/complex problems in a simpler way
        //you can convert recursion solutions into iteration(loops) and vice versa
        //space complexity is not constant because of recursive calls
        //it helps us in breaking down bigger problems into smaller problems
    }
}
