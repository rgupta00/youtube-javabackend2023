package com.dp.creational.f.abs_factory.abstractfactory2.aws;

import com.dp.creational.f.abs_factory_prob.Instance;
import com.dp.creational.f.abs_factory_prob.Instance.Capacity;
import com.dp.creational.f.abs_factory_prob.Storage;

//Represents a concrete product in a family "Amazon Web services"
public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
