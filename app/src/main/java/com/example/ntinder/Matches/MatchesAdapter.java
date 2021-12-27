package com.example.ntinder.Matches;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ntinder.R;

import java.util.List;
//specific function for layout
public class MatchesAdapter extends RecyclerView.Adapter<MatchesViewHolders> {
    private List<MatchesObject> matchesList;// this one is used in this.matches list
    private Context context;
//passes the matches
    public  MatchesAdapter(List<MatchesObject> matchesList, Context context){
        this.matchesList = matchesList;
        this.context =  context;

    }

    @Override
    public MatchesViewHolders onCreateViewHolder( ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_matches,  null, false);
        RecyclerView.LayoutParams Ip = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(Ip);
        MatchesViewHolders rcv = new MatchesViewHolders((layoutView));

        return rcv;
    }
    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolders holder, int position) {
        holder.mMatchId.setText(matchesList.get(position).getUserId());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
