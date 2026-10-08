package $__101_RateLimiter;

class FixedWindowRateLimiter_L1 {
    int limit = 5;
    int count = 0;
    boolean allowRequest(){
        if(count<limit){
            count++;
            return true;
        }
        return false;
    }

}

class Main{
    private static final int LIMIT = 10;
    public static void main(String[] args){
        FixedWindowRateLimiter_L1 limiter = new FixedWindowRateLimiter_L1();
        for(int i=1;i<=LIMIT;i++){
            System.out.println("Request : " + i+ " : "+ limiter.allowRequest());
        }
    }
}