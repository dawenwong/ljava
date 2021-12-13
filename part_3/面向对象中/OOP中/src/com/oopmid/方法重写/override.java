package com.oopmid.方法重写;

/*
 -定义：在子类中可以根据需要对从父类中继承来的方法进行改造，也称为方法的重置、覆盖。
在程序执行时，子类的方法将覆盖父类的方法。
--子类重写的方法必须和父类被重写的方法具有相同的方法名称、参数列表
--子类重写的方法的返回值类型不能大于父类被重写的方法的返回值类型
--子类重写的方法使用的访问权限不能小于父类被重写的方法的访问权限
--子类不能重写父类中声明为private权限的方法
--子类方法抛出的异常不能大于父类被重写方法的异常
-注意：
--子类与父类中同名同参数的方法必须同时声明为非static的（即为重写），
--或者同时声明为static的（不是重写）。因为static方法是属于类的，子类无法覆盖父类的方法。
*/
public class override {

}
