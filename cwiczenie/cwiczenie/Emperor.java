package pl.edu.pw.elka.pag.cwiczenie;

public class Emperor extends King {

    @Override
    public void eat(){ System.out.println("Emperor " + getName() + "is eating great and tasty food!"); }

    public void getIntoConflictWithPope()
    {
        System.out.println("Emperor " + getName() + "started a long lasting conflict with a Pope!");
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o){ return true;}
        if(o == null){return false;}

        if(o instanceof Emperor)
        {
            Emperor e = (Emperor) o;

            if(this.getName() == e.getName() && this.isAlive() == e.isAlive()
                    && this.getAge() == e.getAge()){return true;}
            else {return false;}
        }
        else {return false;}
    }

    // czy nalezy teraz takze nadpisac hashCode, nawet jak nie dodaje nowych atrybotow?

}
