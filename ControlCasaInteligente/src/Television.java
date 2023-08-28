

public class Television {
    String location;

	public Television(String location) {
		this.location = location;
	}

    public void on(){
        System.out.println("\n" +location + " tv is on");
    }

    public void off(){
        System.out.println("\n" +location + " tv is off");
    }
}
