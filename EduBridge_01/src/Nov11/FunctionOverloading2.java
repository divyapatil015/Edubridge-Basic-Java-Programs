package Nov11;



public class FunctionOverloading2 {
void add(int i,int j) {
System.out.println("Sum of int "+i+" and "+j+" is : "+(i+j));
}
void add(float i,float j) {
System.out.println("Sum of float "+i+" and "+j+" is : "+(i+j));
}
void add(double i,double j) {
System.out.println("Sum of double "+i+" and "+j+" is : "+(i+j));
}
void add(byte i,byte j) {
System.out.println("Sum of byte "+i+" and "+j+" is : "+(i+j));
}
void add(short i,short j) {
System.out.println("Sum of short "+i+" and "+j+" is : "+(i+j));
}
void add(long i,long j) {
System.out.println("Sum of long "+i+" and "+j+" is : "+(i+j));
}
public static void main(String[] args) {
// TODO Auto-generated method stub
FunctionOverloading2 obj1=new FunctionOverloading2();
obj1.add(1, 4);
obj1.add(2.5f, 4.8f);
obj1.add(10.3, 44.2);
obj1.add((byte)8, (byte)11);
obj1.add((short)42, (short)23);
obj1.add(9l, 8l);
}


}
