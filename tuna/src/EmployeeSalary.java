class Employee{
Float salary=(float) 40000;
}
class  Programmer extends  Employee{    
int bonus=1000;
public static void main(String args){
Programmer p=new Programmer();
System.out.println("programmer salary is="+p.salary);
System.out.println("Bonus of programmer is="+p.bonus);
}
}