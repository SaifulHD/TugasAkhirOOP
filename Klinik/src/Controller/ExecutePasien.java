/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import Model.Pasien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ExecutePasien {
    
    public String InsertPasien(Pasien psn){
        String query = "INSERT INTO pasien (nama,tgl_lahir) "+"VALUES (?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, psn.getNama());
            pstm.setString(2, psn.getTgl_lahir());
            // ganti tanggal goblog
            //pstm.setString(3, psn.getTgl_pendaftaran());
            pstm.executeUpdate();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";  
            Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE,null,ex);
        }
        conMan.Logoff();
        return Respon;
    }
    
    public ArrayList<Pasien> ListPasien(){
        
        ArrayList<Pasien> arlistpsn = new ArrayList<>();
        String query = "SELECT * FROM pasien";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Pasien psn = new Pasien();
                psn.setId_pasien(rs.getString("NRP"));
                psn.setNama(rs.getString("Nama"));
                psn.setTgl_lahir(rs.getString("NoHP"));
                psn.setTgl_pendaftaran(rs.getString("Alamat"));
                
                arlistpsn.add(psn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE,null,ex);
        }
        conMan.Logoff();
        return arlistpsn;
    }
}
