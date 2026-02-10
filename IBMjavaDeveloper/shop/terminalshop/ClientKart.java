package IBMjavaDeveloper.shop.terminalshop;

public class ClientKart {
    float priceKart = 0;

    public void addItems(float value, int quantityItems){
        priceKart += value*quantityItems;
    }
    public float closeKartValue(){
        return priceKart;
    }
}
