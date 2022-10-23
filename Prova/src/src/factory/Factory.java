package src.factory;

public class Factory {

    public Sandwiche getSandwiche(int i){
        if(i == 1) return new XEgg();
        if(i == 2) return new XBurguer();
        if(i == 3) return new DaCasa();
        return null;
    }

}
