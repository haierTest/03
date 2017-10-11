package org.owasp.webgoat.lessons.pathManipulate;

/**  
 * @Title:  Path_Manipulate.java   
 * @Package org.owasp.webgoat.lessons.pathManipulate   
 */


import java.io.File;

public class Path_Manipulate {

	public void bad(){
		
		 String path = System.getProperty("dir");
		 File f = new File(path);  // bad 路径遍历
		 f.delete();	
	}
	
	
	public void good(){
		
		String path = "C:" + File.separator + "test.txt";
		File f = new File(path);  // good 路径遍历
	    f.delete();
	}
	

}
