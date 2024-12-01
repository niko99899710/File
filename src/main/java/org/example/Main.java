package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String info = "Вводите данные для записи";
        System.out.println(info);
        String filePath = "/Users/karinaid/Documents/File/MyFile.txt";
        File file = new File(filePath);
        Path path = Paths.get(filePath);
        Files.writeString(path, "");
        FileWriter writer = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                writer.close();
                System.out.println("Файл создан");
                return;
            }
            writer.write('\n' + input);
            System.out.println("Введите что-нибудь еще");
        } while (true);
    }
}