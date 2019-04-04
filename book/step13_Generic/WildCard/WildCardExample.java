package step13_Generic.WildCard;

import java.util.Arrays;


public class WildCardExample {
	public static void registerCourse( Course<?> course) { // 모든 타입이 타입 파라미터로 올 수 있음 
		// Arrays.toString -> 배열이 참조하고 있는 값을 String 타입으로 참조하는 메소드 
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) { // Student, HighStudent 만 타입 파라미터 가능 
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) { // Worker, Person 타입이 파라미터로 가능 
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
		
	public static void main(String[] args) {
		// 객체 생성 
		Course<Person> personCourse = new Course<Person>("일반인과정",5);
		// 배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드 호출 
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정",5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		// 모든 타입이 타입 파라미터로 올 수 있음. 즉 모든 수강생이 등록 가능 
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		 // Student, HighStudent 만 타입 파라미터 가능. Person, Worker객체는 사용 불가 
		//registCourseStudent(personCourse);
		//registCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		
		// Worker, Person 타입이 파라미터로 가능. Student, HighStudent 객체 이용 불가 
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
	//	registerCourseWorker(studentCourse);
	//	registerCourseWorker(highStudentCourse);
	}

}
