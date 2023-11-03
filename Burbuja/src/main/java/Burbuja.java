/**
 *
 * @author rv
 */


public class Burbuja {
    public static void Seleccion(int[] arr){
    int n = arr.length;
    for (int i=0; i < n -1; i++) {
        int minIndex =i;
        for(int j= i + 1; j < n; j++){
            if (arr[j] < arr[minIndex]) {
                minIndex =j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    } 
} 
public static void BubbleSort(int[]arr){
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++){
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j+1];
                        arr[j+1] = temp;
            }
        }
    }
}

public static String mostrarArray (int[] arr){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < arr.length; i++){
        sb.append(arr[i]).append( " ");
    }
    return sb.toString();
    
}

}
