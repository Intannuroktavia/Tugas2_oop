package VolumeBalok;

/**
 *
 * @author Intan Nur Oktavia_20103321
 */
public class HitungVolumeBalok {
    
    protected double pj, lb, tg, vol;
    
    protected HitungVolumeBalok (double Pj, double Lb, double Tg){
        
        this.setPanjang(Pj);
        this.setLebar(Lb);
        this.setTinggi(Tg);
        
    }
    
   protected void setPanjang(double Pj){
        
        this.pj=Pj;
        
    }
    
    protected void setLebar(double Lb){
        
        this.lb=Lb;
        
    }
    
    protected void setTinggi (double Tg){
        
        this.tg=Tg;
        
    }
    
    protected double HV(){
        
        this.vol= this.pj * this.lb * this.tg; 
        return this.vol;
        
    }
    
    protected void tapvol(){
        
        this.HV();
        System.out.println("Hitung Volume Balok");
        System.out.println("======================");
        System.out.println("Nilai Panjang = "+this.pj+"cm�");
        System.out.println("Nilai Lebar = "+this.lb+"cm�");
        System.out.println("Nilai Tinggi = "+this.tg+"cm�");
        System.out.println("Nilai Volume Balok = "+this.vol+"cm�");
        
    }
    
}
