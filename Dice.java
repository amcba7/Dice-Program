class Dice extends AbstractCube {
	Face [] n = {new One(), new Two(),new Three(),new Four(),new Five(),new Six()};
	public Dice() {
		roll();
	}
	public void show() {
		if (getSide()==1) {
			System.out.println("1");
			n[0].show();
		} else if (getSide()==2) {
			System.out.println("2");
			n[1].show();
		} else if (getSide()==3) {
			System.out.println("3");
			n[2].show();
		} else if (getSide()==4) {
			System.out.println("4");
			n[3].show();
		} else if (getSide()==5) {
			System.out.println("5");
			n[4].show();
		} else if (getSide()==6) {
			System.out.println(6);
			n[5].show();
		} else {
			System.out.println("invalid input");
		}
	}
}