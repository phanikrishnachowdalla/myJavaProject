package com_package;

class A {
    void m1(){
    System.out.println("CLASS A");
    }
}
class B extends A{
    void m2(){
    System.out.println("CLASS B");
    }
}
class C extends B{
    void m3(){
    System.out.println("CLASS C");
    }
}
class D extends C{
    void m4(){
    System.out.println("CLASS D");
    }
}
class E extends D{
    void m5(){
    System.out.println("CLASS E");
    }
}
class First{ 
	public static void main(String[] args) {
		E obj1=new E();
		obj1.m5();
		
	}
}