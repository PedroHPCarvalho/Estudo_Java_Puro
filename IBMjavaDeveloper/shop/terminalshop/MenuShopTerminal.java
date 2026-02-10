package IBMjavaDeveloper.shop.terminalshop;

import java.sql.SQLOutput;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

import IBMjavaDeveloper.shop.terminalshop.ClientKart;


public class MenuShopTerminal {
    String[] items;
    float[] values;
    public  MenuShopTerminal(String[] items,float[] values){
        this.items = items;
        this.values = values;
    }
    public void MenuController() {
        boolean isContinue = true;
        ClientKart clientKart = new ClientKart();
        Scanner scannerUserInput = new Scanner(System.in);
        while (isContinue) {
            //Impressão Menu de items
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("------------------------------MERCADO TERMINAL-----------------------------------");
            System.out.println("ID_ITEM | NOME_ITEM | VALOR_ITEM");
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + " | " + items[i] + " | " + values[i]);
            }
            System.out.println("---------------------------------------------------------------------------------");
            //Seleção do item por id
            System.out.println("PARA SELECIONAR O ITEM, INFORME SEU ID");
            int itemSelected = 0;
            try {
                itemSelected = scannerUserInput.nextInt();
            } catch (IllegalFormatException e) {
                System.out.println("Formato de Seleção deve ser o ID(número) do produto");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("O valor do item deve ser igual a um dos IDs");
            }
            System.out.println();
            //Determinar quantidade de items do item selecionado
            System.out.println("QUAL A QUANTIDADE DESEJADA");
            int quantityItems = 0;
            try {
                quantityItems = scannerUserInput.nextInt();
            } catch (IllegalFormatException e) {
                System.out.println("A quantidade deve ser um número inteiro");
            }
            try {
                clientKart.addItems(values[itemSelected], quantityItems);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("O valor do item deve ser igual a um dos IDs");
            }
            System.out.println("---------------------------------------------------------------------------------");

            //Perguntar se ele quer adicionar mais items ou fechar a conta e terminar o programa
            System.out.println("Deseja adicionar mais items, ou Concluir?");
            System.out.println("Para Concluir digite 0");
            System.out.println("Para Continuar digite 1");
            int responseUser = 0;
            try {
                responseUser = scannerUserInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("O valor deve ser 1.Continuar ou 0.Concluir");
            }
            if (responseUser == 0) {
                isContinue = false;
                System.out.println();
                System.out.println("O valor final do carrinho é de: " + clientKart.closeKartValue());
            } else if (responseUser == 1) {
                isContinue = true;
            } else {
                System.out.println("O valor deve ser 1.Continuar ou 0.Concluir");
            }
        }
    }
}
