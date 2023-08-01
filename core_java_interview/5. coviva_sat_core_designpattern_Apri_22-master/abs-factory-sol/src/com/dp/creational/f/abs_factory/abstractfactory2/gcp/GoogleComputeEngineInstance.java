package com.dp.creational.f.abs_factory.abstractfactory2.gcp;

import com.dp.creational.f.abs_factory_prob.Instance;
import com.dp.creational.f.abs_factory_prob.Instance.Capacity;
import com.dp.creational.f.abs_factory_prob.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        //Map capacity to GCP compute instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}
