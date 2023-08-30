package main.java.com.example.database;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;




public class Database {

    private Connection con=null;

    private Statement stmt=null;

    private PreparedStatement pstmt=null;

    private InputStream input=null;


  private  Properties prop=null;



  public boolean GetOnConnection(){


      input=getPropertyFile();

      prop=new Properties();


      try {
          Class.forName("");

          prop.load(input);

      }
  }


    }

