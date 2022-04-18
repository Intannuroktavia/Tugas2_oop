package VolumeB1;

/**
 *
 * @author Intan Nur Oktavia_20103321
 */
public class HitungVolumeB1 {
    
    public double pj, lb, tg, vol;
    
    public HitungVolumeB1 (double Pj, double Lb, double Tg){
        
        this.setPanjang(Pj);
        this.setLebar(Lb);
        this.setTinggi(Tg);
        
    }
    
   public void setPanjang(double Pj){
        
        this.pj=Pj;
        
    }
    
    public void setLebar(double Lb){
        
        this.lb=Lb;
        
    }
    
    public void setTinggi (double Tg){
        
        this.tg=Tg;
        
    }
    
    public double HV(){
        
        this.vol= this.pj * this.lb * this.tg; 
        return this.vol;
        
    }
    
    public void tapvol(){
        
        this.HV();
        System.out.println("Hitung Volume Balok");
        System.out.println("======================");
        System.out.println("Nilai Panjang = "+this.pj+"cm�");
        System.out.println("Nilai Lebar = "+this.lb+"cm�");
        System.out.println("Nilai Tinggi = "+this.tg+"cm�");
        System.out.println("Nilai Volume Balok = "+this.vol+"cm�");
        
    }
    
}
