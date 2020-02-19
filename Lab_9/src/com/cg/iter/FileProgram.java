package com.cg.iter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("output.txt");
			FileReader fr = new FileReader("input.txt");
			Runnable r1 = new CopyDataThread(fr, fw);
			ExecutorService es = Executors.newFixedThreadPool(1);
			es.submit(r1);
			es.shutdown();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
