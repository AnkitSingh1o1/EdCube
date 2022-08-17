package com.example.edcube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    @Nullable
    View view;
    private ListView videosList;
    private TextView vEmptyStateTextView;
    private VideoListAdapter vAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.listfragment, container, false);

        videosList = (ListView)view.findViewById(R.id.keywordlistview);
        vEmptyStateTextView =(TextView) view.findViewById(R.id.empty_view);
        videosList.setEmptyView(vEmptyStateTextView);

        vAdapter = new VideoListAdapter(getActivity(), new ArrayList<>());
        videosList.setAdapter(vAdapter);

        return view;
    }
}
