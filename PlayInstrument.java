package Music;
public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        //Gunakan if-elsa untuk menentukan Insrtument yang paling mahal dan paling murah
        
        a.setType("Guitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        b.print();
        c.print();

        if(a.getPrice() > b.getPrice()&& a.getPrice() > b.getPrice()){
            System.out.println("Gitar adalah Insrtument paling mahal");
        }else if(b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice ()){
            System.out.println("Piano adalah Insrtument paling mahal");
        }else{
            System.out.println("Violin adalah Insrtumen paling mahal");

        if(a.getPrice() < b.getPrice() && a.getPrice() < b.getPrice()){
            System.out.println("Gitar adalah Insrtument paling murah");
        }else if(b.getPrice() < a.getPrice() && b.getPrice() < a.getPrice()){
            System.out.println("Piano adalah Insrtument paling murah");
        }else{
            System.out.println("Violin adalah Insrtument paling murah");
        }

        } 
            
    }
 }
    

