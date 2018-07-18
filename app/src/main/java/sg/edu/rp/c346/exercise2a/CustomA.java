package sg.edu.rp.c346.exercise2a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomA extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<PersonDetails> PersonList;

    public CustomA(@NonNull Context context, int resource, @NonNull ArrayList<PersonDetails> objects) {
        super(context, resource , objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.PersonList = objects;
    }

    public View getView(int position, @Nullable View convertView , @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Prepare into each listview item and customising it
        View rowView = inflater.inflate(layout_id , parent, false);

        TextView Name = rowView.findViewById(R.id.name);
        TextView Role = rowView.findViewById(R.id.role);
        TextView Salary = rowView.findViewById(R.id.salary);

        //Get the arraylist number
        PersonDetails currentItem = PersonList.get(position);
        Name.setText(currentItem.getName());
        Role.setText(currentItem.getRole());
        Salary.setText(currentItem.getSalary()+"");

        return rowView;


    }
}




