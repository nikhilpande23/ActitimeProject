package com.actitime.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _3_readDataFromPropertyFile {
	
	public String readDataFromProperty(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
	}

}
