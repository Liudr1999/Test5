package iostudent;

import java.io.*;
import java.util.Scanner;


public class Test {
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		Student stu = new Student();
		File source = new File("C:\\Users\\Administrator\\Desktop\\B.txt");
		File target  = new File("C:\\Users\\Administrator\\Desktop\\A.txt");
//		FileReader source = new FileReader("C:\\Users\\Administrator\\Desktop\\B.txt");
//		FileWriter target  = new FileWriter("C:\\Users\\Administrator\\Desktop\\A.txt");
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("---������ѧ����Ϣ---");
			System.out.println("������");
			stu.name= reader.next();				
			System.out.println("ѧ�ţ�");
			stu.id= reader.nextInt();				
			System.out.println("�Ա�");
			stu.sex= reader.next();				
			System.out.println("�༶��");
			stu.sclass= reader.next();				
			System.out.println("��ѧ��������Ϣ�ѳɹ��ύ����ҵ�ĵ���");
			
		    Writer out = new FileWriter(target,true);
		    Reader in = new FileReader(source);
		    BufferedWriter win = new BufferedWriter(new FileWriter(target));  
		    StringBuffer sBuffer =new StringBuffer();
		    win.write("-----------ѧ����Ϣ-----------");
		    win.newLine();
		    win.write("ѧ�ţ�"+stu.id+"\t");
		    win.newLine();
		    win.write("������"+stu.name+"\t");
		    win.newLine();
		    win.write("�Ա�"+stu.sex+"\t");
		    win.newLine();
		    win.write("�༶��"+stu.sclass+"\t");
		    win.newLine();
		    win.newLine();
		    win.write("��ҵ���ݣ�");
		    win.newLine();

		    int a = (int)source.length();
		    char[] chg = new char[a];
		    while((in.read(chg))!=-1) {
		    	win.write(chg,0,7);
		    	win.write(",");
		    	win.write(chg,7,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,14,7);
		    	win.write(",");
		    	win.write(chg,21,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,28,7);
		    	win.write(",");
		    	win.write(chg,35,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,42,7);
		    	win.write(",");
		    	win.write(chg,49,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,56,7);
		    	win.write(",");
		    	win.write(chg,63,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,70,7);
		    	win.write(",");
		    	win.write(chg,77,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,84,7);
		    	win.write(",");
		    	win.write(chg,91,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,98,7);
		    	win.write(",");
		    	win.write(chg,105,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,112,7);
		    	win.write(",");
		    	win.write(chg,119,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,126,7);
		    	win.write(",");
		    	win.write(chg,133,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,140,7);
		    	win.write(",");
		    	win.write(chg,147,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,154,7);
		    	win.write(",");
		    	win.write(chg,161,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,168,7);
		    	win.write(",");
		    	win.write(chg,175,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,182,7);
		    	win.write(",");
		    	win.write(chg,189,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,196,7);
		    	win.write(",");
		    	win.write(chg,203,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,210,7);
		    	win.write(",");
		    	win.write(chg,217,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,224,7);
		    	win.write(",");
		    	win.write(chg,231,7);
		    	win.write("��");
		    	win.newLine();
		    	win.write(chg,238,7);
		    	win.newLine();
		    }
		    win.newLine();
	        win.flush();
	        win.append(sBuffer.toString());
	        win.close();
		}
		catch(Exception e) {
			System.out.println("Error"+e);
			reader.close();
		}	
		
	}
	
	private static BufferedWriter BufferedReader(FileWriter target) {
		// TODO Auto-generated method stub
		return null;
	}

	private static BufferedReader BufferedReader(FileReader source) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
