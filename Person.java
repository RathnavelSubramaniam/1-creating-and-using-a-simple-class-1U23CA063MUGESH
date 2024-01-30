class person1
{
    String Firstname;
    String Lastname;
    int Age;
    person1(String fn, String ln, int a)
    {
        Firstname = fn;
        Lastname = ln;
        Age = a;
    }
    String Getfullname()
    {   
        return Firstname + " " + Lastname;
    }
}
    public class Person
    {
        public static void main(String args[])
        {
           person1 a1 = new person1("Jhon", "Doe", 30);
           person1 a2 = new person1("Alice", "Smith", 25);
           System.out.println("Person 1:"+a1.Getfullname());
           System.out.println("Person 2:"+a2.Getfullname());

           double sum = a1.Age + a2.Age;
           double average = sum/2;
           System.out.println("Average age:"+average);
        }
    }
