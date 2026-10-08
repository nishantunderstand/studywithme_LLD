package $__101_RateLimiter;

/**
 * counter
 * limit
 * wait : 10ms
 */

class FixedWindowRateLimiter {
    int count;
    int limit=5;
    long windowStart = System.currentTimeMillis();
    long windowSize = 10_000; // 10 seconds

    boolean allowRequest(){
        long currentTime = System.currentTimeMillis();

        // New Window TODO
        if(currentTime-windowStart>=windowSize){
            count=0;
            windowStart=currentTime;
        }

        if(count<limit){
            count++;
            return true;
        }
        return false;
    }
}


class Main2{
    private static final int LIMIT = 10;
    public static void main(String[] args){
        FixedWindowRateLimiter fixedWindowRateLimiter = new FixedWindowRateLimiter();
        for(int i=1;i<=LIMIT;i++){
            System.out.println("Request : " + i + " : " +fixedWindowRateLimiter.allowRequest());
        }
    }
}
