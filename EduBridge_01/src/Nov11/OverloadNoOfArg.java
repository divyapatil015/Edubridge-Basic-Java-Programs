package Nov11;

public class OverloadNoOfArg {
void add(int i, int j) {
int s=i+j;
System.out.println("sum of two int values ="+s);
}

void add(int i, int j, int k) {
int s=i+j+k;
System.out.println("sum of three int values ="+s);
}

public static void main(String[] args) {
OverloadNoOfArg obj = new OverloadNoOfArg();
obj.add(3, 23);
obj.add(3, 23,89);
}


}

