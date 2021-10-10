package Java08;

class CBox {
	int length;
	int width;
	int height;

	int volume() {
		return length * width * height;
	}

	int surfaceArea() {
		return 2 * ((length * width) + (length * height) + (width * height));
	}

	void showData() {
		System.out.println("length=" + length);
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}

	void showAll() {
		showData();
		System.out.println("surface area=" + surfaceArea());
		System.out.println("volume=" + volume());
	}
}

public class Class05 {

	public static void main(String[] args) {
		CBox box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showAll();

	}

}
