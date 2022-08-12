package com.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyDemo {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("src/main/java/com/day23/data/bar/news.txt");  // 來源端
        Path dest   = Paths.get("src/main/java/com/day23/data/foo/news.txt");  // 目的端
        
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        
        System.out.println("Copy 完成");
        
    }
}
