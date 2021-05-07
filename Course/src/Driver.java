
public class Driver {

	public static void main(String[] args) {
		// 교과목 
		Course algo = new Course("알고리즘", 30, 4);
		Course zaryo = new Course("자료구조", 25, 3);
		
		System.out.println("수강 신청전\n");
		
		System.out.println("교과목명     최대 학생수     현재 학생수");
		System.out.println(algo.toString());
		System.out.println(zaryo.toString());
		
		algo.inCourseMax(6);
		zaryo.inCourseMax(3);
		
		System.out.println("\n수강 인원 증원후\n");
		System.out.println("교과목명     최대 학생수     현재 학생수");
		System.out.println(algo.toString());
		System.out.println(zaryo.toString());
		System.out.println("\n생성된 교과목들의 수: " + algo.getCourseNum() + "\n");
		// 학생
		Student std1 = new Student(2101, "선남", 18);
		Student std2 = new Student(2102, "선녀", 21);
		Student std3 = new Student(2103, "길동", 18);
		
		System.out.println("학번     이름     신청 학점수");
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString()+"\n");
		
		register r1 = new register(std1, algo);
		register r2 = new register(std2, algo);
		register r3 = new register(std2, zaryo);
		register r4 = new register(std3, algo);
		register r5 = new register(std3, zaryo);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(r5.toString()+"\n");
		
		System.out.println("수강 신청후\n");
		System.out.println("교과목명     최대 학생수     현재 학생수");
		System.out.println(algo.toString());
		System.out.println(zaryo.toString() + "\n");
		
		System.out.println("학번     이름     학점수");
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());
	}

}
