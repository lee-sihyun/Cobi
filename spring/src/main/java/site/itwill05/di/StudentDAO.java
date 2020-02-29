package site.itwill05.di;

import java.util.List;

//학생정보 관련 DAO 클래스가 반드시 상속받아야 되는 인터페이스
// => 인스턴스 간의 결합도를 낮춰 유지보수의 효율성을 증가 시키기 위해 선언
public interface StudentDAO {
	int insertStudent(Student student);
	Student selectStudent(int num);
	List<Student> selectAllStudent();
}