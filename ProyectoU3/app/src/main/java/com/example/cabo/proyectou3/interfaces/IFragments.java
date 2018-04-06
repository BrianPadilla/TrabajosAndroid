package com.example.cabo.proyectou3.interfaces;


import com.example.cabo.proyectou3.fragments.BienvenidaFragment;
import com.example.cabo.proyectou3.fragments.ConsultaUsuarioUrlFragment;
import com.example.cabo.proyectou3.fragments.ConsultarListaUsuariosFragment;
import com.example.cabo.proyectou3.fragments.RegistrarUsuarioFragment;

/**
 * Created by CHENAO on 5/08/2017.
 */

public interface IFragments extends BienvenidaFragment.OnFragmentInteractionListener,
        RegistrarUsuarioFragment.OnFragmentInteractionListener,
        ConsultarListaUsuariosFragment.OnFragmentInteractionListener,
        ConsultaUsuarioUrlFragment.OnFragmentInteractionListener{
}
