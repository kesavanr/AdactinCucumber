package com.adactin.utilities;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
	public static FileReaderManager getInstance() {
		FileReaderManager frm = null;
		if(frm == null)
			frm = new FileReaderManager();
		return frm;
	}
	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
