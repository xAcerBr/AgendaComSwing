/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import java.util.List;

/**
 *
 * @author Alunos
 */
public interface BaseDao {

    public boolean inserir(Object objeto) throws Exception;

    public boolean update(Object objeto) throws Exception;

    public Object pesquisar(Integer id) throws Exception;

    public List<Object> pesquisarTodos() throws Exception;

    public boolean excluir(Integer id) throws Exception;

    public boolean excluir(String parametro) throws Exception;

}
