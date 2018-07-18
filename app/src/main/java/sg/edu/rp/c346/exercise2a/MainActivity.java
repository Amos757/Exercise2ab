package sg.edu.rp.c346.exercise2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LvPerson;
    ArrayList<PersonDetails> alPersonList;
    CustomA caPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LvPerson = findViewById(R.id.PersonList);

        alPersonList = new ArrayList<>();
        PersonDetails person1 = new PersonDetails("John","Software Technical Leader" ,3400);
        PersonDetails person2 = new PersonDetails("May","Programmer" ,3400);
        PersonDetails person3 = new PersonDetails("Amos","Boss" ,6000);
        PersonDetails person4 = new PersonDetails("Mandy","Accountant" ,4000);


        alPersonList.add(person1);
        alPersonList.add(person2);
        alPersonList.add(person3);
        alPersonList.add(person4);


        caPerson = new CustomA(this, R.layout.mods, alPersonList);
        LvPerson.setAdapter(caPerson);


    }
}
