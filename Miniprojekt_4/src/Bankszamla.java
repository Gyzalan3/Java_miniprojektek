public interface Bankszamla{
     double betesz(double osszeg);

    double kivesz(double osszeg) throws SajatHibaException;

    double getEgyenleg();

    class SajatHibaException extends Exception{
        public SajatHibaException(String Sajathiba) {
            super(Sajathiba);
        }
    }

}
