/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

/**
 *
 * @author Usuario
 */
import javax.swing.*;

// Interfaz para la aplicación
interface AppAccess {
    void grantAccess();
}

// Clase real que implementa la interfaz
class RealAppAccess implements AppAccess {
    @Override
    public void grantAccess() {
        JOptionPane.showMessageDialog(null, "Acceso a la aplicación concedido.");
    }
}

// Proxy para el acceso a la aplicación
class AppAccessProxy implements AppAccess {
    private RealAppAccess appAccess;
    private String username;
    private String password;

    public AppAccessProxy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void grantAccess() {
        if (appAccess == null) {
            if (authenticate(username, password)) {
                appAccess = new RealAppAccess();
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado. Credenciales incorrectas.");
                return;
            }
        }
        appAccess.grantAccess();
    }

    private boolean authenticate(String username, String password) {
        // Simular la autenticación; aquí puedes definir tus reglas de autenticación
        return "usuario".equals(username) && "clave".equals(password);
    }
}

public class Main {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Usuario:");
        String password = JOptionPane.showInputDialog("Contraseña:");

        // Utilizando el Proxy para el acceso a la aplicación
        AppAccess app = new AppAccessProxy(username, password);

        // Intentar acceder a la aplicación
        app.grantAccess();
    }
}