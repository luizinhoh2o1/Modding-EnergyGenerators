package energyGenerators.fileModConfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import energyGenerators.fileModConfig.FileMod;



public class FileModConfig {
	
	public void saveFileConfig() {
		
		//Path file config
        String fileName = "config/EG-settings.cfg";
        
        //Value Energy Nuclear Fusor
        String defaultEnergyOutPutNuclearFusor = "512";
        String defaultEnergyOutPutSpatialPanel = "256";
        String defaultEnergyOutPutAdvancedGenerator = "128";
        String defaultEnergyOutPutBasicGenerator = "64";
        
        //Write String on File
        String print = "#" + defaultEnergyOutPutNuclearFusor + "#" + " Default Value of Nuclear Fusor is 512.index[0]\r\n"+
        		       "#" + defaultEnergyOutPutSpatialPanel + "#" + " Default Value of Spatial Panel is 256.index[1]\r\n";
        			   //"#" + defaultEnergyOutPutAdvancedGenerator + "#" + " Default Value of Advanced Generator is 128.index[2]";
        			   //"#" + defaultEnergyOutPutBasicGenerator + "#" + " Default Value of Basic Generator is 64.index[3]";
        
        FileMod.Write(fileName, print);
	}
	
	public int valueOutPut(int index) {
        FileMod reader = new FileMod();
        
        //Name file for read
        String configTxt = reader.Read("config/EG-settings.cfg");
        
        //Get the value of the index line
        String c0 = configTxt.split("#")[0];
        String c1 = configTxt.split("#")[1];
        String c2 = configTxt.split("#")[2];
        String c3 = configTxt.split("#")[3];
        //String c5 = configTxt.split("#")[4];
        //String c6 = configTxt.split("#")[5];
        //String c7 = configTxt.split("#")[6];
        //String c8 = configTxt.split("#")[7];

        switch (index) {
        	case 0: return Integer.parseInt(c1);
        	case 1: return Integer.parseInt(c3);
        	//case 2: return Integer.parseInt(c5);
        	//case 3: return Integer.parseInt(c7);
        default: return 0;
        }
	}
}
