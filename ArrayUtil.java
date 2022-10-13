import java.util.Collections;

public class ArrayUtil{

    public static void reverse(String[] arr){
        int arrayLength = arr.length;
        int middlePoint = arrayLength/2;
        for(int i = 0;i <middlePoint;i++){
            String tempValue = arr[i];
            arr[i]=arr[arrayLength - i-1];
            arr[arrayLength-i-1]=tempValue;
        }
       

    }
    public static String[] resize(String[] arr){
        int arrayLength = arr.length * 2;
        String[] newArray = new String[arrayLength];
        for(int i = 0;i < arr.length; i++){
            newArray[i] = arr[i];

        }
        return newArray;
    }
    public static String[] add(String element, String[] array){
        for(int i =0;i<array.length;i++){
            if(array[i]==null){
                array[i]= element;
                return array;
            }
        }
        int length = array.length;
        array = resize(array);
        array[length] = element;
        return array;

    }
    public static boolean contains(String element, String[] array){
        boolean x = false;
        for(int i =0;i<array.length;i++){
            if(array[i].equals(element)){
                x=true;
                break;
            }
        }
        return x;
        
    }
}