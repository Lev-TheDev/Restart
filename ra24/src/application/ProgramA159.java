package application;

import java.io.File;
import java.util.Scanner;

public class ProgramA159 {

	public static void main(String[] args) {
		// "/home/rogerlevino/Documentos/in.txt"
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path:");
		String folderPath = sc.nextLine();
		// "/home/rogerlevino/Documentos"
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(folderPath + "/subdir").mkdir();
		System.out.println("Directory successfully created: " + success);
		
		sc.close();
	}

}
