class GrandFather {
public void house() { 
System.out.println("3 BHK House.");
}
}
class Father extends GrandFather { 
public void land() {
System.out.println("5 Arcs of Land.");
}
}
class Son extends Father { 
public void Car() {
System.out.println("Own Audi car.");
}
}
class multilevel {
public static void main(String[] args) { 
Son o = new Son();
o.Car();
o.house();
o.land();
}
}