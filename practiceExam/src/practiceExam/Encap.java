package practiceExam;

public abstract class Encap {
//	@SuppressWarnings("unused")
	private int id;
	
	Encap(){
		setId(0);
	}
	

	public abstract int getId();

	public void setId(int id) {
		this.id = id;
	}
}
