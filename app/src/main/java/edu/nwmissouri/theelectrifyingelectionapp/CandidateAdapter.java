package edu.nwmissouri.theelectrifyingelectionapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by s525074 on 2/23/2016.
 */
public class CandidateAdapter extends ArrayAdapter {
    Context context;
    int textViewResourceId;
    ArrayList<Candidate> items = new ArrayList<Candidate>();


    public CandidateAdapter(Context context, int textViewResourceId, String[] candidatesName) {
        super(context, textViewResourceId);
        this.context = context;
        this.textViewResourceId = textViewResourceId;

    }

    @Override
    public View getView(int position, View oldView, ViewGroup parent) {
        //View view = super.getView(position, oldView, parent);
        View view = oldView;
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        TextView txtcandidateName = (TextView)view.findViewById(R.id.candidateName);
        return view;
    }
}
