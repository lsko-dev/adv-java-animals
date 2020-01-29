package us.mattgreen;

import java.util.ArrayList;
import java.io.*;

public class InputHandler {
    private ArrayList<Talkable> list;
    private InputTypeVerifier input;

    public InputHandler(ArrayList<Talkable> list) {
        this.input = new InputTypeVerifier();
        this.list = list;
    }

    // take input and create a new item in the ArrayList
    public void takeInput() throws InvalidInputException, IOException {
        String input = this.input.getStringInput("animal type");

        switch (input) {
            case "cat": {
                String name = this.input.getStringInput("name");
                int killedMice = this.input.getIntegerInput("mice killed");
                this.list.add(new Cat(killedMice, name));
                break;
            }

            case "dog": {
                String name = this.input.getStringInput("name");
                boolean friendly = this.input.getBooleanInput("friendly");
                this.list.add(new Dog(friendly, name));
                break;
            }

            case "teacher": {
                String name = this.input.getStringInput("name");
                int age = this.input.getIntegerInput("age");
                this.list.add(new Teacher(age, name));
                break;
            }

            default: {
                throw new InvalidInputException(input);
            }
        }
    }
}
