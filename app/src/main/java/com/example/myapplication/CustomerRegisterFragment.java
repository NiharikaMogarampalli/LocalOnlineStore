package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CustomerRegisterFragment extends Fragment {
    Button register;
    EditText e1,e2,e3,e4,e5;
    DatabaseReference reference;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_customer_register, container, false);
        e1=v.findViewById(R.id.uname);
        e2=v.findViewById(R.id.email);
        e3=v.findViewById(R.id.password);
        e4=v.findViewById(R.id.number);
        e5=v.findViewById(R.id.pincode);
        reference=FirebaseDatabase.getInstance().getReference("Data");
        register=v.findViewById(R.id.register);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uuname = e1.getText().toString();
                String uemail = e2.getText().toString();
                String upassword= e3.getText().toString();
                String unumber = e4.getText().toString();
                String upincode= e5.getText().toString();
                MyModel model = new MyModel(uuname,uemail,upassword,unumber,upincode);

                reference.child(unumber).setValue(model);
                startActivity(new Intent(getActivity(),NavActivity.class));
            }
        });
        return v;
    }
}