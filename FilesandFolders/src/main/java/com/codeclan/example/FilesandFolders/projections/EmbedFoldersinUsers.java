package com.codeclan.example.FilesandFolders.projections;


import com.codeclan.example.FilesandFolders.models.Folder;
import com.codeclan.example.FilesandFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFoldersInUsers", types = User.class)
public interface EmbedFoldersinUsers {

    String getName();
    List<Folder> getFolders();
}
