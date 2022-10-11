package collectionassignment.person;

public class Person implements Comparable<Person> {

	int pid;
	String name;
	int salary;

	public Person() {
		super();
	}

	public Person(int pid, String name, int salary) {
		super();
		this.pid = pid;
		this.name = name;
		this.salary = salary;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Person person) {

		return this.name.compareTo(person.name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Person person = (Person) o;

		if (pid != person.pid) {
			return false;
		}

		if (name != null ? !name.equals(person.name) : person.name != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + salary;
		return result;
	}

}
