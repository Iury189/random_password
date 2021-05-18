package javasaa;

public class JavaSAA {

    public static void main(String[] args) {
        // Saber os valores da variáveis de dentro do construtor
        boolean tem_maiscula = true, tem_minuscula = true; 
        boolean tem_simbolos = true, tem_numeros = true;
        int tamanho_senha = 10;
        Senha senha = new Senha(tem_maiscula,tem_minuscula,tem_simbolos,tem_numeros,tamanho_senha);
        if (tem_maiscula != false || tem_minuscula != false || tem_simbolos != false || tem_numeros != false) {
            if (tamanho_senha >= 10 && tamanho_senha <= 20){
                System.out.println(senha.Gerar_senha());
            } else {
                System.out.println("O tamanho da senha precisa ser entre 10 e 20 caracteres.");
            }
        } else {
            System.out.println("Pelo menos um tipo de caractere deve estar ativo.");
        }   
    }
}