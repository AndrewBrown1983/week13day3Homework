package com.codeclan.example.FilesandFolders.repositories;

import com.codeclan.example.FilesandFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
