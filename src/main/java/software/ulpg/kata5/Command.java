package software.ulpg.kata5;

public interface Command {
    Output execute(Input input);

    interface Input{
        String get(String key);
    }

    interface Output {
        int code();
        String result();
    }

    static Output ouput(int code, String result) {
        return new Output() {
            @Override
            public int code() {
                return code;
            }

            @Override
            public String result() {
                return result;
            }
        };
    }
}
