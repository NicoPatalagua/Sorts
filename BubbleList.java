//Nicolas Patalagua*/
import java.util.ArrayList;
public class BubbleList {
	public static void BubbleSort(ArrayList List){
        for (int i = 0; i < List.size()- 1; i++){
            for (int j = 0; j < List.size() - i - 1; j++) {
                if ((int) List.get(j) >= (int) List.get(j + 1)) {
                    int Aux = (int) List.get(j);
                    List.set(j, List.get(j + 1));
                    List.set(j + 1, Aux);
                }
            }
          }		
       
        System.out.println("BubbleSort: "+ List);
	}
    public static void main (String[] args){
        ArrayList arrayList= new ArrayList();
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.print("List:"+arrayList +"\n");
        BubbleSort(arrayList);
    }
}
