package classes;
import java.io.*;
import classes.Folder;
import java.nio.*;
import classes.DLinkedList;
import classes.DLinkedList.Node;
public class test {
public static void main(String[] args){

	
String user="user1u";	
Folder test=new Folder(user);
test.readFolder("inbox");
DLinkedList.printList(test.index);



}	
}
