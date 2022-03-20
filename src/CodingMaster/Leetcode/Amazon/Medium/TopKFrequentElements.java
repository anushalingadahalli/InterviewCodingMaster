package CodingMaster.Leetcode.Amazon.Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int[] output= new int[k];

            if (k == nums.length) {
                return nums;
            }
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
            PriorityQueue<Integer> pq=new PriorityQueue<>(
                    (a,b)-> map.get(a)-map.get(b));
            for(int entry : map.keySet()){
                pq.offer(entry);
                if(pq.size()>k){
                    pq.poll();
                }
            }
            for(int i=0;i<k;i++){
                output[i]=pq.poll();
            }
            return output;
        }

}
