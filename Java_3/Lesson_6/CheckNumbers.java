public class CheckNumbers {

    public boolean onesAndFours (int [] arr) {
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i]!= 4) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        } return flag;
    }
}
