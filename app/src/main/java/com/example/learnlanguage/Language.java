package com.example.learnlanguage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Language#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Language extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView mRecyclerView;
    ArrayList<DataModel> dataholder;
    LinearLayoutManager layoutManager;

    public Language() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Language.
     */
    // TODO: Rename and change types and number of parameters
    public static Language newInstance(String param1, String param2) {
        Language fragment = new Language();
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
        View view =inflater.inflate(R.layout.fragment_language, container, false);
        mRecyclerView=view.findViewById(R.id.rev);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder=new ArrayList<>();
        DataModel obj1=new DataModel(R.drawable.java,"JAVA",R.drawable.youtube);
dataholder.add(obj1);
        DataModel obj2=new DataModel(R.drawable.python,"PYTHON",R.drawable.youtube);
        dataholder.add(obj2);
        DataModel obj3=new DataModel(R.drawable.html5,"HTML",R.drawable.youtube);
        dataholder.add(obj3);
        DataModel obj4=new DataModel(R.drawable.javascript,"JAVASCRIPT",R.drawable.youtube);
        dataholder.add(obj4);
        DataModel obj5=new DataModel(R.drawable.csharp,"CSHARP",R.drawable.youtube);
        dataholder.add(obj5);
        DataModel obj6=new DataModel(R.drawable.c,"C",R.drawable.youtube);
        dataholder.add(obj6);

        mRecyclerView.setAdapter(new MyAdapter(dataholder));
        return view;

    }
}