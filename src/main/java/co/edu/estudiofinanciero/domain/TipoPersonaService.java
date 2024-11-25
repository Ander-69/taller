/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.estudiofinanciero.domain;

import java.util.List;

public interface TipoPersonaService {

    List<TipoPersona> listar();

    TipoPersona listarId(int id);

    TipoPersona add(TipoPersona p);

    TipoPersona edit(TipoPersona p);

    TipoPersona delete(int id);
}