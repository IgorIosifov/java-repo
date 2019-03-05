package ru.geekbrains.Lesson_1_extra;

public class Main {

    public static void main(String[] args) {
        int[] counter = new int[9];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String[] text = new String[9];
        text[0] = "rp  cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj";
        text[1] = "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovx  miwup";
        text[2] = "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk xilaskz";
        text[3] = "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox";
        text[4] = "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h  qgf";
        text[5] = "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx";
        text[6] = "ozck dfp v viiazvtbxrkmpaejou cegmnsvajivpzz";
        text[7] = "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv";
        text[8] = "ag eptcnfncgqiqmf  oaxfsdxvb s  eoztwbjbvrn vg  y c";

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                char[] str = text[i].toCharArray();
                for (int k = 0; k < vowels.length; k++) {
                    if (str[j] == vowels[k]) {
                        counter[i]++;
                    }
                }
            }
            System.out.println(counter[i]);
        }
    }
}
