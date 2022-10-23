public class Registro {
        private static Registro registro;

        private Registro() {
            System.out.println("Registro Criado");
        }

        public static Registro getRegistro() {
            if(registro == null) return registro = new Registro();
            System.out.println("Registro reutilizado");
            return registro;
        }
}
