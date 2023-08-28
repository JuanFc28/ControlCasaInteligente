

public class PlayStation {
    String location;

	public PlayStation(String location) {
		this.location = location;
	}

    public void on(){
        System.out.println("\n" +location + " PS5 is on");
    }

    public void off(){
        System.out.println("\n" +location + " PS5 is off");
    }
}
