import java.util.Arrays;

public class Merged {



        public static void main(String[] args) {


            int[] array1 = {6,9,12,34,67}; //first array
            int[] array2 = {3, 5, 19, 27, 36}; //second array
            int[] mergedArray = new int[array1.length + array2.length]; //arrays merged
            int j = 0, k = 0; //counter


            for (int i = 0; i < mergedArray.length; i++) {
                if(j == array1.length){
                    mergedArray[i] = array2[k];
                    k++;
                }
                else if(k == array2.length){
                    mergedArray[i] = array1[j];
                    j++;
                }
                 else if (array1[j] < array2[k]) {
                    mergedArray[i] = array1[j];
                    j++;
                } else {
                    mergedArray[i] = array2[k];
                    k++;
                }


            }

            System.out.println(Arrays.toString(mergedArray));

        }

        {
        }
    }


