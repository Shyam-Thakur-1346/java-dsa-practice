public class que4_maze_with_obstacle {
    public static void main(String[] args) {
        
        boolean[][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathwithobstacle("", board, 0, 0);
    }
    static void pathwithobstacle(String p,boolean[][]maze ,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathwithobstacle(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathwithobstacle(p+'R',maze,r,c+1);
        }
    }
}
