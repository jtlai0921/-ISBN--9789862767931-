package book.java7.chapter8;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileTree implements FileVisitor<Path>  {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, 
                    BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFile(Path file, 
                    BasicFileAttributes attrs) throws IOException {
        printFile(file);
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFileFailed(Path file, 
                    IOException exc) throws IOException {
        throw new IOException("Faild.");
    }
    @Override
    public FileVisitResult postVisitDirectory(Path dir, 
                    IOException exc) throws IOException {
        return FileVisitResult.TERMINATE.CONTINUE;
    }
    
    private void printFile(Path file) {
        System.out.println(file);
    }
    
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("C:/temp2"), new MyFileTree());
    }
}
