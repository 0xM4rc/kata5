package software.ulpg.kata5;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {

    private static final String BASE_URL = "http://localhost:8080/factorial?number=";

    public static void main(String[] args) throws IOException {
        int number = 6;

        String fullUrl= BASE_URL + number;

        try (InputStream is = new URL(fullUrl).openStream()){
            System.out.println(new String(is.readAllBytes()));
        }
    }
}
