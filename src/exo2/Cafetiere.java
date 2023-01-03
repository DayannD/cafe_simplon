public class Cafetiere {


    void remplirTasse(Tasse tasse) {
        tasse.cafe = new Cafe(TypeCafe.MOKA, tasse.quantiteCafeMax) ;
    }

    void remplirTasse(Tasse tasse, TypeCafe typeCafe, double qt)
    {
        if(tasse.cafe != null)
        {
            tasse.cafe.quantiteLiquideMl += qt ;
            if(typeCafe != tasse.cafe.typeCafe)
                tasse.cafe.typeCafe = TypeCafe.BATARD ;
        }
        else
            tasse.cafe = new Cafe(typeCafe,qt) ;

        if(tasse.cafe.quantiteLiquideMl > tasse.quantiteCafeMax)
        {
            System.out.println("Mon cafe déborde");
            tasse.cafe.quantiteLiquideMl = tasse.quantiteCafeMax ;
        }

    }
}