package software.ulpg.kata5;

import java.util.stream.LongStream;

import static java.lang.Integer.parseInt;

public class FactorialCommand implements Command{
    @Override
    public Output execute(Input input) {
        try {
            return factorial(input.get("number"));
        } catch (NumberFormatException e){
            return Command.ouput(400, null);
        }
    }

    private Output factorial(String number) {
        return factorial(parseInt(number));
    }

    private Output factorial(int n) {
        if (n > 20) return Command.ouput(406, null);

        long factorial = LongStream.range(2, n + 1).reduce(1, (a, i) -> a * i);
        return Command.ouput(200, String.valueOf(factorial));
    }
}
