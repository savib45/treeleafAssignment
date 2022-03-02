public class QuestionNo1 {
QuestionNo1(){
    int A[]= {1,9,6,4,5};
    int n= A.length;
    int count=0;
    for(int i=0;i<n-1;i++){
        for (int j=i+1;j<n;j++){
            if(i<j && A[i]>A[j]){
//                System.out.println(i+" , "+j);
                System.out.println(A[i]+" , "+A[j]);
                count++;
            }
        }
    }
    System.out.println("The total number of inversion is"+count);
}

}
