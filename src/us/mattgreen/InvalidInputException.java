package us.mattgreen;

public class InvalidInputException extends Exception {
    public InvalidInputException(String input) {
        super("provided input was not valid: " + input);
    }
}
