	import java.io.FileReader;
	import java.io.IOException;
	import java.awt.FileDialog;
	import java.awt.Frame;

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
		
		public static void main(String[] args)
		{
			/*
			java.util.Scanner scanner = new java.util.Scanner(System.in);		
			System.out.print("Enter file name along with its location: ");
			String fileName = scanner.nextLine();
			*/
			
			FileDialog fd = new FileDialog(new Frame(), "Open a file", FileDialog.LOAD);
			fd.setVisible(true);
			String fileName = fd.getDirectory() + "/" + fd.getFile();
			
			Read r = new Read(fileName);
			String contents = r.readFromFile();
			
			System.out.println(contents);
		}
	}

	