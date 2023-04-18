public class Adressbook {
    package Java.OOP5;

import java.util.ArrayList;

    public class Adressbook {
        ArrayList<Phonebook> pb=new ArrayList();

        public void Adressbook(){
            pb.add(new Phonebook("Абсаматов Самат Несипбекович","+7701000000","Алматы"));
            pb.add(new Phonebook("Абсаматова Ляззат Несипбековна","+77070000","Алматы"));
        }

        public void showAddressBook(){
            for(Phonebook i:pb){
                System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
            }
        }
    }

}
