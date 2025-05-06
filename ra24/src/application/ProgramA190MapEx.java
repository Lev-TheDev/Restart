package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class ProgramA190MapEx {

	public static void main(String[] args) {
		// /home/rogerlevino/Documentos/in190.txt
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			Map<Candidate, Integer> result = new HashMap<>();
			
			while (line != null) {
				String[] fields = line.split(",");
				Candidate candidate = new Candidate(fields[0], Integer.parseInt(fields[1]));
				
				if (result.containsKey(candidate)) {
					Integer votesSoFar = result.get(candidate);
					result.put(candidate, Integer.parseInt(fields[1]) + votesSoFar);
				} else {
					result.put(candidate, Integer.parseInt(fields[1]));
				}

				line = br.readLine();
			}
			for (Candidate key : result.keySet()) {
				System.out.println(key + ": " + result.get(key));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}
