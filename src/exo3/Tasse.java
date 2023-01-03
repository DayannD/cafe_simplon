package exo2;

public class Tasse {
    double quantiteCafeMax ;
    Cafe cafe ;

    Tasse() {
        quantiteCafeMax = 100 ;
    }

    public Tasse(double quantiteCafeMax) {
        super();
        this.quantiteCafeMax = quantiteCafeMax;
    }


    double boire(double qtBut) {
        if (qtBut > this.cafe.quantiteLiquideMl){
            return this.cafe.quantiteLiquideMl = 0;
        }

        this.cafe.quantiteLiquideMl = cafe.quantiteLiquideMl - qtBut ;
        return this.cafe.quantiteLiquideMl ;
    }

    void boire() {
        cafe.quantiteLiquideMl = 0 ;
    }

}