public class Palindromo {
    private String texto;
    public Palindromo () {
        texto = "";
    }
    public Palindromo(String texto) {
        setTexto(texto);
    }
    public String getTexto () {
        return texto;
    }
    public void setTexto (String texto) {
        if (texto == null){
            System.out.println("Não é permitido passar null como valor!");
        } else {
        this.texto = texto; }
    }
    public boolean verificar(String texto) {
        String textoSemEspaço = texto.replaceAll("\\s+","");
        for (int i = 0; i < textoSemEspaço.length(); i++) {
            char caractere = textoSemEspaço.charAt(i);
            String letra = String.valueOf(caractere);
            char caractere2 = textoSemEspaço.charAt((textoSemEspaço.length() - 1) - i);
            String letra2 = String.valueOf(caractere2);
            if (letra.equals(letra2)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
