package pl.edu.pw.elka.pag.cwiczenie;

import java.util.*;

public class King {

    private String name = "Charlemagne";
    private boolean alive = false;
    private int age = 66;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean isAlive()
    {
        return this.alive;
    }
    public int getAge()
    {
        return this.age;
    }

    public String toString()
    {
        //get.class().getName()???
        String result = "[" + "name :" +" "+ getName()+ ", " + "is ";

        if (!isAlive())
        {
            result += "not ";
        }


        result += "alive, " + "age : " + getAge() + "]";

        return result;


    }

    public void reign()
    {
        System.out.println("King " + getName() + "has a long and succesful reign");
    }

    public void die()
    {
        System.out.println("King " + getName() + "has died!");
        this.setAlive(false);
    }

    public void eat()
    {
        System.out.println("King " + getName() + "is eating");
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o){ return true;}
        if(o == null){return false;}

        if(o instanceof King)
        {
            King k = (King) o;

            if(this.getName() == k.getName() && this.isAlive() == k.isAlive()
                    && this.getAge() == k.getAge()){return true;}
            else {return false;}
        }
        else {return false;}
    }

    @Override
    public int hashCode()
    {
        int result = 7;
        result = 31 * result + this.getName().hashCode();
        result = 31 * result + this.getAge();
        result = 31 * result + (this.isAlive() ? 1 : 0); // hashCode nie ma dla boolean, czy taki sposób jest ok?

        return result;
    }

    public static void createKing()
    {
        Scanner scan = new Scanner(System.in);
        King king = new King();

        System.out.println("set king's name:");
        king.setName(scan.nextLine());

        System.out.println("set king's age:");
        king.setAge(scan.nextInt());

        System.out.println("is king alive? :");
        king.setAlive(scan.nextBoolean());

        System.out.println(king);
    }

    public static void tests()
    {

        King one = new King();

        King two = new King();
        two.setName("john");
        two.setAlive(false);
        two.setAge(55);

        King three = new King();
        three.setName("tom");
        three.setAlive(true);
        three.setAge(7);

        King four = new King();
        four.setName("tom");
        four.setAlive(true);
        four.setAge(7);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        System.out.println(one.equals(two));
        System.out.println(three.equals(four));


//        System.out.println(one.hashCode());
//        System.out.println(two.hashCode());
//        System.out.println(three.hashCode());
//        System.out.println(four.hashCode());

        System.out.println(one.hashCode() == two.hashCode());
        System.out.println(three.hashCode() == four.hashCode());
    }

    public static void main(String[] args)
    {
        //createKing();
        tests();

    }
}
