package IBMjavaDeveloper.shop.terminalshop;

public class AddItems {
    public String[] items;
    public float[] values;
    public int totalItemsAdd = 0;

    public AddItems(String[] items, float[] values){
        this.items = items;
        this.values = values;
    }

    public void registerItems(String item, float value){
        totalItemsAdd++;
        if (totalItemsAdd == 10){
            System.out.println("Devem existir exatamente 10 items");
        }
        int addInIndex = totalItemsAdd - 1;
        items[addInIndex] = item;
        values[addInIndex] = value;
    }
}
