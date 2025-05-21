/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadepagamento;

/**
 *
 * @author guilh
 */
public class SistemaDePagamento {

    public static void main(String[] args) {
        
    Usuario usuario1 = new Usuario("Mariana", "534.354.973-01", 20);
    usuario1.adicionarMeio(new CartaoDeCredito("1234-5678-9012-3456"));
    usuario1.adicionarMeio(new Pix("mariana@email.com"));
    usuario1.adicionarMeio(new BoletoBancario("23793381283000000124560000078601975580000001000"));
    
    }
}
