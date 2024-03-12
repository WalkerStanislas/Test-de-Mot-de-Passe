public class PasseTest {



    public Boolean Passe(String Passe){
        int f0 = 0;
        int f1 = 0;
        int f2 = 0;
        if (Passe.length() < 8){
            //Cas où le mot de passe est court
            System.out.println("Mot de passe trop court");
            return false;
        } else {
            //Cas où le mot de passe n'est pas court

            //Vérification d'une lettre
            for(int p=0;p < Passe.length();p++){
                if(Character.isLetter(Passe.charAt(p))){
                    f0=1;
                }
            }

            //Vérification de la présence d'un chiffre
            for(int r=0;r < Passe.length();r++){
                if(Character.isDigit(Passe.charAt(r))){
                    f1=1;
                }
            }

            //Vérification du caractère spécial
            for(int s=0;s < Passe.length();s++){
                char c= Passe.charAt(s);
                if(c>=33 && c<=46 || c==64){
                    f2=1;
                }
            }
        }
        if (f0 ==1 && f1==1 && f2==1){
            return true;
        } else {
            System.out.println("Mot de passe non conforme");
            return false;
        }
    }

    public static void main(String[] args) {
        PasseTest passeTest = new PasseTest();
        passeTest.Passe("Walker1234@");

    }




}
