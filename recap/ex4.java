package recap;



public class ex4 {
	String name;
	int ID;
	
	public ex4(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex4Inter e=ex4::new;
		System.out.println(e.getEx4("mayukh",1));
	}
	@Override
	public String toString() {
		return "ex4 [name=" + name + ", ID=" + ID + "]";
	}

}
