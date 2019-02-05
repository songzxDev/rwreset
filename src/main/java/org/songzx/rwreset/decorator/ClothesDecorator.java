package org.songzx.rwreset.decorator;

public abstract class ClothesDecorator implements Person {

	//装饰器中要使用被装饰器的对象，构造方法中传入
    protected Person person;

    public ClothesDecorator(Person person){
        this.person = person;
    }

}
