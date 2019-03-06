package com.grimdarkrolla.java.fragments;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grimdarkrolla.java.R;
import com.grimdarkrolla.java.adapters.AttackersAdapter;
import com.grimdarkrolla.java.database.ModelTypeDatabase;
import com.grimdarkrolla.java.models.ModelType;

import java.util.ArrayList;
import java.util.List;

public class AttackersFragment extends Fragment {
    private List<ModelType> attackModels;
    private ModelTypeDatabase modelTypeDatabase;


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

        // Creates a singleton of the database
        modelTypeDatabase = Room.databaseBuilder(getActivity().getApplicationContext(),
                ModelTypeDatabase.class, "modelTypeDB")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        // Gets all model types from the database
        attackModels = modelTypeDatabase.modelTypeDao().getAll();

        // Creates a default model if attackModels is empty
        if (attackModels.size() == 0) {
            attackModels.add(createAttacker());
        }

        // Gets the recycler view
        recyclerView = view.findViewById(R.id.attackerRecyclerView);

        // Creates a layout manager and assigns it to the recycler view
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Specify an adapter (see also next example)
        adapter = new AttackersAdapter(attackModels);
        recyclerView.setAdapter(adapter);

        view.findViewById(R.id.btnAddAttackModel).setOnClickListener(mListener);

        // Inflate the layout for this fragment
        return view;
    }

    private final View.OnClickListener mListener = new View.OnClickListener(){
        public void onClick(View view){
            switch (view.getId()){
                case R.id.btnAddAttackModel:
                    onBtnClickAddAttackModel();
                    break;
            }
        }
    };

    public void onBtnClickAddAttackModel () {
        ModelType newAttacker = createAttacker();
        adapter.add(newAttacker);
        Log.i("TAG", "IT WORKED");
    }

    // Adds a new attack model, with a defender, to attackModels
    public ModelType createAttacker() {
        ModelType newAttacker = new ModelType();
        newAttacker.setDefender(new ModelType());
        return newAttacker;
    }

}
