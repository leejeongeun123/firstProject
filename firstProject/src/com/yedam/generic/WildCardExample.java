package com.yedam.generic;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		//Course<Student>, Course<HighStudent>
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		//super worker클래스포함, 상위클래스만 등록가능 Course<Worker>, Course<Person>
	
	}
		public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
//		crsWorker.add(new Person("일반인2"));
		crsWorker.add(new Worker("직장인2"));
		
		Course<Student> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생2"));
		crsStudent.add(new HighStudent("고등학생2"));		
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
		crsHighStudent.add(new HighStudent("고등학생3")); 
		
		//일반인 등록가능. Course<?> //모든클래스..
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);

		//직장인 등록가능. Course<? super Worker>
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
//		registerCourseWorker(crsStudent);
//		registerCourseWorker(crsHighStudent);
		
		// 학생 등록가능.Course<? extends Student>
//		registerCourseStudent(crsPerson);
//		registerCourseStudent(crsWorker);
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		// 고등학생 가능.
			
		}
}
