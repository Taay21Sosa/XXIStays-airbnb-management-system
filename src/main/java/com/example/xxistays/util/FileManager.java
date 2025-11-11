package com.example.xxistays.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    //
    private static final String basePath = "src/main/resources/data/";

    /**
     *
     * @param records
     * @return
     */
    private static String getFullPath(String records) { return basePath + records; }

    /**
     *
     * @param fullPath
     * @return
     */
    public static boolean isFound(String fullPath) {
        File file = new File(fullPath);
        return file.exists();
    }

    /**
     *
     * @param fullPath
     * @return
     */
    public static boolean isEmpty(String fullPath) {
        File file = new File(fullPath);
        return file.length() == 0;
    }

    /**
     *
     * @param <T>
     * @param csvFile
     * @return
     */
    public static <T> List<T> readData(String csvFile) throws IOException {
        List<T> lines = new ArrayList<>();
        String fullPath = getFullPath(csvFile);

        if (!isFound(fullPath) || isEmpty(fullPath)) {
            System.out.println("INFO: File does not exist or is empty, returning empty list.");
            return new ArrayList<>();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add((T) line);
            }
        }

        return lines;
    }

    public static <T> void writeData(List<T> records, String csvFile) throws IOException {
        String fullPath = getFullPath(csvFile);

        if (!isFound(fullPath)) {
            File file = new File(fullPath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath))) {
            for (T record : records) {
                writer.write(record.toString());
                writer.newLine();
            }
        }
    }
}
