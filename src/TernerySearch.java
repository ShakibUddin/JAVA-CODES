public class TernerySearch {
    public static int ternerySearch(int key,int[] array,int left,int right ){
        if(right>=left){
            int mid1 = left + (right-left)/3;
            int mid2 = right - (right-left)/3;
            if(array[mid1]==key){
                return mid1;
            }
            if(array[mid2]==key){
                return mid2;
            }
            if(key<array[mid1]){
                return ternerySearch(key,array,left,(mid1-1));
            }
            if(key>array[mid2]){
                return ternerySearch(key,array,(mid2+1),right);
            }
            else{
                return ternerySearch(key,array,(mid1+1),(mid2-1));
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,4,6,8,9,12,15,16,29,38,99};
        int key = 40,x=0;
        int left = 0, right = 10;//array size is 11
        x=ternerySearch(key,array,left,right);
        if(x!=-1){
            System.out.println(key+" exists in array at index "+x);
        }
        else{
            System.out.println(key+" does not exist in array");
        }
    }
}
