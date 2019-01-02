package sandeliukas;

import cucumber.api.PendingException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TempRunner {


		public static void main(String[] args) {
			try {
				Runtime.getRuntime().exec("java -jar Sandeliukas.jar",null, new File("C:\\Users\\IBM_ADMIN\\Sandeliukas\\out\\artifacts\\Sandeliukas_jar"));
				System.out.println("Done!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

