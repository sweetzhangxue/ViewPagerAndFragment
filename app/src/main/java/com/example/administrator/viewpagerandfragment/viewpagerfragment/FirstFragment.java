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

public class FirstFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("FirstFragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FirstFragment","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i("FirstFragment","onCreateView");
        View view = inflater.inflate(R.layout.layout_fragment_first,container,false);
        return view;

    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("FirstFragment","onViewCreated");
        TextView textView = view.findViewById(R.id.tv_first_fragment);
        textView.setText("this is first fragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FirstFragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("FirstFragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("FirstFragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("FirstFragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("FirstFragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("FirstFragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("FirstFragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("FirstFragment","onDetach");
    }
}
