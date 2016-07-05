package idv.jack.livy.client;

import java.util.ArrayList;
import java.util.List;

import com.cloudera.livy.Job;
import com.cloudera.livy.JobContext;

import org.apache.spark.api.java.function.*;

public class PiJob implements Job<Double>, Function<Integer, Integer>,
                                      Function2<Integer, Integer, Integer>{
	private int samples;
	
	public PiJob(int samples){
		this.samples = samples;
	}
	
	
	@Override
	public Double call(JobContext ctx) throws Exception {
		List<Integer> sampleList = new ArrayList<Integer>();
		for(int i = 0 ; i < samples; i++){
			sampleList.add(i + 1);
		}
		return 4.0d * ctx.sc().parallelize(sampleList).map(this).reduce(this) / samples;
	}

	@Override
	public Integer call(Integer v1) throws Exception {
		double x = Math.random();
		double y = Math.random();
		return (x*x + y*y < 1) ? 1 : 0;
	}

	@Override
	public Integer call(Integer v1, Integer v2) throws Exception {
		return v1 + v2;
	}

}
