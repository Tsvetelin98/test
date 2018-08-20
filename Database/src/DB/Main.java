package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{
  // метод който се свързва със SQL сървъра и връща ресурс (връзка) към него,
  // а ако свързването е неуспешно, ще върне NULL
  private static Connection connect(String url, String user, String password){
    Connection result = null;
    try{
      result = DriverManager.getConnection(url, user, password);
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    return result;
  }

  public static void main(String[] args){
    // localhost е IP на сървъра, 3306 е порта, mydb е базата
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "eniware";
    String pass = "Eniware8";

    Connection link = Main.connect(url, user, pass);

    if(link == null){
      System.out.println("Опа, MySQL не е пуснат!");
      return;
    }
    else{
      System.out.println("Свързах се с MySQL сървъра!");
    }

    // В JDBC Statement е заявката, а ResultSet е резултата от нея
    Statement stmt = null;
    ResultSet resultSet = null;

    try{
      stmt = link.createStatement();
      resultSet = stmt.executeQuery("SELECT text, answer, answers FROM questions");

      // Обхождаме резултатната таблица ред по ред и отпечатваме на екрана
      while (resultSet.next()) {
        System.out.print(""+resultSet.getString("text"));
        System.out.print(", Answers: "+resultSet.getString("answer"));
        System.out.println(", Group: "+resultSet.getString("answers"));
      }
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    finally{
      try{
        if(stmt != null) stmt.close();
        if(resultSet != null) resultSet.close();
        if(link != null) link.close();
      }
      catch(SQLException e2){
        e2.printStackTrace();
      }
    }
  }
}