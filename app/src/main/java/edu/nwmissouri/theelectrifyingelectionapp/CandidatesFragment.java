package edu.nwmissouri.theelectrifyingelectionapp;


import android.support.v4.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CandidatesFragment extends ListFragment {
    String[] candidatesNameArray ;
    CandidateAdapter candidatesAdapter;
    Context context;
    CandidatesInterface myCandidatesInterface;

    public static CandidatesFragment newInstance(int sectionNumber) {
        CandidatesFragment fragment = new CandidatesFragment();
        Bundle args = new Bundle();
        args.putInt("sectionNumber", sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public interface CandidatesInterface{
        public String[] getCandidatesName();
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myCandidatesInterface = (CandidatesInterface)context;
        candidatesNameArray = myCandidatesInterface.getCandidatesName();
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        candidatesAdapter = new CandidateAdapter(getActivity(),R.layout.list_item,candidatesNameArray);
        setListAdapter(candidatesAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //items=myCandidatesInterface.getCandidate();
        return inflater.inflate(R.layout.fragment_candidates, container, false);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
    }
}
