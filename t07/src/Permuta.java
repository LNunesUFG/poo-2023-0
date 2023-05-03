public class Permuta {
    public static void Permutacao(String p, String S) {
        if(S.length() == 1) {
            System.out.println(p+S);
        } else {
            String Slinha;
            String pLInha;

            for(int i=0; i < S.length(); i++) {
                Slinha = S.substring(0, i) + S.substring(i+1);
                pLInha = p + S.charAt(i);
                Permutacao(pLInha, Slinha);
            }
        }
    }

    public static void main(String[] args) {
        Permutacao("lucas", "nunes" );
    }
}
