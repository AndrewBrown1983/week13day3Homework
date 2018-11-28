package com.codeclan.example.FilesandFolders.repositories;

import com.codeclan.example.FilesandFolders.models.Folder;
import com.codeclan.example.FilesandFolders.projections.EmbedFilesInFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFilesInFolders.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
