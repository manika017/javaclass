
public class Disk {

	private int size;
	
	Disk(int size){
		this.size = size;
	}
	
	public void draw() {
		for(int i=0; i<size; i++) {
			System.out.println("-"); //we use print so that the next one will draw on the same line
		}
		System.out.println(""); //will move to the next line
	}
	
}
