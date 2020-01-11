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

public class SectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
        setupToolbar();
        setupTopicsView();
    }

    private void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(Data.sections[getIntent().getIntExtra("section",0)].title);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void setupTopicsView(){
        RecyclerView topicsView = findViewById(R.id.topics_view);
        topicsView.setLayoutManager(new LinearLayoutManager(this));
        TopicsAdapter adapter = new TopicsAdapter(this, Data.sections[getIntent().getIntExtra("section",0)].topics, (section, holder, position) -> {
            Intent topicIntent = new Intent(this, TopicActivity.class);
            topicIntent.putExtra("section", getIntent().getIntExtra("section",0));
            topicIntent.putExtra("topic", position);
            startActivity(topicIntent);
        });
        topicsView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
}

class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.ViewHolder>{
    private Topic[] data;
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

    TopicsAdapter(Context context, Topic[] data, OnItemClickListener itemClickListener) {
        this.data = data;
        this.context = context;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public TopicsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.topics_view_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Topic t = data[position];
        holder.cardView.setOnClickListener((view) -> itemClickListener.onClick(data[position], holder, position));
        holder.iconView.setImageDrawable(context.getResources().getDrawable(t.iconDrawableID));
        holder.titleView.setText(t.title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public interface OnItemClickListener{
        void onClick(Topic topic, ViewHolder holder, int position);
    }
}
