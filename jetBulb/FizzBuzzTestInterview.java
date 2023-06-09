package jetBulb;

public class FizzBuzzTestInterview {

    public byte[] fizzbuzztest(int value){
        if (value % 3 == 0 && value % 5 == 0)
            return "FizzBuzz".getBytes();
        if (value % 3 == 0)
            return "Fizz".getBytes();
        if (value % 5 == 0)
            return "Buzz".getBytes();

        throw new IllegalArgumentException("not implemented yet");
    }
}
