package sandeliukas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static sandeliukas.Temp.ivestis;
//ToDo: more info http://www.vogella.com/tutorials/JUnit/article.html

class TempTest {


	/*private String ivestis1;*/

	@Test
	public void checkIfInputCanAcceptYOrN() {
		Temp temp = new Temp();
		ivestis= "Y";
		System.out.println(ivestis);
		assertEquals("Y", ivestis);

		assertFalse(ivestis.equals("b"));

	}

	@Test
	public void checkIfInputTrims(){
		Execute execute = new Execute();
		execute.input = "Yyy";
		execute.initialCheck();



	}
}