package com.transform.application;

import java.io.File;

public class Processor {

	public static void main(String[] args) {

		Extractor   extractor   = new Extractor();
		Transformer transformer = new Transformer();
		Loader      loader      = new Loader();
		
	//	if (args.length > 0) {
			//String fileName = args[0];
			try {
				File file = new File("C:\\Users\\shawn\\eclipse-workspace\\Optimus\\data\\protocall-small.xlsx");
				if (extractor.extract(file)) {
					if (transformer.transform()) {
						loader.load();
					}	
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
//	}

	}

}
