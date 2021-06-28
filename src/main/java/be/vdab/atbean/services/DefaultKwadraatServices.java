package be.vdab.atbean.services;

public class DefaultKwadraatServices implements KwadraatService {
    @Override
    public int kwadraat(int getal) {
        return getal * getal;
    }
}
