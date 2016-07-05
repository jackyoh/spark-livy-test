package idv.jack.test;

import java.util.ServiceLoader;

import org.junit.Test;

import com.cloudera.livy.LivyClientFactory;

public class ServiceLoaderTest {

	@Test
	public void testLoader(){
		ServiceLoader<LivyClientFactory> loaders = ServiceLoader.load(LivyClientFactory.class,
			      classLoader());
		
		for(LivyClientFactory loader : loaders){
			System.out.println(loader);
		}
		
	}
	private ClassLoader classLoader() {
	    ClassLoader cl = Thread.currentThread().getContextClassLoader();
	    if (cl == null) {
	      cl = getClass().getClassLoader();
	    }
	    return cl;
	}
}
