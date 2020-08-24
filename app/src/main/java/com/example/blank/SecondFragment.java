package com.example.blank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.List;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Spinner spinnercourses= view.findViewById(R.id.spinner_courses);

        List<CourseInfo> courses=DataManager.getInstance().getCourses();
        ArrayAdapter<CourseInfo> adaptercourses=new ArrayAdapter<>(getActivity(),android.R.layout.simple_spinner_item,courses);
        adaptercourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercourses.setAdapter(adaptercourses);
    }
}