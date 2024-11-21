package formulario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {

    ArrayList<Variables> usuarioLista;
    private Connection conexion; //Objeto que representa la conexión a la base de datos.
    private ResultSet rs = null; //Objeto para almacenar los resultados de una consulta.
    private PreparedStatement st; //Objeto para ejecutar consultas parametrizadas en la base de datos.

    //Metodo para conectar a la base de datos.
    public void connectMysql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/proyecto_final",
                    "root", "");
            if (conexion != null) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error en la conexion de la base de datos "
                    + e.toString());
        }
    }

    // Metodo para cargar los datos de la base de datos en la tabla de administracion de usuarios.
    ArrayList<Variables> cargarDatos() {
        usuarioLista = new ArrayList();
        String nom;
        String ape;
        String correo;
        String contraseña;
        String direccion;
        int edad;
        String genero;
        String producto;
        String formaPago;

        try {
            st = conexion.prepareStatement("select * from usuarios");
            rs = st.executeQuery();

            while (rs.next()) {
                nom = rs.getString("nombre");
                ape = rs.getString("apellido");
                correo = rs.getString("correo_electronico");
                contraseña = rs.getString("contraseña");
                direccion = rs.getString("direccion");
                edad = rs.getInt("edad");
                genero = rs.getString("genero");
                producto = rs.getString("producto");
                formaPago = rs.getString("Foma de Pago");

                Variables cargar = new Variables(nom, ape, correo, contraseña, direccion, edad, genero,
                producto,formaPago);
                usuarioLista.add(cargar);
            }
            usuarioLista.toString();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + e.toString());

        }

        return usuarioLista;
    }

    //Metodo para consultar en la base de datos si el usuario existe. 
    public boolean validarUsers(String user) {
        boolean encontrado = false;

        try {
            st = conexion.prepareStatement("select * from usuarios where nombre_usuario=" + "'" + user + "'");
            rs = st.executeQuery();
            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + e.toString());
        }
        return encontrado;

    }

    //Metodo para consultar en la base de datos si la contraseña ingresada es correcta. 
    boolean validarPassword(String contraseña) {
        boolean encontrado = false;

        try {
            st = conexion.prepareStatement("select * from usuarios where contraseña=" + "'" + contraseña + "'");
            rs = st.executeQuery();
            if (rs.next()) {
                encontrado = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + e.toString());
        }
        return encontrado;
    }

    // Metodo para determinar que tipo de usuario ingresa al sistema.
//    boolean tipoUser(String user) {
//        boolean encontrado = false;
//
//        try {
//            st = conexion.prepareStatement("select * from usuarios where nombre_usuario=" + "'" + user + "'");
//            rs = st.executeQuery();
//            if (rs.next()) {
//
//                String tipoUsuario = rs.getString("tipo_usuario");
//
//                System.out.println(tipoUsuario.toString());
//
//                if ("admin".equals(tipoUsuario)) {
//
//                    encontrado = true;
//                }
//            }
//            rs.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + e.toString());
//        }
//        return encontrado;
//    }

    //Metodo para insertar usuarios nuevos a la base da datos.
//    public void insertarUsuarios(Variables registroUsuarios) {
//        try {
//            //  1      2        3                      4               5              6         7
//            String sql = "INSERT INTO usuarios(nombre,apellido,correo_electronico,numero_telefonico,nombre_usuario,password,tipo_usuario) VALUES(?,?,?,?,?,?,?)";
//            PreparedStatement statement = conexion.prepareStatement(sql);
//
//            statement.setString(1, registroUsuarios.getNombre());
//            statement.setString(2, registroUsuarios.getApellido());
//            statement.setString(3, registroUsuarios.getCorreo());
//            statement.setInt(4, registroUsuarios.getNumeroTelefonico());
//            statement.setString(5, registroUsuarios.getNombreUsuario());
//            statement.setString(6, registroUsuarios.getContraseña());
//            statement.setString(7, "user");
//            statement.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Registro Exitoso Usuario");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error" + "\n" + e.toString());
//
//        }
//
//    }

    // Metodo para modificar usuarios existentes en la base de datos .
//    public void modUsuarios(Variables modificarUsuario) {
//
//        usuarioLista = new ArrayList();
//        try {
//
//            String sql = "UPDATE usuarios set nombre=?,apellido=?,correo_electronico=?,numero_telefonico=?,password=?,tipo_usuario=? WHERE nombre_usuario=?";
//            PreparedStatement statement = conexion.prepareStatement(sql);
//
//            statement.setString(1, modificarUsuario.getNombre());
//            statement.setString(2, modificarUsuario.getApellido());
//            statement.setString(3, modificarUsuario.getCorreo());
//            statement.setInt(4, modificarUsuario.getNumeroTelefonico());
//            statement.setString(5, modificarUsuario.getContraseña());
//            statement.setString(6, modificarUsuario.getTipoUsuario());
//            statement.setString(7, modificarUsuario.getNombreUsuario());
//            statement.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//
//    }

    // Metodo para borrar usuarios de la base de datos.
//    public void elimanarPersona(String nombreUsuario) {
//
//        try {
//            st = conexion.prepareStatement("delete from usuarios where nombre_usuario=" + "'" + nombreUsuario + "'");
//            st.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Usuario Borrado Correctamente");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + e.toString());
//        }
//    }

    // Metodo para cerrar las conexiones a la base datos.
    public void cerrar() {
        try {
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + "\n" + e.toString());
        }
    }

}
