public class Esercizio1 {
    public static boolean stringaPariDispari(String str){
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
