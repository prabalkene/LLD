package org.example;

public class Y implements X{


    void f()
    {
        int i = 10;
        System.out.println("i="+i);
        int max = Integer.MIN_VALUE;
        int res = 0;

        int a[] = {2,3,-8,7,-1, 2,3};

        for( int s:a) {

            res = res + s;
            max = Math.max(max, res);
            if(res < 0)
                res =0;
        }
        System.out.println(max);

        String h = "fghahjgyijdgagcfdag";
        int l= h.length();
        int count =0;
        int countg = 0;



        for(int k=0; k < h.length(); k++) {

            if(h.charAt(k)=='a')
                count+=1;
            if(h.charAt(k)=='g')
                countg  =  countg + count;

        }
        System.out.println("i,j "+ countg);



    }

    void getLeader() {

       int [] A={1,4,7,5,2,7,-1,15};

        int max = 3;
        int count = 1;

        for(int i=1; i <A.length; i++ ) {
            if(A[i]>max) {
                count+=1;
                max = A[i];
            }
        }
        System.out.println("Leader: " + count);
    }


    void getBulbOn() {
        int a[] = {0,0,1,0,1,1,0};

        int count = 0;

        for(int i=0; i< a.length; i++) {

            if(a[i]==0) {
                count+=1;
                for(int j=i; j<a.length; j++) {
                    if(a[j]==0)
                        a[j]=1;
                    else a[j]=0;
                }
            }
        }
        System.out.println("Bulb: "+ count);

    }
}

