class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            if(s.isEmpty()) { s.push(asteroids[i]); continue; }
            if(s.peek()>0 && asteroids[i]>0) s.push(asteroids[i]);

            else if(asteroids[i] < 0)
            {
               while(!s.isEmpty() && s.peek() > 0 && 
               Math.abs(asteroids[i]) > s.peek())
                s.pop();
               if(s.isEmpty() || s.peek() < 0)
                s.push(asteroids[i]);
               else if(Math.abs(asteroids[i]) == s.peek())
                s.pop();
            
            }

            else if(s.peek()<0 && asteroids[i]>0) s.push(asteroids[i]);
        }
        int[] a=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--) a[i]=s.pop();
        return a;
    }
}