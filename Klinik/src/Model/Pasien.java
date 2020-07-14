package Model;

import java.sql.Date;

public class Pasien {
    String id_pasien,nama,tgl_lahir,tgl_pendaftaran;

    public Pasien() {
        
    }

    public String getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getTgl_pendaftaran() {
        return tgl_pendaftaran;
    }

    public void setTgl_pendaftaran(String tgl_pendaftaran) {
        this.tgl_pendaftaran = tgl_pendaftaran;
    }

    public Pasien(String id_pasien, String nama, String tgl_lahir, String tgl_pendaftaran) {
        this.id_pasien = id_pasien;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.tgl_pendaftaran = tgl_pendaftaran;
    }
    
    
}
