package entities;
import java.util.Random;

public class Generator {

    public Object[] caracteres = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                                  "0","1","2","3","4","5","6","7","8","9","!","<",">",",","@","#","$","%","'","%","&","*","|","/","()",":",
                                  ";","?","{}","^","~","¨","´","[]"};
    public String nickName;

    public String gerar_senha(String nickName){
        StringBuilder senha = new StringBuilder();

        this.nickName = nickName;
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int aleatoryIndice = random.nextInt(caracteres.length);
            Object aleatoryElement = caracteres[aleatoryIndice];
            senha.append(aleatoryElement);

        }

        return "senha: " + nickName + senha.toString();
    }
}