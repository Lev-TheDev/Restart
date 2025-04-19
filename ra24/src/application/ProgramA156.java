package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramA156 {

	public static void main(String[] args) {
		// "/home/rogerlevino/Documentos/in.txt"
		
		String path = "/home/rogerlevino/Documentos/in.txt";
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			// se arquivo tiver no final, readLine() retorna null
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
