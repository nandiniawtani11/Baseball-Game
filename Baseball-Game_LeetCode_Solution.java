class Solution {
    public int calPoints(String[] ops) {
        Stack<String> stack=new Stack<>();
        for(String i: ops)
        {
            if(!(i.equals("+") || i.equals("D") || i.equals("C")))
            {
                stack.push(i);
                System.out.print(stack);
            }
            else if(i.equals("+"))
            {
                stack.push(Integer.toString(Integer.parseInt(stack.peek())+Integer.parseInt(stack.get(stack.size()-2))));
                System.out.print(stack);
            }
            
            else if(i.equals("D"))
            {
                stack.push(Integer.toString(2*Integer.parseInt(stack.peek())));
            }
            else if(i.equals("C"))
            {
                stack.pop();
            }
        }
        int sum=0;
        while(!stack.isEmpty())
        {
            sum=sum + Integer.parseInt(stack.peek());
            stack.pop();
        }
        return sum;
    }
}
