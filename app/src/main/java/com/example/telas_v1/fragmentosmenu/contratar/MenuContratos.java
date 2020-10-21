package com.example.telas_v1.fragmentosmenu.contratar;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.telas_v1.R;
import com.example.telas_v1.metodosusers.MetodosUsers;
import com.example.telas_v1.users.UserCliente;
import com.example.telas_v1.users.UserTrabalhador;
import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Item;
import com.xwray.groupie.OnItemClickListener;

public class MenuContratos extends Fragment {

    private MenuContratosViewModel menucontratos_viewmodel;
    private MetodosUsers metodosUsers = new MetodosUsers();
    private MetodosContratos metodosContratos = new MetodosContratos();
    private UserCliente cliente = new UserCliente();
    private UserTrabalhador trabalhador = new UserTrabalhador();
    private GroupAdapter adapter = new GroupAdapter();
    private Spinner spn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        menucontratos_viewmodel = ViewModelProviders.of(this).get(MenuContratosViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_menu_contratos, container, false);

        spn = root.findViewById(R.id.spn_contrat);

        RecyclerView rcView = root.findViewById(R.id.rcView);
        rcView.setAdapter(adapter);
        rcView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }

    public static MenuContratos newInstance() {
        return new MenuContratos();

    }
}
