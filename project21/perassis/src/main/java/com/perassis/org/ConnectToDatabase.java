package com.perassis.org;

import java.sql.*;

public class ConnectToDatabase{

    private Connection conn;

    private  String userName;
    private  String password;
    private  String host;

    public ConnectToDatabase(String host, String userName, String password) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.host = host;
            this.userName = userName;
            this.password = password;
        }catch (Exception e){
            System.out.println(e);
        }
    }
    private void connect(){
        try{
            conn = DriverManager.getConnection(host,userName,password);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private void dissconnect(){
        try{
            conn.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert(String query){
        try{
            connect();
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public String Select (String query, String field){
        try{
            connect();
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                String userPass = rs.getString(field);
                return userPass;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
