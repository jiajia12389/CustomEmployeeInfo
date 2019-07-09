package sg.edu.rp.c346.customemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapaterEmp extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Employee> empList;

    public CustomAdapaterEmp(Context context, int resource, ArrayList<Employee> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.empList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.name);
        TextView tvTitle = rowView.findViewById(R.id.tilte);
        TextView tvSalary = rowView.findViewById(R.id.salary);

        // Obtain the Android Version information based on the position
        Employee employeeDetail = empList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(employeeDetail.getName());
        tvTitle.setText(employeeDetail.getTitle());
        tvSalary.setText(String.valueOf(employeeDetail.getSalary()));

        return rowView;
    }

}
