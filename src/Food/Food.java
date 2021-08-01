package Food;

public abstract class Food {
 private int hang;
 private String nameFood;


	public Food(int hang, String nameFood) {
		this.hang = hang;
		this.nameFood = nameFood;
	}

	public int getHang() {
		return hang;
	}

	public String getNameFood() {
		return nameFood;
	}

}
