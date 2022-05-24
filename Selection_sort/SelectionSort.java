import javax.sound.midi.MidiChannel;

public class SelectionSort {
    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int mainIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[mainIndex]) {
                    mainIndex = j;

                }

            }
            if (i != mainIndex) {
                int temp = array[i];
                array[i] = array[mainIndex];
                array[mainIndex] = temp;

            }
        }

    }

}
