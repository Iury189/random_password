package javasaa;
import java.util.Random;

public final class Senha {
                            // Atributos (primeiros 4 atributos servem como banco de dados)
    private String maiscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String minuscula = "abcdefghijklmnopqrstuvwxyz";
    private String simbolos = "!@#$%¨&*()-_=+\\|/[]´~;{}`^?:<>,.°ª";
    private String numeros = "1234567890";
    private int quantidade;
    private boolean bmaiscula, bminuscula, bsimbolos, bnumeros;

                            // Getter e Setters
    public String getMaiscula() { return this.maiscula; }

    public void setMaiscula(String maiscula) { this.maiscula = maiscula; }

    public String getMinuscula() { return this.minuscula; }

    public void setMinuscula(String minuscula) { this.minuscula = minuscula; }

    public String getNumeros() { return this.numeros; }

    public void setNumeros(String numeros) { this.numeros = numeros; }

    public String getSimbolos() { return this.simbolos; }

    public void setSimbolos(String simbolos) { this.simbolos = simbolos; }

    public int getQuantidade() { return this.quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    
    public boolean getBmaiscula() { return bmaiscula; }

    public void setBmaiscula(boolean bmaiscula) { this.bmaiscula = bmaiscula; }

    public boolean getBminuscula() { return bminuscula; }

    public void setBminuscula(boolean bminuscula) { this.bminuscula = bminuscula; }

    public boolean getBsimbolos() { return bsimbolos; }

    public void setBsimbolos(boolean bsimbolos) { this.bsimbolos = bsimbolos; }

    public boolean getBnumeros() { return bnumeros; }

    public void setBnumeros(boolean bnumeros) { this.bnumeros = bnumeros; }
    
                           // Método construtor
    public Senha(boolean maiscula, boolean minuscula, boolean simbolos, boolean numeros, int quantidade) {
        this.setBmaiscula(maiscula);
        this.setBminuscula(minuscula);
        this.setBsimbolos(simbolos);
        this.setBnumeros(numeros);
        this.setQuantidade(quantidade);
    }
                            // Métodos
    public void DesativarMaiscula() { this.setBmaiscula(false); }
    
    public void AtivarMaiscula() { this.setBmaiscula(true); }
    
    public void DesativarMinuscula() { this.setBminuscula(false); }
    
    public void AtivarMinuscula() { this.setBminuscula(true); }
    
    public void DesativarNumeros(){ this.setBnumeros(false); }
    
    public void AtivarNumeros() { this.setBnumeros(true); }
    
    public void DesativarSimbolos() { this.setBsimbolos(false); }
    
    public void AtivarSimbolos() { this.setBsimbolos(true); }
    
    // Métodos que definem a posição randômica de caracteres e o tamanho da senha 
    public char Caractere_random(String str){
        Random random = new Random();
        int index = random.nextInt(str.length());
        return str.charAt(index);
    }
    
    public String Gerar_senha(){
        String caractere = "", senha = "";
        if (this.getBmaiscula()) {
            caractere += this.maiscula;
        }
        if (this.getBminuscula()) {
            caractere += this.minuscula;
        }
        if (this.getBnumeros()) {
            caractere += this.numeros;
        }
        if (this.getBsimbolos()) {
            caractere += this.simbolos;
        }
        while (senha.length() < this.getQuantidade()) {
            senha += this.Caractere_random(caractere);
        }
        return senha;
    }
}