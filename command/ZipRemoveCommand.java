package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand{
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Удаление файла из архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Введите полный путь файла для удаления:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);

        ConsoleHelper.writeMessage("Файл был удален из архива.");
    }
}
