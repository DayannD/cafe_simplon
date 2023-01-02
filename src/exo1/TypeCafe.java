package exo1;

public enum TypeCafe {

    JAVA(0.035),
    MOKA(0.025),
    TYPICA(0.027),
    BOURBON(0.030),
    BATARD(0),
    ;

    double coutParMl ;

    private TypeCafe(double coutParMl) {
        this.coutParMl = coutParMl;
    }



}
