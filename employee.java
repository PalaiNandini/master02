class Employee
{
String name;
int salary;
int age;
Employee()
{
name="zzz";
salary=0;
age=1;
}
Employee(String nm,int x,int i)
{
name=nm;
salary=x;
age=i;
}
public void read()
{
System.out.println("employee name"+name);
System.out.println("employee salary"+salary);
System.out.println("employee age"+age);
}
public void show()
{
System.out.println("[name="+name+",salary= "+salary+",age="+age+"]");
}
}
class Employee2
{
public static void main(String args[]){
Employee e=new Employee();

e.show();
Employee e1=new Employee("nandini",24,43);
e1.show();
}

}
