package com.example.contactform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name, email, dob, phone;
    Spinner country;
    RadioGroup gender;
    Button reset, next;

    String[] countries = {"Select Country", "China", "France", "Germany", "India", "Italy", "Japan", "Pakistan", "Russia", "Sri Lanka", "USA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Edit Texts
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        dob = findViewById(R.id.dob);
        phone = findViewById(R.id.phone);

        // Spinner
        country = findViewById(R.id.country);
        country.setOnItemSelectedListener(this);

        // Array Adapter
        ArrayAdapter countryNames = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        countryNames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(countryNames);

        // Radio
        gender = findViewById(R.id.gender);

        // Buttons
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                dob.setText("");
                phone.setText("");
                country.setSelection(0);
                gender.clearCheck();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                dob.setText("");
                phone.setText("");
                country.setSelection(0);
                gender.clearCheck();
                Toast.makeText(getApplicationContext(), "Your form has been submitted. Thank You!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}