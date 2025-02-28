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
        if(texto.length() <= 1) return true;

        String aux = texto.toLowerCase();
        aux = aux.replaceAll("\\s+","");

        for(int i = 0; i < aux.length()/2; i++) {
            int pos2 = (aux.length() - 1) - i;
            if (aux.charAt(i) != aux.charAt(pos2)) return false;
        }
        return true;

    }
}
