import java.util.ArrayList;

public class dubl {
    public static ArrayList<Double>removeMany(ArrayList<Double>arrayList, String comma_separated_indices){
        String[] strings = comma_separated_indices.split(",");
        ArrayList<Integer>indices = new ArrayList<>(strings.length);
        for (int i = 0; i < strings.length; i++){
            indices.add(0);
        }
        for (int i = 0; i < strings.length; i++) {
            int index = Integer.parseInt(strings[i]);
            indices.set(i, index);
        }
        return doRemove(arrayList, indices);
    }
    public static ArrayList<Double>doRemove(ArrayList<Double>arrayList, ArrayList<Integer>indices){
        for (Integer index : indices) {
            arrayList.remove(index);
        }
        return arrayList;
    }
}
