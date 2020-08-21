package 文件;
import java.io.*;
public class Fichero_escribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escribir_uno();
		//escribir_linea();
		//escribir_saltarlinea();
	}

	static void escribir_uno() {
		//Escritura de fichero carácter a carácter:
		
		
			        FileWriter fichero = null;
			    String sitio="E:/desktop/jeje.txt";
			   //如果该前目录没有这个文件，那么会自动建造一个
			    
			        try {
			        	
			            fichero = new FileWriter(sitio);// 这个样子的话要是有这个文件，会把它 的内容给覆盖
			         //   fichero =  new FileWriter(sitio,ture)// 加了true之后，不会把原文件覆盖只会在它后面添加
			            String linea = "Esto es una prueba de escritura";
			            for (int i = 0; i < linea.length(); i++){
			                fichero.write(linea.charAt(i));
			                
			            }
			            
			            //Cerramos el fichero
			            fichero.close();
			            
			        } catch (IOException e) {
			            e.printStackTrace();
			        } 
			        
			
	}
	static void escribir_linea() {
		//Escritura de fichero linea a linea
		
		
			        FileWriter fichero = null;
			    String sitio="E:/desktop/jeje.txt";
			   //如果该前目录没有这个文件，那么会自动建造一个
			    
			        try {
			        	
			            fichero = new FileWriter(sitio);// 这个样子的话要是有这个文件，会把它 的内容给覆盖
			         //   fichero =  new FileWriter(sitio,ture)// 加了true之后，不会把原文件覆盖只会在它后面添加
			            String linea = "Esto es una prueba de escritura";
			           
			            
			            // 和carácter a carácter不一样的是，上面那个是一个字一个字写，效率慢，这个是直接写很多
			            for (int i = 0; i < 5; i++){//这样子的话一共写5 行，
			            							//但是这5行内容，会出现在同一行上，
			            	
			                fichero.write(linea);
			               
			            }
			            
			            //Cerramos el fichero
			            fichero.close();
			            
			        } catch (IOException e) {
			            e.printStackTrace();
			        } 
			        
			
	}
	static void escribir_saltarlinea() {
		//Escritura de fichero linea a linea
		
			        FileWriter fichero = null;
			    String sitio="E:/desktop/jeje.txt";
			   //如果该前目录没有这个文件，那么会自动建造一个
			    
			        try {
			        	fichero = new FileWriter(sitio);
			        	BufferedWriter linea=new BufferedWriter(fichero);
			       String contenido = "Esto es una prueba de escritura";
			   
			           
			            for (int i = 0; i < 5; i++){
			            	
			                linea.write(contenido);
			               linea.newLine(); //Hace un salto de línea en el fichero
			               
			            }
			           linea.flush(); //Hace la carga del buffer al fichero//冲刷出流，将所有缓冲的数据强制发送到目的地。
			          /*  //当我们将数据预存到缓冲池中时，当数据的长度满足缓冲池中的大小后，才会将缓冲池中的数据成块的发送
			           ，若数据的长度不满足缓冲池中的大小，需要继续存入，待数据满足预存大小后再成块的发送。往往在发送文件过程中，文件末尾的数据大小不能满足缓冲池的大小
			           。最终导致这部分的数据停留在缓冲池无法发送。

//这时，就需要我们在write()方法后，手动调用flush()方法，强制刷出缓冲池中的数据，（即使数据长度不满足缓冲池的大小）从而保证数据的正常发送*/


			            //Cerramos el fichero
			            fichero.close();//冲刷并关闭输出流
			            
			        } catch (IOException e) {
			            e.printStackTrace();
			        } 
			        
			
	}
}
