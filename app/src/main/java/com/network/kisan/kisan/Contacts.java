package com.network.kisan.kisan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Contacts extends Fragment {

    private ArrayList<String> mContactNames = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  inflated = inflater.inflate(R.layout.contacts_layout,container,false);
        initRecyclerView(inflated);
        return inflated;
    }

    private void populateContacts(){
        mContactNames.add("Abhishek Chhabra");
        mContactNames.add("Kilari Teja");
        mContactNames.add("Lilari Teja");
        mContactNames.add("Milari Teja");
        mContactNames.add("Nilari Teja");
        mContactNames.add("Pilari Teja");
        mContactNames.add("Rilari Teja");
        mContactNames.add("Silari Teja");
    }

    private void initRecyclerView(View inflated){
        populateContacts();

        RecyclerView recyclerView = inflated.findViewById(R.id.contacts_list);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mContactNames, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
