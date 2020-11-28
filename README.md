# Test5
计G202 刘冬蕊 2020322114

# 一、实验目的
1、掌握字符串String及其方法的使用  
2、掌握文件的读取/写入方法  
3、掌握异常处理结构  

# 二、实验要求
1、设计学生类（可利用之前的）；  
2、采用交互式方式实例化某学生；  
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  

# 三、实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。文件A包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2、允许提供输入参数，统计古诗中某个字或词出现的次数  
3、输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A  
4、考虑操作中可能出现的异常，在程序中设计异常处理程序  

# 四、实验过程
1、阅读实验要求，明确编写内容；  
2、根据实验的要求，完成代码；  
3、检查不合理的地方，并完善代码；  
4、运行代码，实验结束。  

# 五、核心代码
1、定义输出流和输入流的目的地  
```
		File source = new File("C:\\Users\\Administrator\\Desktop\\B.txt");
		File target  = new File("C:\\Users\\Administrator\\Desktop\\A.txt");
```  

2、交互式实例化学生类  
```
      Student stu = new Student();
      System.out.println("姓名：");
			stu.name= reader.next();				
			System.out.println("学号：");
			stu.id= reader.nextInt();				
			System.out.println("性别：");
			stu.sex= reader.next();				
			System.out.println("班级：");
			stu.sclass= reader.next();
```  

3、分别定义指向源和目的地的输入输出流，使用BufferedWriter流将数据写到目的地，并构造一个空的字符串缓冲区  
```
        Writer out = new FileWriter(target,true);         //指向目的输出流
		    Reader in = new FileReader(source);               //指向源的输入流
		    BufferedWriter win = new BufferedWriter(new FileWriter(target));       
		    StringBuffer sBuffer =new StringBuffer();
```  

4、在A中写入学生的基本信息  
```
        win.write("学号："+stu.id+"\t");
		    win.newLine();
		    win.write("姓名："+stu.name+"\t");
		    win.newLine();
        ……
```  

5、定义一个字符型数组，a为B中内容的长度。分别从chg数组中截取7句一个“，”，14句一个“。”，以此类推。  
```
        int a = (int)source.length();
		    char[] chg = new char[a];
        while((in.read(chg))!=-1) {
		    	win.write(chg,0,7);
		    	win.write(",");
		    	win.write(chg,7,7);
		    	win.write("。");
		    	win.newLine();
          ……
        }
```  

6、异常处理
```
    try{
      System.out.println("---请输入学生信息---");
      ……
    }
		catch(Exception e) {
			System.out.println("Error"+e);
			reader.close();
		}
```  

# 六、实验结果
1、显示学生的基本信息  
！[image text](https://github.com/Liudr1999/Test5/blob/main/1.JPG)  
  
2、写入A中的信息  
！[image text](https://github.com/Liudr1999/Test5/blob/main/2.JPG)  
  
3、异常处理  
！[image text](https://github.com/Liudr1999/Test5/blob/main/3.JPG)  
  
# 七、实验感想
在本次实验中，我运用了输入输出的知识，去实现从一个文件中提取数据，然后再写入另一个文件中。实验中我面临最大的困难就是在古诗的输入和输出之中，经过查阅课本和上网找资料都不能让我理解是如何实现的，于是我便找了其他已经做出来的同学给我讲解，后再经查书便懂了一些。我发现我的循环并不能够运用的很好，尤其是在古诗的分隔处，是用来一个很笨的方法，不过最终还是实现了出来。
