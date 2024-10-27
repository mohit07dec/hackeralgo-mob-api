package com.hackeralgo.service;

import com.hackeralgo.config.FileStorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class AudioService {

    private final Path root = Paths.get("uploads"); // Local storage for uploaded files

    public AudioService() {
        try {
            Files.createDirectories(root);  // Ensure the directory exists
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize folder for upload!");
        }
    }

    // Method to save file
    public String saveFile(MultipartFile file) throws IOException {
        // Save the file to the local file system
        Path filePath = this.root.resolve(file.getOriginalFilename());
        Files.copy(file.getInputStream(), filePath);
        return filePath.toString();  // Return the path to the saved file
    }
}
