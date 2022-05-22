public class AscendingSequence {

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        if (step > 0 && start < end) {
            int[] result = new int[(end - start + 1) / step];//создание массива

            for(int i = 0; i < result.length; i ++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }

            return result;

//            int j = 0;
//
//            for(int i = start; i < result.length; i += step) {
//                if (j < result.length) {
//                    result[j] = i;
//                    j++;
//                }
//
//            }
//            return result;


        }

        return new int[] {};//возврат пустого массива
    }





}
