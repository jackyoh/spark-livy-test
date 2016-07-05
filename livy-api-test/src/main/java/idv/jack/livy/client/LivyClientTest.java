package idv.jack.livy.client;

import java.io.File;
import java.net.URI;

import com.cloudera.livy.LivyClient;
import com.cloudera.livy.LivyClientBuilder;

public class LivyClientTest {

	public static void main(String args[]) throws Exception{
		String livyUrl = "";
		String piJar = "";
		
		LivyClient client = new LivyClientBuilder()
		    .setURI(new URI(livyUrl))
		    .build();
		
		System.out.println("Uploading " + piJar + " to the Spark Context...");
		client.uploadJar(new File(piJar)).get();
		
		System.out.println("Running Pi Job");
		double pi = (double)client.submit(null).get();
		
		System.out.println("Pi is roughly: " + pi);
	}
}
