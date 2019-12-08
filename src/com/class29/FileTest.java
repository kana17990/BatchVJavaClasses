package com.class29;

public class FileTest {
public static void main(String[] args) {
	File file=new JavaFile();
	File file2=new WordFile();
	File file3=new PDFFile();
	
	file.Open();
	file.Close();
	file.Edit();
	
	file2.Open();
	file2.Edit();
	file2.Close();
	
	file3.Close();
	file3.Edit();
	file3.Open();
}
}

