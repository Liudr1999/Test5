package iostudent;


public class Student {
	int id;
	String name;
	String sex;
	String sclass;

	public int setId(int id){
		this.id = id;
		return id;
	}
	public String setName(String name){
		this.name=name;
		return this.name;
	}
	public String setSex(String sex){
		this.sex=sex;
		return this.sex;
	}
	public String setClass(String sclass) {
		this.sclass=sclass;
		return sclass;
	}
	void title(){
		System.out.println("----------------------------学生信息--------------------------------");
	}
}