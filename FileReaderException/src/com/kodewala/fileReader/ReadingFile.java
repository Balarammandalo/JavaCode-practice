package com.kodewala.fileReader;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadingFile fileReader = new ReadingFile();
		fileReader.readerFile();
	}
	public void readerFile() {
		String fileData = "D:\\javaKodewala\\FileReaderException\\src\\com\\kodewala\\fileReader\\userData.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileData));
			String line;
			while ((line= br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
