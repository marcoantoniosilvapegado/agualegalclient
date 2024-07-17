package br.gov.go.sefaz.agualegalclient.testes.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileUploadService {
	
	public MultipartFile createMultipartFileFromFile(String filePath) throws IOException {		

		File file = new File(filePath);
		DiskFileItem fileItem = new DiskFileItem("file", "image/jpg", false, file.getName(), (int) file.length() , file.getParentFile());
		fileItem.getOutputStream();
		MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
		
		  Path path = Paths.get(filePath);
	       byte[] testeBytes = Files.readAllBytes(path);
		System.out.println(testeBytes.length);
		
		return multipartFile;
    }

}