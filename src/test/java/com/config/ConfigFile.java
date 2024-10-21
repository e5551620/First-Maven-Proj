package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.search;

public class ConfigFile {
	
	static String filepath = System.getProperty("user.dir");
	static Properties prop  = new Properties();
	public static void main(String args[]) throws Exception{
		getValue();
		//setValue();
	}
	
	public static void getValue() throws Exception{
		
		
		InputStream input = new FileInputStream(filepath+"/src/test/java/com/config/config.properties");
		prop.load(input);
		//System.out.println(prop.getProperty("fburl"));
		search.fburl = prop.getProperty("fburl");
	}
	public static void setValue() throws Exception{
		OutputStream out = new FileOutputStream(filepath+"/src/test/java/com/config/config.properties");
		prop.setProperty("browser", "Chrome");
		prop.store(out, null);
	}

}
