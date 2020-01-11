package com.moonface.mathbook;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.card.MaterialCardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();
        setupSectionsView();
    }

    private void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupSectionsView(){
        RecyclerView sectionsView = findViewById(R.id.sections_view);
        sectionsView.setLayoutManager(new LinearLayoutManager(this));
        SectionsAdapter adapter = new SectionsAdapter(this, Data.sections, (section, holder, position) -> {
            Intent sectionIntent = new Intent(this, SectionActivity.class);
            sectionIntent.putExtra("section", position);
            startActivity(sectionIntent);
        });
        sectionsView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
}

class SectionsAdapter extends RecyclerView.Adapter<SectionsAdapter.ViewHolder>{
    private Section[] data;
    private Context context;
    private OnItemClickListener itemClickListener;

    class ViewHolder extends RecyclerView.ViewHolder {
        View parentView;
        MaterialCardView cardView;
        ImageView iconView;
        TextView titleView;
        TextView descriptionView;
        ViewHolder(View v) {
            super(v);
            this.parentView = v;
            this.cardView = v.findViewById(R.id.card_view);
            this.iconView = v.findViewById(R.id.icon_view);
            this.titleView = v.findViewById(R.id.title_view);
            this.descriptionView = v.findViewById(R.id.description_view);
        }
    }

    SectionsAdapter(Context context, Section[] data, OnItemClickListener itemClickListener) {
        this.data = data;
        this.context = context;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public SectionsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sections_view_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Section s = data[position];
        holder.cardView.setOnClickListener((view) -> itemClickListener.onClick(data[position], holder, position));
        holder.iconView.setImageDrawable(context.getResources().getDrawable(s.iconDrawableID));
        holder.titleView.setText(s.title);
        holder.descriptionView.setText(s.description);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public interface OnItemClickListener{
        void onClick(Section section, ViewHolder holder, int position);
    }
}
