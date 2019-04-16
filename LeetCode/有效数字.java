class Solution {
    public boolean isNumber(String s) {
        if(s.matches("\\s*[+-]?[0-9]+(e[+-]?[0-9]+)?\\s*")||s.matches("\\s*[+-]?0+\\s*")
                ||s.matches("\\s*[+-]?[0-9]+\\.[0-9]*(e[+-]?[0-9]+)?\\s*")||
                s.matches("\\s*[+-]?0*\\.[0-9]*(e[+-]?[0-9]+)?\\s*")&&!s.matches("\\s*[+-]?\\.(e[+-]?[0-9]+)?\\s*"))
            return true;
        return false;
    }
}