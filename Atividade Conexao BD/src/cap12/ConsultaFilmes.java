package cap12;
import java.sql.*;
import javax.swing.*;
public class ConsultaFilmes {
    public static void main (String[] args) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/mysql";
        try{
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT codigo, titulo FROM Filmes WHERE codigo > ? AND codigo < ? ORDER BY codigo";

        }
    }
}
