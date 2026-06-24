package com.refactor;

import java.nio.file.*;

public class FileReaderUtil {

    public static String readFile(String path) throws Exception {
        return Files.readString(Paths.get(path));
    }
}