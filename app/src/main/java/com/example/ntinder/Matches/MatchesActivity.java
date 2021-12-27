package com.example.ntinder.Matches;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ntinder.R;

import java.util.ArrayList;
import java.util.List;

public class MatchesActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mMatchesAdapter;
    private  RecyclerView.LayoutManager mMatchesLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        mRecycleView = (RecyclerView) findViewById(R.id.recycleView);
        mRecycleView.setNestedScrollingEnabled(false);
        mRecycleView.setHasFixedSize(true);
        mMatchesLayoutManager = new LinearLayoutManager(MatchesActivity.this);
        mRecycleView.setLayoutManager(mMatchesLayoutManager);
        mMatchesAdapter = new MatchesAdapter(getDataSetMatches(), MatchesActivity.this);
        mRecycleView.setAdapter(mMatchesAdapter);

       //creating an object to matches object
        for (int i=0; i<100;i++){
            MatchesObject obj = new MatchesObject(Integer.toString(i));
            resultMatches.add(obj);
        }
        mMatchesAdapter.notifyDataSetChanged();


    }
    private ArrayList<MatchesObject> resultMatches = new ArrayList<MatchesObject>();
    private List<MatchesObject> getDataSetMatches() {
        return resultMatches;
    }
}