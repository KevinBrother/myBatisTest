package bat.com.domain;

import java.util.List;

public class Classes {
	
	private int id;
	
	private String name;
	
	private Leader leader;
	
	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + ", leader=" + leader
				+ ", students=" + students + "]";
	}

}
