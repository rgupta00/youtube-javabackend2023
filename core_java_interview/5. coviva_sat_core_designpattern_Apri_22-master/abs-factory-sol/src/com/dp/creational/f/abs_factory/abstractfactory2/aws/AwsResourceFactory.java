package com.dp.creational.f.abs_factory.abstractfactory2.aws;

import com.dp.creational.f.abs_factory_prob.Instance;
import com.dp.creational.f.abs_factory_prob.Instance.Capacity;
import com.dp.creational.f.abs_factory_prob.ResourceFactory;
import com.dp.creational.f.abs_factory_prob.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}
}
