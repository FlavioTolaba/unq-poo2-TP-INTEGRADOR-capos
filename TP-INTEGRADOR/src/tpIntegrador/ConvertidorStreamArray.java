package tpIntegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertidorStreamArray {

	public static <T> ArrayList<T> getArrayListFromStream(Stream<T> stream){

        // Convert the Stream to List
        List<T>
            list = stream.collect(Collectors.toList());

        // Create an ArrayList of the List
        ArrayList<T>
            arrayList = new ArrayList<T>(list);

        // Return the ArrayList
        return arrayList;
    }
}
