public class metodos {
        public static void main(String[]args){
            
            String primeiroNome ="Gustavo";
            String segundoNome = "Terceiro";
            String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

            System.out.println(nomeCompleto);
        }
        public static String nomeCompleto(String primeiroNome,String segundoNome){
            return "Olá eu me chamo "  +  primeiroNome.concat(" " ).concat(segundoNome);
        }
        
}
