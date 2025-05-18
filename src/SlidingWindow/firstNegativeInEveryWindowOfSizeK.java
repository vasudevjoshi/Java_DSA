package SlidingWindow;

public class firstNegativeInEveryWindowOfSizeK {
	static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> q = new ArrayDeque<>();
        int i = 0;
        while(i<k){
            if(arr[i]<0) q.offer(arr[i]);
            i++;
        }
        List<Integer> list = new ArrayList<>();
        int res = q.isEmpty()?0:q.peek();
        list.add(res);
        for(i = 1;i<arr.length - k+1;i++){
            if(arr[i-1]<0)
                q.poll();
            if(arr[i+k-1]<0)
                q.offer(arr[i+k-1]);
            res =  q.isEmpty()?0:q.peek();
            list.add(res);
        }
    
        return list;
    }
}
