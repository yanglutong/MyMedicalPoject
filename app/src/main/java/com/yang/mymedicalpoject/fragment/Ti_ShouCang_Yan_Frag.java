package com.yang.mymedicalpoject.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yang.mymedicalpoject.R;


/**
 * @author gzp
 * @description:
 * @date : 2020/11/28 19:29
 */
public class Ti_ShouCang_Yan_Frag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.ti_shoucang_yan_frg, null);



        return inflate;
    }
}
