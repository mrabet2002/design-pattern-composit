import fs.Dir;

public class Main {
    public static void main(String[] args) {
        // Create a root directory
        Dir root = new Dir();
        root.setName("root");

        // Create a subdirectory
        root.mkdir("home")
                .touch("user1.txt")
                .mkdir("user1")
                .touch("file1")
                .touch("file2");

        // Create a subdirectory
        root.mkdir("etc")
                .touch("log");

        // Create a subdirectory
        root.mkdir("var");

        // Create a subdirectory
        root.mkdir("tmp");

        // Create a file
        root.touch("file1");

        // Create a file
        root.touch("file2");

        // Create a file
        root.touch("file3");

        // List the contents of the root directory
        root.ls();
    }
}