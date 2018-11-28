package com.codeclan.example.FilesandFolders.repositories;

import com.codeclan.example.FilesandFolders.models.User;
import com.codeclan.example.FilesandFolders.projections.EmbedFoldersinUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedFoldersinUsers.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
