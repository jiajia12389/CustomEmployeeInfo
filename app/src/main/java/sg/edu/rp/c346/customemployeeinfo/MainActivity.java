package sg.edu.rp.c346.customemployeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView employeeLV;
    ArrayList<Employee> employeeArrayList;
    CustomAdapaterEmp adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeLV = findViewById(R.id.employeeLV);
        employeeArrayList = new ArrayList<>();

        Employee e1 = new Employee("John","Software technical Leader",3400);
        Employee e2 = new Employee("May","Programmer",2200);

        employeeArrayList.add(e1);
        employeeArrayList.add(e2);

        adapter = new CustomAdapaterEmp(this,R.layout.employeeadapter,employeeArrayList);
        employeeLV.setAdapter(adapter);
    }
}
