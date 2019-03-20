package com.grimdarkrolla.java.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grimdarkrolla.java.R;

public class DefendersFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("Test", "TEST");
        View view = inflater.inflate(R.layout.attackers_view, container, false);
//
//        // Creates a singleton of the database
//        modelTypeDatabase = Room.databaseBuilder(getActivity().getApplicationContext(),
//                ModelTypeDatabase.class, "modelTypeDB")
//                .allowMainThreadQueries()
//                .fallbackToDestructiveMigration()
//                .build();
//
//        // Gets the highest id from the database
//        databaseMaxValue = modelTypeDatabase.modelTypeDao().getMaxIdFromDatabase();
//        Log.i("DATABASE ID", "VALUE " + databaseMaxValue);
//
//        // Gets all model types from the database
//        attackModels = modelTypeDatabase.modelTypeDao().getAll();
//
//        // Creates a default model if attackModels is empty
//        if (attackModels.size() == 0) {
//            ModelType newAttacker = createAttacker();
//            modelTypeDatabase.modelTypeDao().insertModelType(newAttacker);
//            attackModels.add(newAttacker);
//        }
//
//        // Gets the recycler view
//        recyclerView = view.findViewById(R.id.attackerRecyclerView);
//
//        // Creates a layout manager and assigns it to the recycler view
//        layoutManager = new LinearLayoutManager(view.getContext());
//        recyclerView.setLayoutManager(layoutManager);
//
//        // Specify an adapter (see also next example)
//        adapter = new AttackersAdapter(modelTypeDatabase, attackModels);
//        recyclerView.setAdapter(adapter);
//
//        view.findViewById(R.id.btnAddAttackModel).setOnClickListener(mListener);
//
//        // Inflate the layout for this fragment
        return view;
    }
}
