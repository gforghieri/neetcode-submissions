class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c: s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    System.out.println("inner" + stack.peek());
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                System.out.println("outer" + c);
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
