public class OrdArray {
    long[] a;
    int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }


    public void insert(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
            if (a[j] > value) // (linear search)
                break;
        for (int k = nElems; k > j; k--) // move bigger ones up
            a[k] = a[k - 1];
        a[j] = value; // insert it
        nElems++; // increment size
    } // end insert()


    public boolean delete(long value) {
        int searchKey = find(value);
        if (searchKey == nElems) return false;
        else {
            for (int k = searchKey; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }


    public void display() {
        for (int j = 0; j < nElems; j++) System.out.println(a[j] + " ");
        System.out.println("");
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }
}


