package C3534582.FootballResultsGenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	public File f;
	public FileManager() {
		f = new File("Matches.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public FileManager(String FilePath) {
		f = new File(FilePath);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void WritetoFile(String text) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(f, true));
			bw.write(text);
			bw.newLine();
			bw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public String readFromFile() {
		FileReader in;
		try {
			in = new FileReader(f);
			BufferedReader br = new BufferedReader(in);
			String line;
			String returnstring = "";
			while ((line = br.readLine()) != null) {
				returnstring += line + "\n";
			}
			br.close();
			return returnstring;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
}
