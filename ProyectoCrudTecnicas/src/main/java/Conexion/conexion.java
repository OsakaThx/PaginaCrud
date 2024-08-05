/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author hoshu
 */
public class conexion {
    import java.sql*;
Connection con;
public conexion(){
try{
    Class.forName("com.mysql.jdbc.Driver");
}
} catch (Exception e){
    System.out.println("no puedo conectarse al BD");
}
}

