package com.grimdarkrolla.java.adapters;

import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grimdarkrolla.java.R;
import com.grimdarkrolla.java.database.ModelTypeDatabase;
import com.grimdarkrolla.java.models.ModelType;
import com.grimdarkrolla.java.tools.ObjectCloner;

import java.util.List;

public class AttackersAdapter extends RecyclerView.Adapter<AttackersAdapter.ViewHolder> {
    private ModelTypeDatabase modelTypeDatabase;
    private List<ModelType> attackModels;

    // Provides a reference to the views for each Project
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public EditText modelName;
        public EditText numberOfModels;
        public EditText wpnShots;
        public EditText ballisticSkill;
        public EditText wpnStrength;
        public EditText wpnArmorPen;
        public EditText wpnDmg;
        public LinearLayout wholeAttackerForm;
        public Button deleteButton;
        public Button duplicateButton;

        public ViewHolder(View v) {
            super(v);
            mView = v;
            modelName = v.findViewById(R.id.modelName);
            numberOfModels = v.findViewById(R.id.numberOfModels);
            wpnShots = v.findViewById(R.id.wpnShots);
            ballisticSkill = v.findViewById(R.id.ballisticSkill);
            wpnStrength = v.findViewById(R.id.wpnStrength);
            wpnArmorPen = v.findViewById(R.id.wpnArmorPen);
            wpnDmg = v.findViewById(R.id.wpnDmg);
            wholeAttackerForm = v.findViewById(R.id.wholeAttackerForm);
            deleteButton = v.findViewById(R.id.btnDeleteModelUnit);
            duplicateButton = v.findViewById(R.id.btnDuplicateModelUnit);
        }
    }

    // Constructor
    public AttackersAdapter(ModelTypeDatabase modelTypeDatabase, List<ModelType> attackModels) {
        this.modelTypeDatabase = modelTypeDatabase;
        this.attackModels = attackModels;
    }

    // Adds  an attack ModelType
    public void add(ModelType attackModel) {
        attackModels.add(attackModels.size(), attackModel);
        notifyItemInserted(attackModels.size() - 1);
    }

    // Removes an attack ModelType
    public void remove(long id) {
        for (int i = 0; i < attackModels.size(); i++) {
            if (attackModels.get(i).getId() == id) {
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
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replaces the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final ModelType modelType = attackModels.get(position);

        // Injects sighting's content into the view
        if (modelType.getModelName().length() == 0) {
            holder.modelName.setText("Model Type");
        } else {
            holder.modelName.setText(modelType.getModelName());
        }
        holder.modelName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.modelName.getText().toString().length() == 0) {
                        holder.modelName.setText("Model Type");
                    } else {
                        modelType.setModelName(holder.modelName.getText().toString());
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });

        holder.numberOfModels.setText(String.valueOf(modelType.getNumberOfModels()));
        holder.numberOfModels.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.numberOfModels.getText().toString().length() == 0) {
                        holder.numberOfModels.setText(String.valueOf(modelType.getNumberOfModels()));
                    } else {
                        modelType.setNumberOfModels(Integer.parseInt(holder.numberOfModels.getText().toString()));
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });

        holder.wpnShots.setText(String.valueOf(modelType.getWpnShots()));
        holder.wpnShots.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.wpnShots.getText().toString().length() == 0) {
                        holder.wpnShots.setText(String.valueOf(modelType.getWpnShots()));
                    } else {
                        modelType.setWpnShots(Integer.parseInt(holder.wpnShots.getText().toString()));
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });

        holder.ballisticSkill.setText(String.valueOf(modelType.getBallisticSkill()));
        holder.ballisticSkill.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.ballisticSkill.getText().toString().length() == 0) {
                        holder.ballisticSkill.setText(String.valueOf(modelType.getBallisticSkill()));
                    } else {
                        modelType.setBallisticSkill(Integer.parseInt(holder.ballisticSkill.getText().toString()));
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });

        holder.wpnStrength.setText(String.valueOf(modelType.getWpnStrength()));
        holder.wpnStrength.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.wpnStrength.getText().toString().length() == 0) {
                        holder.wpnStrength.setText(String.valueOf(modelType.getWpnStrength()));
                    } else {
                        modelType.setWpnStrength(Integer.parseInt(holder.wpnStrength.getText().toString()));
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });

        holder.wpnArmorPen.setText(String.valueOf(modelType.getWpnArmorPen()));
        holder.wpnArmorPen.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.wpnArmorPen.getText().toString().length() == 0) {
                        holder.wpnArmorPen.setText(String.valueOf(modelType.getWpnArmorPen()));
                    } else {
                        modelType.setWpnArmorPen(Integer.parseInt(holder.wpnArmorPen.getText().toString()));
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });

        holder.wpnDmg.setText(String.valueOf(modelType.getWpnDmg()));
        holder.wpnDmg.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (holder.wpnDmg.getText().toString().length() == 0) {
                        holder.wpnDmg.setText(String.valueOf(modelType.getWpnDmg()));
                    } else {
                        modelType.setWpnDmg(Integer.parseInt(holder.wpnDmg.getText().toString()));
                        modelTypeDatabase.modelTypeDao().updateModelType(modelType);
                    }
                }
            }
        });



        // OnClick for Model Type delete button
        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btnDeleteModelUnit:
                        Log.i("DELETE", "DELETE " + modelType.getId());
                        if (attackModels.size() > 1) {
                            remove(modelType.getId());
                            modelTypeDatabase.modelTypeDao().deleteById(modelType.getId());
                        }
                }
            }
        });

        // OnClick for Model Type duplicate button
        holder.duplicateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btnDuplicateModelUnit:
                        try {
                            Log.i("INSERT", "INSERT DUPLICATE OF " + modelType.getId());
                            ModelType newModelType = (ModelType) ObjectCloner.deepCopy(modelType);
                            newModelType.setId(modelTypeDatabase.modelTypeDao().getMaxIdFromDatabase() + 1);
                            modelTypeDatabase.modelTypeDao().insertModelType(newModelType);
                            add(newModelType);
                        } catch (Exception e) {
                            Log.i("INSERT", "INSERT FAILED");
                        }
                }
            }
        });
    }

    // Returns the size of projects (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return attackModels.size();
    }
}
