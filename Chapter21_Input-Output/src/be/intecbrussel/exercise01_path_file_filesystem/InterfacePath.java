package be.intecbrussel.exercise01_path_file_filesystem;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InterfacePath {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("/Data");
        Path p2 = p1.resolve("folder1");
        Path p3 = p2.resolve("file1.txt");
        System.out.println(p3); // /Data/folder1/file1.txt

        Path p4 = Paths.get("file2.txt");
        System.out.println(p4.toAbsolutePath()); // /Users/mertdemirok/IdeaProjects/JAVA-11-Fundamentals/file2.txt

        Path path = Paths.get("../../Data/folder1/file1.txt");
        Path realPath = path.toRealPath();
        System.out.println(realPath); // /Users/mertdemirok/Data/folder1/file1.txt

        Path p5 = Paths.get("/Data/folder1/file1.txt");
        Path p6 = Paths.get("/Data/folder2/file2.txt");
        Path p7 = p5.relativize(p6);
        System.out.println(p7); // ../../folder2/file2.txt

        Path path2 = Paths.get("/Data/folder1/file2.txt");
        System.out.println("root: " + path2.getRoot()); // prints "/"
        System.out.println("fileName: " + path2.getFileName()); // file2.txt
        System.out.println("parentName: " + path2.getParent()); // /Data/folder1
        for (Path p:path2){
            System.out.println(p);
        }
        // Data
        // folder1
        // file2.txt

    }
}
