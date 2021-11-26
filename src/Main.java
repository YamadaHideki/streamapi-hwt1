public class Main {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        for (int i = 0; i < list.length; i++) {
            if (list[i] < 0) {
                list[i] = 0;
            }
            if ((list[i] % 2) != 0) {
                list[i] = 0;
            }
        }

        boolean iter = true;
        while (iter) {
            iter = false;
            for (int i = 1; i < list.length; i++) {
                if (list[i] < list[i - 1]) {
                    swap(list, i, i-1);
                    iter = true;
                }
            }
        }

        int count = 0;
        for (int v : list) {
            if (v > 0) {
                count++;
            }
        }

        int[] newList = new int[count];
        for (int i = 0, j = 0; i < list.length; i++) {
            if (list[i] > 0) {
                newList[j] = list[i];
                j++;
            }
        }

        for (int v : newList) {
            System.out.println(v);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
