

import Animals.*;
import Food.*;

public class Worker {
	
	public void getVoice(Animals animals) {
		animals.voice();
	}
	public void feed(Animals animals,Food food) {
		animals.eat(food);

	}

}
