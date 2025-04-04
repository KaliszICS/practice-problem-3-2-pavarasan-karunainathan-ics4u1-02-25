public class PracticeProblem{
        static int hanoi(int num){
                return num == 1 ? 1 : 2*hanoi(num-1)+1;
        }

        static int towerOfHanoi(int num){
                /* using a function to *solve* the tower of hanoi would use bfs 
                 * instead of dfs, since the tower of hanoi can be represented
                 * as a directed unweighted graph, where the shortest must be
                 * be found, where each state is a node. recursive dfs could
                 * not solve this problem without iterative deepening, which may disconnect
                 * itself from the logic of pure recursion. here is a solution to find the 
                 * number of moves with "recursion" */
                return num < 3 ? -1 : hanoi(num); 
        }

        public static void main(String args[]){}
}
