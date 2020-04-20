package classes;
import classes.DLinkedList.Node;
import java.nio.*;
import java.io.*;
public class Folder implements IFolder{
 private String username;
 private String folder;//inbox or trash or whatever
 private String path;
 public DLinkedList index;//to load index file as what was said in assignment.

 public Folder(String username){
	 String fileSeparator = System.getProperty("file.separator");
	 this.username = username;
	 this.path = "System" + fileSeparator + username;
	 index=new DLinkedList();
	
 }
	public void readFolder(String folder) {
		//folder can be inbox or trash or anyfolder that contain a index file
	String fileSeparator = System.getProperty("file.separator");
	try{BufferedReader reader = new BufferedReader(new FileReader(path + fileSeparator +folder+fileSeparator+ "index.txt"));
		String line ;
		while((line = reader.readLine()) != null) {
			index.add(line);//add each line in index file to a node in double linked list.
		}
		reader.close();
	}catch(Exception e) {
		System.out.println(e);
	}	
	}
	
	
	
 }

 
 

