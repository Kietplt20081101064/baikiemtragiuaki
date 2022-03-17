package baitapquanlynhadat;
 
public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
 
    public GiaoDichDat() {
        
    }
 
    public GiaoDichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }
 
    public String getLoaiDat() {
        return loaiDat;
    }
 
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
     
    public void nhap () {
        System.out.print("Nhập loại đất (A/B/C): ");
        loaiDat = scanner.nextLine();
    }
 
    @Override
    public String toString() {
        return .toString() + ", loại đất: " + this.loaiDat;
    }
}
