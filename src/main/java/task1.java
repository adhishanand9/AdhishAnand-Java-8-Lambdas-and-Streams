package main.java;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class task1 {
    public static void main(String args[])
    {
        IntStream stream1=IntStream.of(10,20,30,40,55,60,70,80,90);

        OptionalDouble obj=stream1.average();

        if(obj.isPresent())
        {
            System.out.println(obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}
