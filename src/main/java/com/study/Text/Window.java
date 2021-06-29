package com.study.Text;

//Window是抽象产品， WindowBig&WindowSmall是具体产品
public abstract class Window {
    public abstract void func();
}
class WindowBig extends Window {
    public void func() {
        System.out.println("This is Big Window !");
    }
}
class WindowSmall extends Window {
    public void func() {
        System.out.println("This is Small Window !");
    }
}