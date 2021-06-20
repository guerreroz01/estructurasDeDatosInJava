public class ClassDataArray {

    private Person[] a;
    private int nElements;

    public ClassDataArray(int max) {
        a = new Person[max];
        nElements = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j=0; j<nElements; j++) {
            if (a[j].getLast().equals(searchName)){
                break;
            }
        }
        if(j==nElements){
            return null;
        } else {
            return a[j];
        }
    }

    public void insert(String last, String first, int age) {
        a[nElements] = new Person(last, first, age);
        nElements++;
    }

    public boolean delete(String searchName) {
        int j;
        for(j=0; j<nElements;j++){
            if(a[j].getLast().equals(searchName)){
                break;
            }
        }
        if(j==nElements) return false;
        else {
            for(int k=j; k<nElements; k++) {
                a[k] = a[k +1];
            }
            nElements--;
            return true;
        }
    }
    public void display() {
        for(int j=0; j<nElements; j++){
            a[j].displayPerson();
        }
    }
}
