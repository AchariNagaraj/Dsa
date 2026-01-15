 //query
        int q=sc.nextInt();//no of elements to be queried
        while(q-- !=0){
            //int n=(int)sc.next().charAt(0)-97;//take the character, type convert to ascival, subtract 97 for indexing 
            //above method is not needed because java will automatically type convert in case of orithmetics or indexing
            int n=sc.next().charAt(0)-97;
            //fetching
            System.out.println(hash[n]);
        }