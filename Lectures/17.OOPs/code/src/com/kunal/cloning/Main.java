package com.kunal.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ujjwal = new Human(34, "Ujjwal Krishna");
//        Human twin = new Human(kunal);

        Human twin = (Human)ujjwal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ujjwal.arr));
    }
}
