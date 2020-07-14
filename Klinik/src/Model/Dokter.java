package Model;

public class Dokter {
    String id_dokter,username,nama,spesialisasi,tgl_lahir;

    public Dokter(){
        
    }
    
    public String getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public Dokter(String id_dokter, String username, String nama, String spesialisasi, String tgl_lahir) {
        this.id_dokter = id_dokter;
        this.username = username;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.tgl_lahir = tgl_lahir;
    }
    
    
}
