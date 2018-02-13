abstract class Application {
	void audio() {
		System.out.println("You can listen good quality of audio");
	}

	void video() {
		System.out.println("You can watch 340 mpixel video");
	}

	abstract void hdVideo();
}

class OpenSource extends Application {
	void hdVideo() {

	}
}

class Commercial extends Application {
	void hdVideo() {
		System.out.println("you can watch hd video");
	}
}

public class Sample {
	public static void main(String[] args) {
		OpenSource n = new OpenSource();
		n.audio();
		n.video();
		Commercial ge = new Commercial();
		ge.audio();
		ge.hdVideo();
	}
}
