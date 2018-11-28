package com.codeclan.example.FilesandFolders.components;


import com.codeclan.example.FilesandFolders.models.File;
import com.codeclan.example.FilesandFolders.models.Folder;
import com.codeclan.example.FilesandFolders.models.User;
import com.codeclan.example.FilesandFolders.repositories.FileRepository;
import com.codeclan.example.FilesandFolders.repositories.FolderRepository;
import com.codeclan.example.FilesandFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }


    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Andrew");
        userRepository.save(user);

        User user2 = new User("Fraser");
        userRepository.save(user2);

        Folder folder1 = new Folder("impotant stuff", user);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("miscellaneous", user);
        folderRepository.save(folder2);

        File file = new File("file1", "jpeg", 14, folder1);
        fileRepository.save(file);

        File file2 = new File("file2", "java", 11, folder1);
        fileRepository.save(file2);


    }
}
