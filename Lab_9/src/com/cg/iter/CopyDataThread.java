package com.cg.iter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable{
	FileReader fr = null;
	FileWriter fw = null;
	
	public CopyDataThread(FileReader fr, FileWriter fw) {
		this.fr = fr;
		this.fw = fw;
	}

	@Override
	public void run() {
		try {
			int c= fr.read();
			int i = 1;
			while(c!=-1) {
				i++;
				if(i==10) {
					System.out.println("10 charecter are copied");
					Thread.sleep(5000);
					i=1;
				}
				fw.write((char)c);
				c=fr.read();
			}
			fw.close();
			fr.close();
			System.out.println("File copied");
		} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} catch (InterruptedException e) {e.printStackTrace();
		}
	}
}
