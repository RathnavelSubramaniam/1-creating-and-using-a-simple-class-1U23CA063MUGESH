class person1
{
    String firstname;
    String lastname;
    int age;
    person1(String fn, String ln, int a)
    {
        firstname = fn;
        lastname = ln;
        age = a;
    }
    String Getfullname()
    {   
        return firstname + " " + lastname;
    }
}
    public class Person
    {
        public static void main(String args[])
        {
           person1 a1 = new person1("Jhon", "Doe", 30);
           person1 a2 = new person1("Alice", "Smith", 25);
           double sum = a1.age + a2.age;
           double average = sum/2;

           System.out.println("person 1:"+a1.Getfullname());
           System.out.println("person 2:"+a2.Getfullname());
           System.out.println("average age:"+average);
        }
    }
