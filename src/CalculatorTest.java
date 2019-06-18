import com.sherold.calculator.*;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(1, 2, '-');
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator(1,2,'*');
		
		c1.getResult();
		c2.getResult();
		c3.getResult();

	}

}
