package com.example.learnlanguage;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Signin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Signin extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
EditText email,password;
Button signin;
    private FirebaseAuth mAuth;

ProgressBar progressBar;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Signin() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Signin.
     */
    // TODO: Rename and change types and number of parameters
    public static Signin newInstance(String param1, String param2) {
        Signin fragment = new Signin();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_signin, container, false);
        mAuth = FirebaseAuth.getInstance();

        email=view.findViewById(R.id.email2);
        password=view.findViewById(R.id.password2);
        signin=view.findViewById(R.id.signin);
        progressBar=view.findViewById(R.id.progressBar2);
    signin.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            signinhere();
        }

    });



        return view;
    }

    private void signinhere() {
String e=email.getText().toString().trim();
String pass=password.getText().toString().trim();
        if(e.isEmpty()){
            email.setError("Enter Email");
            email.requestFocus();
            return;
        }
        if(pass.isEmpty()){
            password.setError("Enter PassWord");
            password.requestFocus();
            return;

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(e).matches()){
            email.setError("Please Provide Valid Email");
            email.requestFocus();
            return;
        }
        if(pass.length()<6){
            password.setError("Min Length of password is 6");
            password.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
mAuth.signInWithEmailAndPassword(e,pass).addOnCompleteListener(new OnCompleteListener(){
    @Override
    public void onComplete(@NonNull Task task) {
        if(task.isSuccessful()){
            progressBar.setVisibility(View.GONE);
            Intent intent = new Intent(getContext(),Navigation.class);
            startActivity(intent);
        }
        else{
            progressBar.setVisibility(View.GONE);

            Toast.makeText(getContext(),"Please SignUp",Toast.LENGTH_LONG).show();

        }
    }
});

    }
}