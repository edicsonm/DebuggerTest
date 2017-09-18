package au.com.edimoto;

public class Greeding {

	public Greeding(String name) {
		System.out.println(String.format("Hello %s", name));
	}

	public static void main(String[] args) {
		if (args.length == 1)
			new Greeding(args[0]);
		else
			new Greeding("Edicson");
	}

}
