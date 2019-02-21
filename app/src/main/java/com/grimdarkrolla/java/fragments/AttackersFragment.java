package com.grimdarkrolla.java.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grimdarkrolla.java.R;
import com.grimdarkrolla.java.adapters.AttackersAdapter;
import com.grimdarkrolla.java.models.ModelType;

import java.util.ArrayList;
import java.util.List;

public class AttackersFragment extends Fragment {
    private List<ModelType> attackModels;
    private AttackersAdapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attackers_view, container, false);

        recyclerView = view.findViewById(R.id.attackerRecyclerView);

        // Creates a layout manager and assigns it to the recycler view
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Fake ModelType for testing
        attackModels = new ArrayList<>();
        attackModels.add(new ModelType());
        attackModels.add(new ModelType());
        attackModels.add(new ModelType());
        attackModels.add(new ModelType());
        attackModels.add(new ModelType());

        // Specify an adapter (see also next example)
        adapter = new AttackersAdapter(attackModels);
        recyclerView.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;
    }

}
