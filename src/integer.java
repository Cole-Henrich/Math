import java.util.ArrayList;

public class integer {
    public static ArrayList<Integer>removeMany(ArrayList<Integer>arrayList, String comma_separated_indices){
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
    public static ArrayList<Integer>doRemove(ArrayList<Integer>arrayList, ArrayList<Integer>indices){
        for (Integer index : indices) {
            arrayList.remove(index);
        }
        return arrayList;
    }
}
