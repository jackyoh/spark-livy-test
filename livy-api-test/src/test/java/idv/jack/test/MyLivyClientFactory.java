package idv.jack.test;

import java.net.URI;
import java.util.Properties;

import com.cloudera.livy.LivyClient;
import com.cloudera.livy.LivyClientFactory;

public class MyLivyClientFactory implements LivyClientFactory{

	@Override
	public LivyClient createClient(URI arg0, Properties arg1) {
		return null;
	}

}
