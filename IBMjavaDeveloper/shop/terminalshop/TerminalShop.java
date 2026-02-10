package IBMjavaDeveloper.shop.terminalshop;

import IBMjavaDeveloper.shop.terminalshop.AddItems;
import IBMjavaDeveloper.shop.terminalshop.MenuShopTerminal;

public class TerminalShop{
    public static void main(String[] args) {
        String[] myItems = new String[10];
        float[] myValues = new float[10];

        AddItems addItems = new AddItems(myItems,myValues);
        addItems.registerItems("Arroz", 9.90f);
        addItems.registerItems("Carne", 21.90f);
        addItems.registerItems("Frango", 12.90f);
        addItems.registerItems("Ketchup", 2.90f);
        addItems.registerItems("Kit-kat", 1.50f);
        addItems.registerItems("Alface", 3.90f);
        addItems.registerItems("Faca de cozinha", 90f);
        addItems.registerItems("Oleo", 5.90f);
        addItems.registerItems("Lasanha", 50.90f);
        addItems.registerItems("Sorvete", 16.90f);

        MenuShopTerminal newMenu = new MenuShopTerminal(myItems,myValues);
        newMenu.MenuController();
    }
}