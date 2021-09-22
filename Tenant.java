package Test4;

import java.util.Random;

public class Tenant {
private String[] names= {"Din","levi","maya","ori"};
private String name;
private int age; 

public Tenant() {
	Random r1=new Random();
	name=names[r1.nextInt(3)];
	age = (r1.nextInt(101)+20);
}


public String getName() {
	return name;
}

public int getAge() {
	return age;
}


}
