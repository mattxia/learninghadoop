package com.unicsoft.learninghadoop.fs;

import java.io.*;
import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;


public class URLCat {
	static{
		URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream in = null;
		try{
			in=new URL(args[0]).openStream();
			IOUtils.copyBytes(in, System.out, 4096, false);
		}
		finally{
			IOUtils.closeStream(in);
		}

	}

}
