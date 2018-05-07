package utils;

public class MyStringUtils {
	public static boolean isNullOrEmpty(String s){
        if(s == null || s.trim().isEmpty()){
            return true;
        }
        return false;
    }
	
	public static void methodeQuiSertARienJustePourFaireUnConflit() {
		System.out.println("CONFLIIIIIT");
	}

	public static void methodeQuiSertARienJustePourFaireGenreJAiModifieLeProgramme() {
		System.out.println("oui");
	}
}
