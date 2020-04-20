package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class App implements IApp{

	@Override
	public boolean signin(String email, String password) {
		boolean valid=false;
		File file1=new File("System");
		String fileSeparator =System.getProperty("file.separator");
	 	String path1= file1.getAbsolutePath();
	 try {   BufferedReader reader=new BufferedReader(new FileReader(path1+fileSeparator+"info.txt"));
	 	String line ;
	 	while((line=reader.readLine())!=null) {//read the whole file
	 		String []arr=line.split("\\s");
	 		if(arr[0].equals(email)&&arr[1].equals(password)) {//if user and pass matches with input it will return true 
	 			valid=true;
	 			reader.close();
	 			break;
	 		}
	 	}
	 }catch(Exception e) {
		 System.out.println();
	 }
	 return valid;
		
		
	}

	@Override
	public boolean signup(IContact contact) {
		
Contact obj=(Contact)contact;
		
		String fileSeparator =System.getProperty("file.separator");
		File file1=new File("System");
		String userName=obj.getUserName();
		String password=obj.getPassword();
		String path = file1.getAbsolutePath();
		if(!checkuser(userName)) {
		//creating a user in system after checking for and username .
		try {
		File file2=new File(path+fileSeparator+userName);//creating a mail user
		file2.mkdir();
		String path2 = file2.getAbsolutePath();
		File file3=new File(path2 + fileSeparator + "inbox");
		File file4=new File(path2 + fileSeparator + "trash");
		File file5=new File(path2 + fileSeparator + "sent");
		File file9=new File(path2 + fileSeparator + "contacts");
		File file14=new File(path2 + fileSeparator + userName + "info.txt");//create a text file contains information about user(doesn't include password)
		file3.mkdir();
		file4.mkdir();
		file5.mkdir();
		file9.mkdir();
		file14.createNewFile();
		String path3 = file3.getAbsolutePath();
		String path4 = file4.getAbsolutePath();
		String path5 = file5.getAbsolutePath();
		File file6 = new File(path3+fileSeparator+"index.txt");
		File file7 = new File(path4+fileSeparator+"index.txt");
		File file8 = new File(path5+fileSeparator+"index.txt");
		file6.createNewFile();
		file7.createNewFile();
		file8.createNewFile();
		File file13=new File(path+fileSeparator+"info.txt");//let's push that password and username to info file.
		String path13=file13.getAbsolutePath();
		FileWriter fr=new FileWriter(path13,true);
		BufferedWriter bf=new BufferedWriter(fr);
		PrintWriter pr=new PrintWriter(bf);
		pr.println(userName+" "+password);//using println to write line by line in info.txt file of system.
		pr.close();
		bf.close();
		fr.close();
		//add information of mail to the text file
		String path14=file14.getAbsolutePath();
		FileWriter frx=new FileWriter(path14);
		BufferedWriter bfx=new BufferedWriter(frx);
		PrintWriter prx=new PrintWriter(bfx);
		String info=obj.toString();
		prx.println(info);
		prx.close();
		bf.close();
		fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return true;
		}else {
			return false;//kda al asm tl3 mawgod abl kda
			
		}
		
	}

	public static  boolean checkuser(String name) {//kda bashof al asm mawgod gowa al system wala la .
		boolean valid =false;
		File file1=new File("System");
		String [] namesOfFiles=file1.list();
		if(namesOfFiles.length==0) {
			return false;
		}
		for(int i=0;i<namesOfFiles.length;i++) {
		   if(name.equals(namesOfFiles[i])) {
			  valid=true;
			  break;
		   }
		}
		return valid;
	}

	@Override
	public void setViewingOptions(IFolder folder, IFilter filter, ISort sort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMail[] listEmails(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmails(ILinkedList mails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveEmails(ILinkedList mails, IFolder des) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean compose(IMail email) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
