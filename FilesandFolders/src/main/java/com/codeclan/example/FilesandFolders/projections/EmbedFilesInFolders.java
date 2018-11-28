package com.codeclan.example.FilesandFolders.projections;


import com.codeclan.example.FilesandFolders.models.File;
import com.codeclan.example.FilesandFolders.models.Folder;
import com.codeclan.example.FilesandFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFilesInFolders", types = Folder.class)
public interface EmbedFilesInFolders {

    String getTitle();
    List<File> getFiles();
    User getUser();
}
