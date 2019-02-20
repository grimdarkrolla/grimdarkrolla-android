package com.grimdarkrolla.java.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grimdarkrolla.java.R;
import com.grimdarkrolla.java.models.ModelType;

import java.util.List;

public class AttackersAdapter extends RecyclerView.Adapter<AttackersAdapter.ViewHolder> {
    private List<ModelType> attackModels;

    // Provides a reference to the views for each Project
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public TextView unitName;
        public TextView numberOfModels;
        public TextView wpnShots;
        public TextView ballisticSkill;
        public TextView wpnStrength;
        public TextView wpnArmorPen;
        public TextView wpnDmg;

        public ViewHolder(View v) {
            super(v);
            mView = v;
            unitName = v.findViewById(R.id.unitName);
            numberOfModels = v.findViewById(R.id.numberOfModels);
            wpnShots = v.findViewById(R.id.wpnShots);
            ballisticSkill = v.findViewById(R.id.ballisticSkill);
            wpnStrength = v.findViewById(R.id.wpnStrength);
            wpnArmorPen = v.findViewById(R.id.wpnArmorPen);
            wpnDmg = v.findViewById(R.id.wpnDmg);
        }
    }

    // Constructor
    public AttackersAdapter(List<ModelType> attackModels) {
        this.attackModels = attackModels;
    }

    // Adds  an attack ModelType
    public void add(ModelType attackModel) {
        attackModels.add(0, attackModel);
        notifyItemInserted(0);
    }

    // Removes an attack ModelType
    public void remove(ModelType attackModel) {
        for (int i = 0; i < attackModels.size(); i++) {
            if (attackModel.equals(attackModels.get(i))){
                attackModels.remove(i);
                notifyItemRemoved(i);
            }
        }
    }

    // Sets attackModels
    public void setAttackModels(List<ModelType> attackModels) {
        this.attackModels = attackModels;
        this.notifyDataSetChanged();
    }

    // Create a new view (invoked by the layout manager)
    @Override
    public AttackersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.attacker_form, parent, false);

        // Adds an onClick listener
        // https://stackoverflow.com/questions/13485918/android-onclick-listener-in-a-separate-class
//        v.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(final View view) {
//                        TextView idView = view.findViewById(R.id.sightingId);
//                        String id = idView.getText().toString();
//                        Log.i("Sighting Id", id);
//                        goToSighting(view, id);
//                    }
//                });

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replaces the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelType modelType = attackModels.get(position);

        // Injects sighting's content into the view
        holder.unitName.setText(modelType.getUnitName());
        holder.unitName.setText(modelType.getNumberOfModels());
        holder.unitName.setText(modelType.getWpnShots());
        holder.unitName.setText(modelType.getBallisticSkill());
        holder.unitName.setText(modelType.getWpnStrength());
        holder.unitName.setText(modelType.getWpnArmorPen());
        holder.unitName.setText(modelType.getWpnDmg());
    }

    // Returns the size of projects (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return attackModels.size();
    }
}
