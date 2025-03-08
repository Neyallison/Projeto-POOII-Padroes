/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroes;

/**
 *
 * @author Ney Allison
 */
public class Recuperacao implements Estado {
    
    public void addNota(AlunoTurma alunoturma, Nota nota) { 
        alunoturma.getNota().setNotaRecuperacao(nota.getNota1());
    
}
    
}
