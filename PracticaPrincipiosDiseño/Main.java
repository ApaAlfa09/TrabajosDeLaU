public class Main {
    public static void main(String[] args) {
        RegistroUsuario registrarUsuario = new RegistroUsuario();
        RecuperacionCuenta recuperarCuenta = new RecuperacionCuenta();

        registrarUsuario.register();
        recuperarCuenta.recoverEmail();
    }
}
