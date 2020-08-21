package 文件;
import java.io.*;
import java.util.Scanner;
public class binarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
leer();
sacar();
	}

	//可以打开任何形式的文件，因为用的是二进制的方法。
	
	static void leer() {
		
		 try {
			FileInputStream Entrada = new FileInputStream("E:/desktop/前三名/Heaven7w.exe");
			int numero=0;
			while(numero!=-1) {
			numero=Entrada.read();
			System.out.println(numero);
			}
			Entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	static void sacar() {
		Scanner sc=new Scanner(System.in);
		try {
			FileInputStream Entrada = new FileInputStream("E:/desktop/前三名/Heaven7w.exe");
			FileOutputStream salida=new FileOutputStream("E:/desktop/jaja.exe");
		
			  BufferedInputStream leer= new BufferedInputStream(Entrada);
		        BufferedOutputStream escritor= new BufferedOutputStream(salida);
			int salir=0;
		
			while((salir=leer.read())!=-1) {// 因为当这个文件最后一个没有时候返回 -1
				
				System.out.println(salir);
				escritor.write(salir);
			
				
			}
			leer.close();
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
}
