class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];
            int a = 0;
            int b = 0;

            switch(str){

                case "*":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a*b);
                    break;

                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a/b);
                    break;

                case "+":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a+b);
                    break;

                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a-b);
                    break;

                default:
                    stack.push(Integer.parseInt(str));
            }
        }
        
        return stack.peek();
    }
}