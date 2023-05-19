package Strategy;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        int n=array.length;
        for(int i=0;i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        System.out.println("Bubble Sort strategy");
    }
}
