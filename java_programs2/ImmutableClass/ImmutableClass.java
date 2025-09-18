package ImmutableClass;

public final class ImmutableClass {
	
	private final int id;
	private final String name;
	private final String standard;
	
	public ImmutableClass(int id, String name, String standard) {
		this.id = id;
		this.name = name;
		this.standard = standard;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStandard() {
		return standard;
	}
	
	
	 @Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}

	public static void main(String[] args) {
		 ImmutableClass ic1= new ImmutableClass(1, "Vaibhav", "MBA");
		 ImmutableClass ic2= new ImmutableClass(2, "Sarang", "IT");
		 
		 // ic1.id = 3; we can not change the value of id because it's a final.
		 		 
		 System.out.println(ic1);
		 System.out.println(ic2);
	 }
	

}
