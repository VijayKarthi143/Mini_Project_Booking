package com.helper;

import Configuration.Configuration_Reader;

public class File_Reader_Manager {

	
	private File_Reader_Manager() {
		
	//  Restrict to create obj on other class
		
	}
	
	public static File_Reader_Manager getInstanceFRM() {

		File_Reader_Manager FRM = new File_Reader_Manager();
		return FRM ;
		
		}
	
	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader CR = new Configuration_Reader();
		
		return CR;
	}
	
	
	
}
