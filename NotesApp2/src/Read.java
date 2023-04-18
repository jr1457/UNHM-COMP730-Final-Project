import java.io.FileReader;
import java.io.IOException;
import java.awt.FileDialog;
import java.awt.Frame;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
	
	class Read
	{

		private String fileName;
		
		public Read()
		{
			fileName = null;
		}

		public Read(String file)
		{
			fileName = file;
		}
		
		public String getFileName() {
			return fileName;
		}
		
		public void setFileName(String file) {
			fileName = file;
		}
		
		public String readFromFile()
		{
			String contents = "";
			int ch;
			try (FileReader freader = new FileReader(fileName))
			{
	
				while((ch = freader.read()) != -1)
				{
					contents += (char)ch;
				}
			}
			catch(IOException exception)
			{
				System.out.println("File problem: " + exception.getMessage());
			}
			return contents;
		}
		
		public static void main(String[] args) throws IOException
		{
			
			java.util.Scanner scanner = new java.util.Scanner(System.in);		
			System.out.print("Enter file name along with its location: ");
			String fileName = scanner.nextLine();
			System.out.println(fileName);
			
			Read r = new Read(fileName);
			String contents = r.readFromFile();
			
			System.out.println(contents);
	        
	        }
		}
	

	