package Streams.UserInput;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = FileHandler.readConsole();
        System.out.print("Enter your age: ");
        String age = FileHandler.readConsole();
        String dest="C:\\Users\\risha\\OneDrive\\Desktop\\BridgeLabz_WorkSpace\\Java_Collections_And_Streams\\src\\Streams\\UserInput\\content\\output.text";
        FileHandler.writeFile(dest, "Name: " + name + "\nAge: " + age);
    }
}