package Collections;

import java.util.*;

public class Main {
   public static void main(String[] args) {

       List<Car> list = new ArrayList<>();
       list.add(new Car("m3",CarBrand.BMW,false));
       list.add(new Car("m4",CarBrand.BMW,true));
       list.add(new Car("m5",CarBrand.BMW,false));
       list.add(new Car("m2",CarBrand.BMW,true));
       list.add(new Car("astra",CarBrand.OPEL,false));
       list.add(new Car("cx 50",CarBrand.VOLVO,true));
       list.add(new Car("rio",CarBrand.KIA,true));
       list.add(new Car("2115",CarBrand.LADA,true));
       list.add(new Car("2107",CarBrand.LADA,false));
       list.add(new Car("m3",CarBrand.BMW,false));
       list.add(new Car("m4",CarBrand.BMW,true));
       list.add(new Car("m5",CarBrand.BMW,false));
       list.add(new Car("m2",CarBrand.BMW,true));
       list.add(new Car("astra",CarBrand.OPEL,false));
       list.add(new Car("cx 50",CarBrand.VOLVO,true));
       list.add(new Car("rio",CarBrand.KIA,true));
       list.add(new Car("2115",CarBrand.LADA,true));
       list.add(new Car("2107",CarBrand.LADA,false));


        Set<Car> carSet = new HashSet<>(list);

        for(Car car : carSet){
            System.out.println(car);
        }
       System.out.println("\n" + "Size: " + carSet.size());

       System.out.println("\n------------------------------------------------------------------------------");

        Map<Car, Integer> map = new HashMap<>();

        for(Car car : list){
            if(map.containsKey(car)){
                int val = map.get(car);
                map.put(car,++val);
            }else{
                map.put(car,1);
            }
        }

        for(Map.Entry<Car,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

       System.out.println(map.size());

    }
}


