package br.ufla.dcc.gcc110.s2016_01.trabalho2.POG.rpg;

/**
 *
 * @author neche
 */
public class Main {
    public static void main(String[] args){
        try{
            TelaDoJogo tela = new TelaDoJogo();

            tela.exibir();
        }
        catch(AcaoInvalidaException e){
            System.out.println(e.getMessage());
            System.out.println(e.getMotivo());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
