package нд╪Ч;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class prueba {
	public static void main(String[] args) {
		
        String sitio="E:desktop/jeje.txt";
        
        
     ArrayList<Character> letra=new ArrayList<Character>();
    	try {
    		FileReader fichero=new FileReader(sitio);
    		int numero=0;
    		while ( numero !=-1) {
    			numero=fichero.read();			
    			
    			letra.add((char)numero);    		}
    		fichero.close(); 
    		}
    	catch(IOException e) {
    		System.out.println("fichero no encontrado");
    		}	
for(char i:letra){
	System.out.println(i);
}
}
}