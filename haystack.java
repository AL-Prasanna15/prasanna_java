public class haystack {
    public static void main(String[] args) {
        String haystack = "lakshmi prasanna!";
        String needle = "s";
        int index = haystack.indexOf(needle);
        if(index!=-1){
            System.out.println("needle found at index :"+index);
        }
        else{
            System.out.println("-1");
        }
    }
}

