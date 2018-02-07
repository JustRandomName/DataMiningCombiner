package evm.dmc.web.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import evm.dmc.api.model.ProjectModel;
import evm.dmc.api.model.account.Account;
import evm.dmc.api.model.data.MetaData;
import evm.dmc.web.exceptions.StorageException;
import evm.dmc.web.exceptions.StorageFileNotFoundException;
import evm.dmc.web.service.data.DataPreview;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public interface DataStorageService {

//    void init();
    
    MetaData saveData(Account account, ProjectModel project, MultipartFile file)
    	throws StorageException;
    
//    MetaData save(MetaData meta)

    @Deprecated
    DataPreview store(Path relativePath, MultipartFile file)
    		throws StorageException;

    Stream<Path> loadAll(Path relativePath) throws StorageException;

    Path load(Path relativePath, String filename);
    
    DataPreview loadDataPreview(Path relativePath, String filename);

    Resource loadAsResource(Path relativePath, String filename)
    		throws StorageFileNotFoundException;

    void deleteAll(Path relativePath);
    
    /**
     * Combine userName from account and projectName to relative path: {userNmae}/{projectName}/
     * @param account
     * @param project
     * @return relative path that combines userName and projectNmae
     */
   static  Path relativePath(Account account, ProjectModel project) {
	   return Paths.get(account.getUserName(), project.getName());
	}
   
   static Path relativePath(String accountName, String projectName) {
	   return Paths.get(accountName, projectName);
   }

}
