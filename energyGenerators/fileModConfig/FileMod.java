package energyGenerators.fileModConfig;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class FileMod {
    public static String Read(String Path) {
        String content = "";
        try {
            final FileReader file = new FileReader(Path);
            final BufferedReader readFile = new BufferedReader(file);
            String line = "";
            try {
                for (line = readFile.readLine(); line != null; line = readFile.readLine()) {
                	content = content + line + "\n";
                }
                file.close();
                return content;
            }
            catch (IOException ex) {
                System.out.println("Erro: N\u00e3o foi poss\u00edvel ler o arquivo!");
                return "";
            }
        }
        catch (FileNotFoundException ex2) {
            System.out.println("Erro: Arquivo n\u00e3o encontrado!");
            return "";
        }
    }
    
    public static boolean Write(final String Path, final String Text) {;
    	File f = new File("config/EG-settings.cfg");
    	
    	if (!f.exists()) {
            try {
                final FileWriter file = new FileWriter(Path);
                final PrintWriter saveFile = new PrintWriter(file);
                saveFile.println(Text);
                saveFile.close();
                return true;
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
                return false;
            }
    	} else {
    		return false;
    	}
    }
}