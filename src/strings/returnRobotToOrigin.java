package strings;

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char []move = moves.toCharArray();
        for( char ch :move){
            if( ch == 'L') x = x-1;
            else if(ch =='R') x = x + 1;
            else if(ch == 'U') y = y + 1;
            else y = y -1;
        }
        if(x == 0 && y == 0) return true;
        return false;
    }
}
