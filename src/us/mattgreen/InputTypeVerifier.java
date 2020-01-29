package us.mattgreen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTypeVerifier {
    private BufferedReader rdr;

    public InputTypeVerifier() {
        this.rdr = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getStringInput(String fieldName) throws IOException {
        System.out.print(fieldName + ": ");
        return this.rdr.readLine();
    }

    public Integer getIntegerInput(String fieldName) throws IOException, InvalidInputException {
        System.out.print(fieldName + ": ");
        String input = this.rdr.readLine();

        try {
            return Integer.parseInt(input);
        } catch (Exception _e) {
            throw new InvalidInputException(input);
        }
    }

    public boolean getBooleanInput(String fieldName) throws IOException, InvalidInputException {
        System.out.print(fieldName + ": ");
        String input = this.rdr.readLine();

        try {
            return Boolean.parseBoolean(input);
        } catch(Exception _e) {
            throw new InvalidInputException(input);
        }
    }
}
