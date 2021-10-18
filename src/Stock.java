 class Stock {
    static int stockbuy(int a[],int n){
        int p = 0;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                p+=a[i] - a[i-1];
            }
        }
        return p;
    }
    public static void main(String args[]){
        int a[]={1,5,3,8,12};
        int n = 5;
        System.out.println(" Total Stock profits:");
        System.out.print(stockbuy(a,n));
    }
}
