package idv.jack.spark.client.test;

import org.apache.spark.launcher.SparkLauncher;

public class SparkLauncherTest {
	
	public static void main(String args[]){
		try{
			SparkLauncher launcher = new SparkLauncher();
			
			
			
			launcher.launch();
		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
