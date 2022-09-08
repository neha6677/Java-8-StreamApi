package streamapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student
{
	int rollno;
	LocalDateTime date_of_addmission,dob;
	int maths, physics, chemistry, English, hindi; // marks in subjects
	String classname;
	
	
	public Student(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}


	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}


	public LocalDateTime getDob() {
		return dob;
	}


	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getPhysics() {
		return physics;
	}


	public void setPhysics(int physics) {
		this.physics = physics;
	}


	public int getChemistry() {
		return chemistry;
	}


	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}


	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		English = english;
	}


	public int getHindi() {
		return hindi;
	}


	public void setHindi(int hindi) {
		this.hindi = hindi;
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English=" + English + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}
	
	
		
}
public class StudentMarksInformation {

	public static void main(String[] args) {
		
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime doa = LocalDate.parse("20110312", formatter).atStartOfDay();
		LocalDateTime date_ob = LocalDate.parse("19930406", formatter).atStartOfDay();
		
		Student s1 = new Student(101, doa, date_ob, 67, 65, 78, 76, 49, "class10th");
		Student s2 = new Student(102, doa, date_ob, 34, 54, 34, 23, 21, "class10th");
		Student s3 = new Student(103, doa, date_ob, 88, 45, 34, 76, 49, "class10th");
		Student s4 = new Student(104, doa, date_ob, 85, 88, 78, 76, 76, "class10th");
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4);
		
		
		
		int avg1 =(s1.getMaths()+s1.getPhysics()+s1.getChemistry()+s1.getEnglish()+s1.getHindi()/5);
		int avg2 =(s2.getMaths()+s2.getPhysics()+s2.getChemistry()+s2.getEnglish()+s2.getHindi())/5;
		int avg3 =(s3.getMaths()+s3.getPhysics()+s3.getChemistry()+s3.getEnglish()+s3.getHindi())/5;
		int avg4 =(s4.getMaths()+s4.getPhysics()+s4.getChemistry()+s4.getEnglish()+s4.getHindi())/5;
		
		HashMap< Student, Integer	> hm = new HashMap<>();
		hm.put(s1, avg1);
		hm.put(s2, avg2);
		hm.put(s3, avg3);
		hm.put(s4, avg4);
		
		//Student key = Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
		List<Student> list1= hm.entrySet().stream().filter(e->e.getValue()<40).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("students who’s total marks are less than 40%.");
		System.out.println(list1);
		
		
		System.out.println(" students who scored more than 75% in any \r\n"
				+ "of 3 subjects.\r\n"
				+ "");
		

		int [] marksfors1= {s1.getMaths(),s1.getPhysics(), s1.getChemistry(),s1.getEnglish(),s1.getHindi()};
		int temp;
		int len =marksfors1.length;
for(int i=0;i<marksfors1.length;i++) {
			
			for(int j=i+1;j<marksfors1.length;j++) {
			
			if(marksfors1[i]>marksfors1[j]) {
				temp=marksfors1[i];
				marksfors1[i]=marksfors1[j];
				marksfors1[j]=temp;
			}
		}
		}
		//System.out.println("Third-max number is "+marksfors1[len-3]);
	//	System.out.println("second-max number is "+marksfors1[len-2]);
	//	System.out.println("max number is "+marksfors1[len-1]);
		//Student s = new  Student(s1.getRollno(),marksfors1[len-1],marksfors1[len-2],marksfors1[len-3],);
		int [] marksfors2= {s2.getMaths(),s2.getPhysics(), s2.getChemistry(),s2.getEnglish(),s2.getHindi()};
		int [] marksfors3= {s3.getMaths(),s3.getPhysics(), s3.getChemistry(),s3.getEnglish(),s3.getHindi()};
		int [] marksfors4= {s4.getMaths(),s4.getPhysics(), s4.getChemistry(),s4.getEnglish(),s4.getHindi()};
		
		//(Students.get(i).(getg1(),getg2(),getg3()) < studentMinGrade.(getg1(),getg2(),getg3());
		
		
		System.out.println("students who scored more than 75% in all \r\n"
				+ "subject");
		List<Student> list2= 
				list.stream().filter(e->e.getChemistry()>75 &&e.getEnglish()>75 && e.getHindi()>75 && e.getMaths()>75 && e.getPhysics() >75).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("e students who are fail in at least one subject. ");
		
		List<Student> list3= 
				list.stream().filter(e->e.getChemistry()<35 || e.getEnglish()<35 || e.getHindi()<35 || e.getMaths()<35 || e.getPhysics() <35).collect(Collectors.toList());
		System.out.println(list3);
		
		List<Student> list4= hm.entrySet().stream().filter(e->e.getValue()>40).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("students who’s promoted to next class.");
		System.out.println(list4);
		
		long count = list.stream().filter(e->e.getChemistry()<35 || e.getEnglish()<35 || e.getHindi()<35 || e.getMaths()<35 || e.getPhysics() <35).count();
		//System.out.println(count);
		if(count==2) {
			List<Integer> promoted = list.stream().filter(e->e.getChemistry()<35 || e.getEnglish()<35 || e.getHindi()<35 || e.getMaths()<35 || e.getPhysics() <35).map(x->x.getRollno()).collect(Collectors.toList());
			System.out.println("number of y students need to give exam in two subjects to promoted \r\n"
					+ "to another class "+count+ "..........."+promoted);
			
		}
		
		
	}

}
