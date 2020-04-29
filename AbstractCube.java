import java.util.Random;
abstract class AbstractCube implements Cube {
	private static Random rand = new Random();
	private int side;
	public int getSide() {
		return side;
	}
	public String toString() {
		return "" + side;
	}
	public void roll() {
		side = rand.nextInt(6)+1;
	}
	public AbstractCube() {
		roll();
	}
}