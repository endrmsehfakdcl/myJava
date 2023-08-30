package exam07;

import java.util.Objects;

public class Student {
	public String name;
	public int sno;

	public Student(String name, int sno) {
		this.name = name;
		this.sno = sno;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name, sno);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass()) 
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && sno == other.sno;
//	}

	public boolean equals(Object obj) { 
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) & (name == student.name);
		}
		return false;
	}

	public int hashCode() {
		return sno + name.hashCode();
	}

}
