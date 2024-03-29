package com.example.bundle;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentJOB extends Fragment {
    private Bundle bundle;
    private Pegawai pegawai;
    private TextView txtNama, txtPekerjaan, txtLamaKerja;

    public FragmentJOB() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        pegawai = (Pegawai) bundle.getSerializable("bungkus2");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_job, container, false);
        txtNama = (TextView) view.findViewById(R.id.txt_nama);
        txtPekerjaan = (TextView) view.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja = (TextView) view.findViewById(R.id.txt_Lamakerja);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawai.getNamanya());
        txtPekerjaan.setText(pegawai.getPekerjaan());
        txtLamaKerja.setText(pegawai.getLamaKerja());
    }
}