package нд╪Ч;
import java.io.*;
import java.util.ArrayList;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String jaja=null;


 escribir();

}


	
	
	
static ArrayList<String> valor=new ArrayList<String>() ;
	
	static void leer()  {
		
		FileReader fichero;
		
		try {
			
			fichero=new FileReader("E:/desktop/jaja.txt");
			
			 BufferedReader linea=new  BufferedReader(fichero);
			 String esta="";
			 int i=0;
			 while(esta!=null) {
			valor.add(linea.readLine());
			esta=valor.get(i);
			i++;
			 }
			linea.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	static void escribir() {
		FileWriter fichero;
		try {
			fichero=new FileWriter("E:/desktop/jaja.t");
		BufferedWriter linea=new BufferedWriter(fichero);
		
		String meter="jjjjj";
		for(int i=0;i<valor.size()-1;i++) {
			
			meter=valor.get(i);
			
			linea.write(meter);
			
			linea.newLine();
		}
		linea.flush();
		linea.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
