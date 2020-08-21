package 文件;
import java.io.File;
import java.io.IOException;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File是个文件类
		
		//关于路径
		
		/*可以这样写 ： String sitio="C:\\archivo\\fichero.txt";
		 * 或者  String sitio="C:/archivo/fichero.txt";
		 * 
		 * 所以，一般可以认为是"/"的作用等同于"\\"
			在java中路径一般用"/"。
		windows中的路径一般用"\"（在java中，必须用\\才能表示\，其中一个\是转译作用）。
		linux、unix中的路径一般用"/"
		所以，最好用“/”  因为java是跨平台的。Linux和Unix下都是用“/”，这时候在windwos中用“/”也能识别路径。
			而“\”（在java代码里应该是\\）是windows环境下的路径分隔符，如果java中用了\\会导致linux无法识别。
		
		
		也可以用File.separator 来代替/
		 *("E:"+File.separator+"desktop"+File.separator+"jaja.txt");
		 *
		 */
		
		
		// 
		
		//构造
		 File file1=new File("E:/desktop/jaja.txt");//父路径、子路径--可以适用于多个文件的！
		 System.out.println(file1); //虽然在java里要写/，但是我们输出时因为是在Windows系统所以会写成  E:\desktop\jaja.txt
	
		 // 如果不写父路径，那么就会自动写我们workspace存在的路径
		 File filesin=new File("jajajajajaa");
		 System.out.println(filesin.getAbsolutePath());//E:\desktop\programacion\JAVA\eclipse-workspace\文件\jajajajajaa
		 
		 
		 // 父地址
		 File parent=new File("E://desktop"); //这样子这个地址就会变成父类路径
		 File file3=new File(parent,"jaja.txt");
		 System.out.println(file3);
		 
		 
/////////////////////////////////////////////////////////////////////
		 
	/*	 
		 File file2=new File("E:/desktop/jaja.txt");
		 
		 //是否存在
		 System.out.println(file2.exists());
		 
		   //判断该文件对象是否是文件夹
	        System.out.println(file2.isDirectory());
	        
	        //判断该文件对象是否是文件
	        System.out.println(file2.isFile());
		 
		 //获取文件对象的文件名或者目录名
		 System.out.println(file2.getName());
		 
		 
		 //返回抽象路径名的绝对路径名字符串
		 System.out.println("获取路径"+file2.getAbsolutePath());//为window里一模一样的路径
		 
		//获取文件的大小（字节---Long类型）
		 System.out.println(file2.length());
		 
		 
		//删除文件（找不回来了）
		 System.out.println(file2.delete());
		 
		
		*/
		 
		 File fichero=new File("E:"+File.separator+"desktop"+File.separator+"jaja"+File.separator+"jeje");
		 
	
		// 创建文件 createNewFile()会创建一个新的空文件，只有该文件不存在的时候会创建，如果文件已经存在的话则返回false。
		 
		/* 
		 try {
			System.out.println(fichero.createNewFile()); // 如果存在会显示false，如果没存在会显示true然后创造文件
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		 /**
		 //创建文件夹
		  * .mkdir()
		  //创建目录，成功返回true。只能创建一个文件夹，要求所有的父目录都存在，否则创建失败。
		 System.out.println(fichero.mkdir());// // 如果存在会显示false，如果没存在会显示true然后创造文件
		 
		 
		 .mkdirs()
		// 创建目录，成功返回true，会创建所有不存在的父目录。(注意即便最后创建失败，但是也可能创建了一些中间目录)。
		 System.out.println(fichero.mkdirs());
		// ("E:"+File.separator+"desktop"+File.separator+"jaja"+File.separator+"jeje");
		 //桌面上没有jaja文件，那么会自动创建jaja文件，之后再创建jeje文件
		  	*/
		
		
	/*	 
		 // .list()
		 //返回 array de String 这个文件夹里面全部的内容，如果要访问文件夹里的文件里的内容那么，要先写父路径，比如File file3=new File(parent,"jaja.txt");
		 //这个情况的话父路径就是fichero 
		 // 
		 String[] jaja=fichero.list();
		 
		 for(String i:jaja) {
			 System.out.println(i);
		 }*/
		 
		 
		/** 
		// listFiles   和上面类似但是防护的是un array de File
		 // 就是把里面每一个文件变成 一个file
		 Fle[] jaja=fichero.listFiles();
		 for(File i:jaja) {
			 System.out.println(i.getPath());
			 
		 }
		 */
	}

}
