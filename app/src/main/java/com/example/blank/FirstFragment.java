package com.example.blank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.List;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listNotes=view.findViewById(R.id.note_list);
        List<NoteInfo> notes=DataManager.getInstance().getNotes();
        ArrayAdapter<NoteInfo> adapternotes=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,notes);
        listNotes.setAdapter(adapternotes);
    }
}