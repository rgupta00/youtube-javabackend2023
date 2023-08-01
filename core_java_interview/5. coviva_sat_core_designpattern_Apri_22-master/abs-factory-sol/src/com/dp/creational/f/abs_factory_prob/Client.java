package com.dp.creational.f.abs_factory_prob;

import com.dp.creational.f.abs_factory.abstractfactory2.aws.AwsResourceFactory;
import com.dp.creational.f.abs_factory.abstractfactory2.gcp.GoogleResourceFactory;
import com.dp.creational.f.abs_factory_prob.Instance.Capacity;

public class Client {
	private ResourceFactory factory;
    public Client(ResourceFactory factory) {
		this.factory = factory;
	}
    public Instance createServer(Instance.Capacity capacity, int storageMib) {
    	Instance instance=factory.createInstance(capacity);
    	Storage storage=factory.createStorage(storageMib);
    	instance.attachStorage(storage);
 
    	return instance;
    }
	public static void main(String[] args) {
    	//we compose classes by using concreate implementation of abs factory
    	
		Client aws=new Client(new AwsResourceFactory());
		Instance instance=aws.createServer(Capacity.micro, 20480);
		instance.start();
		instance.stop();
    	
    	
		Client google=new Client(new GoogleResourceFactory());
		Instance instance2=google.createServer(Capacity.micro, 20480);
		instance2.start();
		instance2.stop();
    }
}
