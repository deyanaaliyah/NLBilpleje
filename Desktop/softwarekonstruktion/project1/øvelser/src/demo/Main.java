package demo;
// *** LINK - https://dat19b.github.io/Semesterplan/w36_icrud_ex.html

import demo.handler.Person;
import demo.repository.ArraylistRepo;
import demo.repository.DBRepo;
import demo.repository.FileRepo;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // create new instance of the repository
        ArraylistRepo a = new ArraylistRepo();
        //FileRepo f = new FileRepo();
        //DBRepo d = new DBRepo();

        // create new person – to be used via arraylist
        Person p = new Person("Hugo", 18, 220702, "i det asiatiske vælde, råber han højest");
        a.create(p);
        a.read();
    }
}
