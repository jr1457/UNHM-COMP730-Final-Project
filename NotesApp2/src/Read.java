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
	/**
	 * The main purpose of the Read class is to get user input, 
	 * read the contents of a .txt file, and return it as a string. 
	 * 
	 * @author Eshwar
	 *
	 */
	class Read
	{

		private String fileName;
		
		/**
		 * Default constructor that creates an empty object.
		 */
		public Read()
		{
			fileName = null;
		}

		/**
		 * Parameterized constructor that creates an object initialized with the given file name.
		 * @param file The name of the file to read from.
		 */
		public Read(String file)
		{
			fileName = file;
		}
		
		/**
		 * Get the file name.
		 * @return String file name.
		 */
		public String getFileName() {
			return fileName;
		}
		
		/**
		 * Set the file name.
		 * @param file The name of the file to read from.
		 */
		public void setFileName(String file) {
			fileName = file;
		}
		
		/**
		 * This method reads the contents of the file and returns it.
		 * @return String contents of the file.
		 */
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
		
		/**
		 * 
		 * @param args Arguments get passed through here.
		 * @throws IOException An IOException may be thrown upon execution of the program. 
		 */
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
	

	