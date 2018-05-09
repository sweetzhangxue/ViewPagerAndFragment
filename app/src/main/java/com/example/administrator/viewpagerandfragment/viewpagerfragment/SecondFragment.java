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

public class SecondFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("SecondFragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("SecondFragment","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i("SecondFragment","onCreateView");
        return inflater.inflate(R.layout.layout_fragment_second,container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("SecondFragment","onViewCreated");
        TextView tv = view.findViewById(R.id.tv_second_fragment);
        tv.setText("this id second fragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("SecondFragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("SecondFragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("SecondFragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("SecondFragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("SecondFragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("SecondFragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("SecondFragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("SecondFragment","onDetach");
    }
}
