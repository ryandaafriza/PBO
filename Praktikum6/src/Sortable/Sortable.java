package Sortable;

abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        // Shell sort body
        int arr_len = a.length;
        for (int gap = arr_len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr_len; i += 1) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp)>0; j -= gap)
                    a[j] = a[j - gap];
                a[j] = temp;
            }
        }
    }
}
