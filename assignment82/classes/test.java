package classes;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import classes.Folder;
import java.nio.*;
import java.nio.file.Files;

import classes.DLinkedList;
import classes.DLinkedList.Node;
import classes.repeatedMethods;
public class test {
  
	
  public static void main(String[] args){
	  Mail test=new Mail();
	  test.setPath("C:\\Users\\Kimo Store\\Desktop\\ahmed\\assignment8\\System\\user1u\\sent\\2020,04,24,19,58,50");
	  App obj= new App();
	  LinkedList obj2=new LinkedList();
	  obj2.add(test);
	  obj.deleteEmails(obj2);
  }	
}
