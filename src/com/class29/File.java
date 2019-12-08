package com.class29;

public abstract class File {
 
public void Edit() {
	System.out.println("Editing the file");
}
public void Close() {
	System.out.println("Closing the file ");
}
public abstract void Open();
}
class JavaFile extends File{
	 public void Open() {
		System.out.println("Openning java file using sublime text");
	}
	}

class WordFile extends File{
	public void Open() {
		System.out.println("Opening the word file using Microsoft Word");
	}
	}

class PDFFile extends File{
	public void Open() {
		System.out.println("Opening the PDF file using Adobe Reader");
	}
	}

