public class ReturnsAfter {

    public  int [] LastFour(int[] arr) {
        int lastFourIndex = 0;
        int foursCounter = 0;
        int marker = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == marker) {
                lastFourIndex = i;
                foursCounter++;
            }
        }
        if (foursCounter == 0) {
            throw new RuntimeException();
        }

        int[] result = new int[arr.length - lastFourIndex-1];
        for (int i = lastFourIndex + 1, j = 0; i < arr.length; i++, j++) {
            result[j] = arr[i];

        }
        return result;
    }
}
