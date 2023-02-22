package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите полный путь к файлу архива, включая имя файла");
            Path zipFile =  Paths.get(reader.readLine());
            ZipFileManager zipFileManager = new ZipFileManager(zipFile);
            System.out.println("Введите полный путь к файлу для архивации, включая имя файла");
            Path source = Paths.get(reader.readLine());
            zipFileManager.createZip(source);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
