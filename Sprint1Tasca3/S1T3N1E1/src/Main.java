import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Month enero = new Month("January");
        Month febrero = new Month("February");
        Month marzo = new Month("March");
        Month abril = new Month("April");
        Month mayo = new Month("May");
        Month junio = new Month("June");
        Month julio = new Month("July");
        Month septiembre = new Month("September");
        Month octubre = new Month("October");
        Month noviembre = new Month("November");
        Month deciembre = new Month("December");

        ArrayList<Month> meses = new ArrayList<Month>();
        meses.add(enero);
        meses.add(febrero);
        meses.add(marzo);
        meses.add(abril);
        meses.add(mayo);
        meses.add(junio);
        meses.add(julio);
        meses.add(septiembre);
        meses.add(octubre);
        meses.add(noviembre);
        meses.add(deciembre);


        for (int i=0; i<meses.size();i++){
            System.out.println(meses.get(i).getName());
        }

        System.out.println();

        HashSet<Month> mesesHash = new HashSet<>(meses);


        mesesHash.add(julio);


        for (Month i:mesesHash){
            System.out.println(i.getName());
        }
        System.out.println();


        Iterator<Month> it = meses.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

        System.out.println();

        Iterator<Month> itHash=mesesHash.iterator();
        while (itHash.hasNext()) {
            System.out.println(itHash.next().getName());
        }
    }
}