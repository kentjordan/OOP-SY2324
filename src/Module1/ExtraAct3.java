package Module1;

import java.util.Arrays;

public class ExtraAct3{

    private void swap(int[] array, int i, int l){
        int tmp = array[i];
        array[i] = array[l];
        array[l] = tmp;
    }

    private int[] moveZeroes(int[] array){

        int l = array.length - 1;

        for (int i = 0; i < array.length; i++) {

            for (; true; l--) {

                if (array[l] == 0) {
                    continue;
                }

                break;
            }

            if (array[i] != 0) {
                continue;
            }

            if (i > l) break;

            swap(array, i, l);
        }

        return array;

    }

    public void run(){

        int[] array = {2,0,20,0,0,16,15,21,0,11};
        int[] movedArray = moveZeroes(array);

        System.out.println(Arrays.toString(movedArray));
    }
}
