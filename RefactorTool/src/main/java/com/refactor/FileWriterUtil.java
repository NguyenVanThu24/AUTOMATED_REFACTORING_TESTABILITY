package com.refactor;

import java.nio.file.*;

public class FileWriterUtil {

    public static void writeFile(String path, String content) throws Exception {
        Files.write(Paths.get(path), content.getBytes());
    }
}