package be.intecbrussel.exercise01;

import be.intecbrussel.exercise01.helpers.HelloHelper;

public class Hello {
    private HelloHelper helper = new HelloHelper();

    public String sayHello(String name){
        return helper.createHelloResponse(name);
    }
}
