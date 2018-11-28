package com.codeclan.example.FilesandFolders;

import com.codeclan.example.FilesandFolders.models.File;
import com.codeclan.example.FilesandFolders.models.Folder;
import com.codeclan.example.FilesandFolders.models.User;
import com.codeclan.example.FilesandFolders.repositories.FileRepository;
import com.codeclan.example.FilesandFolders.repositories.FolderRepository;
import com.codeclan.example.FilesandFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFilesFoldersAndUsers() {
		User user = new User("Andrew");
		userRepository.save(user);

		Folder folder1 = new Folder("impotant stuff", user);
		folderRepository.save(folder1);

		File file = new File("file1", "jpeg", 14, folder1);
		fileRepository.save(file);

		File file2 = new File("file2", "jpeg", 11, folder1);
		fileRepository.save(file2);

	}


}
