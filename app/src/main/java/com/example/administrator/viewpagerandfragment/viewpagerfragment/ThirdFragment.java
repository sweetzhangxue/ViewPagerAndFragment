package com.example.administrator.viewpagerandfragment.viewpagerfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.viewpagerandfragment.R;

public class ThirdFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("ThirdFragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ThirdFragment","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i("ThirdFragment","onCreateView");
        return inflater.inflate(R.layout.layout_fragment_third,container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("ThirdFragment","onViewCreated");
       TextView textView = view.findViewById(R.id.tv_third_fragment);
       textView.setText("this is third fragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("ThirdFragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("ThirdFragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("ThirdFragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("ThirdFragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("ThirdFragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("ThirdFragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("ThirdFragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("ThirdFragment","onDetach");
    }
}
