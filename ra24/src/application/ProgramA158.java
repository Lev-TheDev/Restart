package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramA158 {

	public static void main(String[] args) {
	/*  -> "/home/rogerlevino/Documentos/in.txt"
		-> new FileWriter(path)
		   cria ou recria do zero o arquivo
		-> new FileWriter(path, true)
		   o arquivo existente será aberto e tudo o que você escrever será acrescentado ao final */
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "/home/rogerlevino/Documentos/alt.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
