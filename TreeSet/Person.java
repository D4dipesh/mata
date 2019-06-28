import java.io.Serializable;

public class Person implements Serializable, Comparable<Person> {
	int id;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Person P) {
		if ((this.name.compareTo(P.name))>1)
		{
			return 1;
		}
		if ( (this.name.compareTo(P.name))<1) {
			return -1;
		}
		else
		return 0;
	}

}
