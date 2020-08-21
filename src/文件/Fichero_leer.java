package 文件;
import java.io.*;
import java.util.ArrayList;
public class Fichero_leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	leerfichero();
		leerlinea();
		
	
	
		
	}
	
	//reader 只能读取   Unicode 为基础的文件   比如 JSON, XML, TXT 
	//FileReader读取数据 carácter a carácter
	
	static void leerfichero(){
		try {
		FileReader fichero=new FileReader("E:desktop/jaja.txt");

		int numero=0;
		while ( numero !=-1) {//  如果不是-1就表示还有内容，可以继续读取
			numero=fichero.read();// 这里返回的是ASII里面的数字， 每个数字代表一个字母
								// read()返回的是数字
			char letra=(char)numero;
			
			System.out.println(letra);
		}
		fichero.close(); //cerramos el fichero
		}
	catch(IOException e) {
		
		}	
	}
	
	static ArrayList<String> linealist=new ArrayList<String>();
 static void leerlinea() {
	 try {
		 
		//   BufferedReader fichero=new BufferedReader(new FileReader("E:desktop/jaja.txt"));//因为consrucot de  BufferedReader 
		   																					//需要parametro de entrada de clase
		   																			//reader , 而FileReader继承了reader
		   																			//而且FileReader可以直接看fichero
		   																			//然后fichero 存在  BufferedReader里面，接下来我们可以直接用它的objeto来操作
		   String linea="";																
																								
		   BufferedReader fichero2=new BufferedReader(new FileReader("E:desktop/jeje.txt"));	
		   
		   
		   /*当出现乱码时我们可以放一个 FileInputStream 来读取 
		    * BufferedReader reader = new BufferedReader(
        		new InputStreamReader(new FileInputStream(file), "utf-8"));
		    */

		/*	
			char uno='2';
			int numero=0;
			while ( numero!=-1) {// 因为要重复的没有行为止，没有行就是null
				 numero=fichero.read();
				uno=(char)numero;
				// read();返回 的是数字，所以我们要用一个casting把ASII数字转成字符
	
				System.out.println(uno);
			}
			fichero.close(); //cerramos el fichero
			*/
		   
			while ( linea!=null) {// 因为要重复的没有行为止，没有行就是null
							//因为fichero2.readLine();返回的是string ，string没有什么时就是null
			linea=fichero2.readLine();
			//readLine()返回 的是字符串
				System.out.println(linea);
	
			}
			fichero2.close(); //cerramos el fichero
			}
		catch(IOException e) {
			
			}
 }
}


		
	
	

